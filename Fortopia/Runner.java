import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * 
 * 
 * 
 * @authors Liyu Xiao, Wendy Luo
 * @version January 2024
 */
public class Runner extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    private boolean jumping;
    private int jumpStrength = 16;
    private int speed = 4;
    private int direction = 1; // 1 = right and -1 = left

    //load the runner images for animation
    private GreenfootImage run1;
    private GreenfootImage run2;
    private GreenfootImage run3;
    private GreenfootImage run4;
    private int frame = 1;
    private int animationCounter = 0;
    private long keyPressedTime;
    
    
    
    private GameWorld world = (GameWorld)getWorld();

    
    public Runner(int level) {
        run1 = new GreenfootImage(level + "runr1.png");
        run2 = new GreenfootImage(level + "runr2.png");
        run3 = new GreenfootImage(level + "runr3.png");
        run4 = new GreenfootImage(level + "runr4.png");
    }

    /**
     * Here you can tell your actor what he has to do.
     */
    public void act() {
        pushBack();
        endGame();
        checkKey();
        checkOnPlatforms();
        fall();
        animate();
        moveR();
        checkBlockPlayer();
        checkDoorPlayer();
    }

    public void checkKey()
    {
        if (Greenfoot.isKeyDown("space") && !jumping) {
            if (keyPressedTime == 0) {
                //key pressed
                keyPressedTime = System.currentTimeMillis();
            } else {
                // as key is held down, get time
                long elapsedTime = System.currentTimeMillis() - keyPressedTime;
                // adjust jump height according to time for power space jump
                int jumpHeight = calculateJumpHeight(elapsedTime);
                jump(jumpHeight);
            }
        } else if (!Greenfoot.isKeyDown("space") && jumping) {
            // key is now released, reset timer
            keyPressedTime = 0;
            jumping = false;
        }
    }


    public void moveR(){
        if(animationCounter % 4 == 0)
        {
            animateR();
        }
    }

    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <=9)
        {
            vSpeed = vSpeed + acceleration;
        }
        jumping = true;

        Actor ground = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        if (ground != null) {
            vSpeed = 0; // Reset vertical speed
            jumping = false; // Set jumping state to false
        }

        Block p = (Block)getOneObjectAtOffset(0, getImage().getHeight()/2+1, Block.class);
        Block p2 = (Block)getOneObjectAtOffset((getImage().getWidth()/2)+1, ((getImage().getHeight())/2)+1, Block.class);
        Block p3 = (Block)getOneObjectAtOffset(-getImage().getWidth()/2, ((getImage().getHeight())/2) + 1, Block.class);
        Block p4 = (Block)getOneObjectAtOffset(0, -(getImage().getHeight())/2, Block.class);
        Block p5 = (Block)getOneObjectAtOffset((getImage().getWidth()/2) + 1, -(getImage().getHeight())/2, Block.class);
        Block p6 = (Block)getOneObjectAtOffset(-getImage().getWidth()/2, -(getImage().getHeight())/2, Block.class);
        
        ArrayList <Block> blocks = new ArrayList<>();
        blocks.add(p);
        blocks.add(p2);
        blocks.add(p3);
        blocks.add(p4);
        blocks.add(p5);
        blocks.add(p6);
        for(Block x: blocks){
            if(x != null){
                vSpeed = 0;
                jumping = false;
            }
        }

    }

    
    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("space")) {
            if (keyPressedTime == 0) {
                // Key has just been pressed
                keyPressedTime = System.currentTimeMillis();
            } else {
                // Key is still held down, calculate how long it's been held
                long elapsedTime = System.currentTimeMillis() - keyPressedTime;
                System.out.println("Time held down: " + elapsedTime + " milliseconds");
            }
        } else {
            // Key is not pressed, reset the timer
            keyPressedTime = 0;
        }
    }
    
    
    /**
     * Checks how long the player has been jumping
     * 
     * 
     * @param elapsedTime:  How long the user has been holding down the space bar key
     * 
     * @return int:         returns the final jump height depending on how long the user has been holding down
     *                      space bar
     */
    private int calculateJumpHeight(long elapsedTime) {
        // Adjust this function based on how you want the jump height to change over time
        // This is just a basic example, you can use a formula or lookspace table for more control
        int maxJumpHeight = 300; // can be adjusted if higher jumps needed
        int jumpDuration = 3000; // 3 seconds

        double ratio = Math.min(1.0, (double) elapsedTime / jumpDuration);
        return (int) (maxJumpHeight * ratio);
    }

    public void jump(int jumpHeight){
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        // Check for collisions with Ground
    }

    public void animateR(){
        if(frame == 1)
        {
            setImage(run1);
        }
        else if(frame == 2)
        {
            setImage(run2);
        }
        else if(frame == 3)
        {
            setImage(run3);
        }
        else if(frame == 4)
        {
            setImage(run4);
            frame = 1;
            return;
        }
        frame++;
    }

    //runner falling down after jumping
    public void animate() {
        // Add any additional animation logic here
        animationCounter++;

        if(Greenfoot.isKeyDown("space")) {
            setLocation(getX(), getY() - 3);
        }
    }
    
    /**
     * 
     */
    public void checkBlockPlayer(){
        while(checkHitBlock()){
            setLocation(getX()-Obstacles.getSpeed(), getY());
        }
    }
    
    public boolean checkHitBlock () {
        Block p = (Block)getOneObjectAtOffset((int)speed + getImage().getWidth()/2, 0, Block.class);
        Block p2 = (Block)getOneObjectAtOffset((int)speed + getImage().getWidth()/2, ((getImage().getHeight())/2)-10, Block.class);
        
        
        ArrayList <Block> peds = new ArrayList<>();
        
        peds.add(p);
        peds.add(p2);
        
        for(Block x : peds){
            if ((x != null))
            {//stops bus from moving

                return true;
            }
        }
        return false;
    }
    
    public void checkOnPlatforms(){
        //check if the player is on the platform
        if(onPlatforms()==false)// if not on Platforms enable gravity().
        {fall();
        }
        //need to reset the vSpeed because it would increase to infinite doing multiple jumps.
        else
        vSpeed=0;
    }
    
    
    protected boolean onPlatforms()
    {                                   //Width= 0 (X) ,Height/2 (Y)- getImage().getHeight()/2, applying to the class Platforms
        Actor onPlatform = getOneObjectAtOffset(0,getImage().getHeight()/2,Platforms.class);
        return onPlatform !=null; // returns only if diffent from null
    }
    
    
    
    public void checkDoorPlayer(){
        if(this.isTouching(EndBorder.class)){
            Greenfoot.stop();
        }
    }
    

    
    public void pushBack(){
        if(getX() != 300){
            setLocation(getX()+1, getY());
        }
    }
    
    
    public void endGame(){
        if(this.getX() < 0){
            Greenfoot.stop();
        }
    }
}