import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ending door at the end of each level
 * 
 * @Liyu Xiao (your name) 
 * @Jan 2024
 */
public class EndBorder extends Movable
{
    
    public void act()
    {
        super.act();
    }
    
    /**
     * Shows door image
     * 
     * @param level   door image will appear in each level
     * @return int    level number
     */
    public EndBorder(int level){
        GreenfootImage door = new GreenfootImage("door.png");
        setImage(door);
    }
}
