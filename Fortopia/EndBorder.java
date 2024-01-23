import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndBorder here.
 * 
 * @Liyu Xiao (your name) 
 * @version (a version number or a date)
 */
public class EndBorder extends Movable
{
    
    public void act()
    {
        super.act();
    }
    
    public EndBorder(int level){
        GreenfootImage door = new GreenfootImage("door.png");
        setImage(door);
    }
}
