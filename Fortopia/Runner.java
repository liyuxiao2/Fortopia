import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is just an example. You can delete it or change the code.
 * It's not necessary for the scrolling system.
 */
public class Runner extends ScrollingActor
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

    


    
    public Runner() {
        
    }

    /**
     * Here you can tell your actor what he has to do.
     */
    public void act() {
        checkKey();
        if(jumping){
            fall();
        }
        animate();
        /**if (Greenfoot.isKeyDown("up")) {
        setLocation(getX(), getY() - 3);
        }
        if (Greenfoot.isKeyDown("down")) {
        setLocation(getX(), getY() + 3);
        }
        if (Greenfoot.isKeyDown("left")) {
        setLocation(getX() - 3, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
        setLocation(getX() + 3, getY());
        }
         */
    }

    public void checkKey()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            direction = 1;
            moveR();
        }
        if(Greenfoot.isKeyDown("left"))
        {
            direction = -1;
            moveL();
        }
        if(Greenfoot.isKeyDown("up") && jumping == false)
        {
            jump();
        }
    }

    public void moveR(){
        setLocation(getX()+speed, getY());
        if(animationCounter % 4 == 0)
        {
            animateR();
        }
    }

    public void moveL(){
        setLocation(getX()-speed, getY());
        if(animationCounter %4 == 0)
        {
            animateL();
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
    }

    public void jump(){
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        // Check for collisions with Ground
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        if (ground != null) {
            vSpeed = 0; // Reset vertical speed
            jumping = false; // Set jumping state to false
        }
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

        if(Greenfoot.isKeyDown("up")) {
                setLocation(getX(), getY() - 3);
        }
        if (Greenfoot.isKeyDown("left")) {
                setLocation(getX() - 3, getY());
        }
            if (Greenfoot.isKeyDown("right")) {
                setLocation(getX() + 3, getY());
            }
        }

}