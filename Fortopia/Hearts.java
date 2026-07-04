import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player collects hearts to gain a life
 * 
 * @Wendy Luo
 * @Jan 2024
 */
public class Hearts extends Consumables
{
    private static int collected = 3;

    /**
     * will remove hearts if touched
     */
    public void act()
    {
        super.act();
        remove();
    }
    
    /**
     * different level means different image for hearts
     * 
     * @param level   different level means different image
     * @return int    level number
     */
    public Hearts(int level){
        collected = 3;
        setImage("heart" + level + ".png");
    }
    
    /**
     * Will remove the heart when player touches it
     */
    public void remove(){
        if(isTouching(Runner.class)){
            GameWorld gw = (GameWorld)getWorld();
            gw.removeObject(this);
            collected++;
        }
    }
    
    /**
     * will gather hearts and return collected
     */
    public static int getHearts(){
        return collected;
    }
    
    /**
     * if hit, hearts will minus by 1
     */
    public static void removeHearts(){
        collected -= 1;
    }
    
    public static void setHearts(int x){
        collected = x;
    }
}
