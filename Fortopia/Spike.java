import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Spike is a Greenfoot Actor that hold the graphics of the obstacle spike
 * 
 * all graphics credit to : Gisele Huang
 *@author Gisele Huang
 *@version 01/24/2024
 */
public class Spike extends Obstacles
{
    /**
     * Sets the graphics for the spikes according to the world level
     * @param level For what world level we are dealing with
     */
    public Spike(int level)
    {
        setImage("spike" + level + ".png");
    }

    public void act()
    {
        super.act();
    }

}
