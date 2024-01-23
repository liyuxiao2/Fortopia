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
    
    
    public Coins(int level){
        setImage("coin" + level + ".png");
    }
    
    public void act()
    {
        super.act();
        remove();
    }
    
    
    public void remove(){
        if(isTouching(Runner.class)){
            GameWorld gw = (GameWorld)getWorld();
            gw.removeObject(this);
            collected++;
            
        }
    }
    
    
    public static int getCoins(){
        return collected;
    }
    
    
}
