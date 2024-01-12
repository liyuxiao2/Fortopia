import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The land is the surface where the runner can move on
 * 
 * @Wendy Luo
 * @01/11/2023
 */
public class Land extends Actor
{
    public void act()
    {
        
    }
    public Land()
    {
        GreenfootImage platform = new GreenfootImage("box.png");
        GreenfootImage image = new GreenfootImage(2000, platform.getHeight());
        int w=platform.getWidth();
        for (int offset=0; offset<1040; offset+=w) image.drawImage(platform, offset, 0);
        setImage(image);
    }
}
