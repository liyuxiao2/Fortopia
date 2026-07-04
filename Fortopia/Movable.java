import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Moving objects in the world
 * 
 * @Gisele 
 * @Jan 2024
 */
public abstract class Movable extends Actor
{
    private static int speed = 5;
    
    
    public void act()
    {
        setLocation(getX() - speed, getY());
    }
    
    /**
     * Set the speed for the animations
     */
    public static void setSpeed(int x){
        speed = x;
    }
    
    /**
     * Gets the speed for the animations
     */
    public static int getSpeed(){
        return speed;
    }
    
}
