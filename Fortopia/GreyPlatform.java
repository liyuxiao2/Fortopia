import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreyPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreyPlatform extends MovingPlatforms
{
    private GreenfootImage platform;
    
    public void act()
    {
        movingPlatforms(111.111);
    }
    public GreyPlatform(int level)
    {
        platformSize();
        platform = new GreenfootImage("platform" + level + ".png");
        setImage(platform);
    }
    
}
