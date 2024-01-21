import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Obstacles here.
 * 
 *@author Gisele Huang,Liyu Xiao
 *@version January 2024
 */
public class Obstacles extends Movable
{
    private static int speed = 8;
    
    
    /**
     * Implements both the obstacles moving and checking if its touching
     * a runner
     */
    public void act()
    {
        super.act();
        checkHitBlock();
    }
    
    /**
     * Returns whether the block has hit the runner
     * 
     * @return boolean  True if the block is touching a runner
     */
    public boolean checkHitBlock () {
        Runner p = (Runner)getOneObjectAtOffset((int)speed + getImage().getWidth()/2, 0, Runner.class);
        Runner p2 = (Runner)getOneObjectAtOffset((int)speed + getImage().getWidth()/2, (getImage().getHeight())/2, Runner.class);
        Runner p3 = (Runner)getOneObjectAtOffset((int)speed + getImage().getWidth()/2, -((getImage().getHeight())/2), Runner.class);
        
        ArrayList <Runner> runner = new ArrayList<>();
        
        runner.add(p);
        runner.add(p2);
        runner.add(p3);
        
        for(Runner x : runner){
            if ((x != null))
            {
                
                return true;
            }
        }
        return false;
    }
    
}
