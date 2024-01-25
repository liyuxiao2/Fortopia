import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Shows the background for each world
 * 
 * @Gisele Huang 
 * @Jan 2024
 */
public abstract class Background extends Actor
{
    protected GreenfootImage image;
    protected int scrollSpeed;
    public void act()
    {
        scroll();
    }
    
    /**
     * Makes the world scroll
     */
    protected void scroll()
    {
        setLocation(getX() - scrollSpeed, getY());
        if (getX() + getImage().getWidth() / 2 <= 0) {
            // Reset its position to the end of the other instance
            setLocation(getX() + 2 * getImage().getWidth() - scrollSpeed, getY());
        }
    }
}
