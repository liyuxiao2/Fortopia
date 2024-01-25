import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The sky background that scrolls in the world
 * 
 * @Gisele 
 * @Jan 2024
 */
public class Sky extends Background
{
    /**
     * Different sky background for different levels
     * 
     * @param level   the level the player is at
     * @return int    level number
     */
    public Sky(int level)
    {
        image = new GreenfootImage("sky" + level + ".png");
        scrollSpeed = 1;
        setImage(image);
    }
    public Sky()
    {
        image = new GreenfootImage("menusky.png");
        scrollSpeed = 1;
        setImage(image);
    }
}
