import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends Background
{
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
