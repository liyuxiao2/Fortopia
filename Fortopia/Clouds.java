import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clouds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clouds extends Background
{
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
