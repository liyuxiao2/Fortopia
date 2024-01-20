import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreyPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreyPlatform extends MovingPlatforms
{
    /**
     * Act - do whatever the GreyPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movingPlatforms(111.111);
    }
    public GreyPlatform()
    {
        platformSize();
        //setImage("platform.png");
        //setImage.scale(50,50);
    }
    
}
