import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreyPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreyPlatform extends MovingPlatforms
{
    private GreenfootImage platform = new GreenfootImage("wood.png");
    
    public void act(int level)
    {
        setImage(platform);
        movingPlatforms(111.111);
    }
    public GreyPlatform()
    {
        platformSize();
        setImage("wood.png");
    }
    
}
