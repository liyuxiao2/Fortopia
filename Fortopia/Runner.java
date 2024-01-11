import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner extends Actor
{
    final int jSpeed = 20; // the initial 'jump' speed
    int ySpeed = 0, xSpeed = 0; // the initial vertical and horizontal speeds
    boolean aboutFace; // the direction (left or right) the actor is facing
    boolean onGround; // the state of the actor being set on an object
    
    public void act()
    {
        getDirection();
        move();
    }

    /**
     * Moves the actor with appropriate image.  Checks for obstacles and adjusts
     * the position of the actor accordingly.
     */
    private void move()
    {
        ySpeed++; // adds gravity
        if (xSpeed != 0 && onGround) xSpeed += aboutFace ? 1 : -1; // add friction
        setLocation(getX()+xSpeed/10, getY()+ySpeed/2);
        // check for change in horizontal direction
        if ((xSpeed > 0 && aboutFace) || (xSpeed < 0 && !aboutFace)) 
        {
            getImage().mirrorHorizontally();
            aboutFace = !aboutFace;
        }
        
        // check for obstacles
        onGround = false; // initialize value
        // check below the actor
        while (getOneObjectAtOffset(0, getImage().getHeight()/2+1, Actor.class) != null)
        {
            setLocation(getX(), getY()-1); 
            onGround = true; 
            ySpeed = 0;
        }
        // check above the actor
        while (getOneObjectAtOffset(0, -getImage().getHeight()/2-1, Actor.class) != null) 
        {
            setLocation(getX(), getY()+1);
            ySpeed = 0;
        }
        // check to right of actor
        while (getOneObjectAtOffset(getImage().getWidth()/2+1, 0, Actor.class) != null)
        {
            setLocation(getX()-1, getY());
            xSpeed = 0;
        }
        // check to left of actor
        while (getOneObjectAtOffset(-getImage().getWidth()/2-1, 0, Actor.class) != null)
        {
            setLocation(getX()+1, getY());
            xSpeed = 0;
        }
    }
    
    /**
     * Determines any changes in horizontal and vertical speeds for the actor.
     */
    private void getDirection()
    {
        // if (!onGround) return; // if not mid-air changes allowed
        // sets requested direction of move, or continues in current direction
        if (Greenfoot.isKeyDown("left") && xSpeed > -50) xSpeed -= 2; // check left
        if (Greenfoot.isKeyDown("right") && xSpeed < 50) xSpeed += 2; // check right
        if (Greenfoot.isKeyDown("up") && onGround) // check jump
        {
            ySpeed -= jSpeed; // add jump speed

        }
    }
}