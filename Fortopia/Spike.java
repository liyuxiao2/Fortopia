import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spike here.
 * 
 *@author Gisele Huang
 *@version January 2024
 */
public class Spike extends Obstacles
{
    public Spike()
    {
        setImage("spike.png");
    }
    public void act()
    {
        super.act();
        Runner runner = (Runner)getOneIntersectingObject(Runner.class);//change to offset later
        if(runner != null)
        {
            //runner.subtractLife();
        }
    }
}
