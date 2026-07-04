import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The coins that the player will collect
 * 
 * @Wendy Luo
 * @Jan 2024
 */
public class Coins extends Consumables
{
    static int collected;
    
    /**
     * Coins constructor
     * 
     * @param level   depends on the level the player is at
     * @return int    level number
     */
    public Coins(){
        
    }
    
    public void act()
    {
        super.act();
        remove();
    }
    
    /**
     * When the player touches the coin, it disappears
     * and adds to the counter 
     */
    public void remove(){
        if(isTouching(Runner.class)){
            GameWorld gw = (GameWorld)getWorld();
            gw.removeObject(this);
            collected++;
            
        }
    }
    
    /**
     * returns the collected coins
     */
    public static int getCoins(){
        return collected;
    }
    
    //sets the value of the coin
    public static void setCoins(int x){
        collected = x;
    }
}
