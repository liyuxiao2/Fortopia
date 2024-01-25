import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Grass graphics in the background
 * 
 * @Gisele Huang
 * @Jan 2024
 */
public class Trees extends Background
{
    /**
     * The trees background graphics
     * 
     * @param level   the level the player is at
     * @return int    level number
     */
    public Trees(int level)
    {
        image = new GreenfootImage("trees" + level + ".png");
        image.setTransparency(150);
        scrollSpeed = 3;
        setImage(image);
    }
    public Trees()
    {
        image = new GreenfootImage("menutrees.png");
        scrollSpeed = 3;
        setImage(image);
    }
}
