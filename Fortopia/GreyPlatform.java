import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreyPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreyPlatform extends MovingPlatforms
{
    private GreenfootImage platform = new GreenfootImage("platform.png");
    
    public void act()
    {
        setImage(platform);
        movingPlatforms(111.111);
    }
    public GreyPlatform()
    {
        platformSize();
        setImage("platform.png");
        //setImage.scale(50,50);
    }
    
}
