import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Grass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trees extends Background
{
    public Trees(int level)
    {
        image = new GreenfootImage("trees" + level + ".png");
        image.setTransparency(150);
        scrollSpeed = 3;
        setImage(image);
    }
}
