import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Background extends Actor
{
    protected GreenfootImage image;
    protected int scrollSpeed;
    public void act()
    {
        scroll();
    }
    protected void scroll()
    {
        setLocation(getX() - scrollSpeed, getY());
        if (getX() + getImage().getWidth() / 2 <= 0) {
            // Reset its position to the end of the other instance
            setLocation(getX() + 2 * getImage().getWidth() - scrollSpeed, getY());
        }
    }
}
