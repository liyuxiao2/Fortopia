import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * UpsideDownSpike is a Greenfoot Actor that is under obstacles and 
 * sets the grahics of other spikes for different world level
 * 
 * all graphics credit to : Gisele Huang
 *@author Gisele Huang
 *@version January 2024
 */
public class UpsideDownSpike extends Obstacles
{
    /**
     * sets the image for the UpsideDownSpike for different worlds 
     * @param level For what world level we are dealing with
     */
    public UpsideDownSpike(int level){
        
        GreenfootImage spike = new GreenfootImage("spike" + level + ".png");
        
        spike.rotate(180);
        
        setImage(spike);
    }
    public void act()
    {
        super.act();
    }
    
    
}
