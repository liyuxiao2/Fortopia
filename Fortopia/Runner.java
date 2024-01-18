import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is just an example. You can delete it or change the code.
 * It's not necessary for the scrolling system.
 * @Wendy Luo, Liyu Xiao
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
    private GreenfootImage run1r = new GreenfootImage("run1r.png");
    private GreenfootImage run2r = new GreenfootImage("run2r.png");
    private GreenfootImage run3r = new GreenfootImage("run3r.png");
    private GreenfootImage run4r = new GreenfootImage("run4r.png");
    private GreenfootImage run1l = new GreenfootImage("run1l.png");
    private GreenfootImage run2l = new GreenfootImage("run2l.png");
    private GreenfootImage run3l = new GreenfootImage("run3l.png");
    private GreenfootImage run4l = new GreenfootImage("run4l.png");
    private int frame = 1;
    private int animationCounter = 0;
    private long keyPressedTime;


    
    public Runner() {

    }

    /**
     * Here you can tell your actor what he has to do.
     */
    public void act() {
        checkKey();
        fall();
        animate();
        moveR();
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
        /**old jump key
         * if(Greenfoot.isKeyDown("space") && jumping == false)
        {
        jump();
        if(checkKeyPress()
        } */
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

        Block block = (Block)getOneObjectAtOffset(0, getImage().getHeight() / 2, Block.class);
        if (block != null) {
            vSpeed = 0; // Reset vertical speed
            jumping = false; // Set jumping state to false
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
            setImage(run1r);
        }
        else if(frame == 2)
        {
            setImage(run2r);
        }
        else if(frame == 3)
        {
            setImage(run3r);
        }
        else if(frame == 4)
        {
            setImage(run4r);
            frame = 1;
            return;
        }
        frame++;
    }

    public void animateL(){
        if(frame == 1)
        {
            setImage(run1l);
        }
        else if(frame == 2)
        {
            setImage(run2l);
        }
        else if(frame == 3)
        {
            setImage(run3l);
        }
        else if(frame == 4)
        {
            setImage(run4l);
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

}