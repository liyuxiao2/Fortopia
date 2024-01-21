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
    
    public EndBorder(){
        GreenfootImage door = new GreenfootImage("door.png");
        door.scale(50,50);
        setImage(door);
    }
}
