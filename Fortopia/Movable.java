import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Movable extends Actor
{
    private static int speed = 8;
    
    
    public void act()
    {
        setLocation(getX() - speed, getY());
    }
    
    public static void setSpeed(int x){
        speed = x;
    }
    
    public static int getSpeed(){
        return speed;
    }
    
}
