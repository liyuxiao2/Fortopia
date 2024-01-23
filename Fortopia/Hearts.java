import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hearts here.
 * 
 * @Wendy Luo
 * @version (a version number or a date)
 */
public class Hearts extends Consumables
{
    private static int collected =0;

    public void act()
    {
        super.act();
        remove();
    }
    
    public Hearts(int level){
        setImage("heart" + level + ".png");
    }
    
    public void remove(){
        if(isTouching(Runner.class)){
            GameWorld gw = (GameWorld)getWorld();
            gw.removeObject(this);
            collected++;
        }
    }
    
    public static int getHearts(){
        return collected;
    }
}
