import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coins here.
 * 
 * @Wendy Luo
 * @version (a version number or a date)
 */
public class Coins extends Consumables
{
    static int collected =0;
    int speed = 5;
    public void act()
    {
        moveAround();
        remove();
    }
    public void moveAround(){
        setLocation(getX() - speed, getY());
    }
    public void remove(){
        if(isTouching(Runner.class)){
            GameWorld gw = (GameWorld)getWorld();
            gw.removeObject(this);
            collected++;
        }
    }
    
}
