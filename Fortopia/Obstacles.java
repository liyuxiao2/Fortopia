import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Obstacles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacles extends Actor
{
    /**
     * Act - do whatever the Obstacles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 10;
    public void act()
    {
        setLocation(getX() - speed, getY());
        checkHitBlock();
        if(checkHitBlock()){
            //gameOver();
        }
    }
    
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
