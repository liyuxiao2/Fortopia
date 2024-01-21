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
        image = new GreenfootImage("clouds1.png");
        scrollSpeed = 2;
        setImage(image);
    }
}
