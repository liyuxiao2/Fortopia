import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clouds background for the graphics
 * 
 * @Gisele
 * @Jan 2024
 */
public class Clouds extends Background
{
    /**
     * Different cloud images and makes them scroll
     * 
     * @param level   different level means different cloud image
     * @return int    level number
     */
    public Clouds(int level)
    {
        image = new GreenfootImage("clouds" + level + ".png");
        image.setTransparency(200);
        scrollSpeed = 2;
        setImage(image);
    }
    public Clouds()
    {
        image = new GreenfootImage("menuclouds.png");
        scrollSpeed = 2;
        setImage(image);
    }
}
