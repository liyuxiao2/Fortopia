import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * 
 *@author Gisele Huang
 *@version January 2024
 */
public class UpsideDownSpike extends Obstacles
{
    /**
     * Act - do whatever the UpsideDownSpike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public UpsideDownSpike(){
        
        GreenfootImage spike = new GreenfootImage("spike.png");
        
        spike.rotate(180);
        
        setImage(spike);
    }
    public void act()
    {
        super.act();
    }
    
    
}
