import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spike extends Obstacles
{
    public Spike()
    {
        setImage("spike.png");
    }
    public void act()
    {
        Runner runner = (Runner)getOneIntersectingObject(Runner.class);//change to offset later
        if(runner != null)
        {
            //runner.subtractLife();
        }
    }
}
