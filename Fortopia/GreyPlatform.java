import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Different moving platform
 * 
 * @Wendy
 * @Jan 2024
 */
public class GreyPlatform extends MovingPlatforms
{
    private GreenfootImage platform;
    
    /**
     * Moving the grey platform
     */
    public void act()
    {
        movingPlatforms(111.111);
    }
    
    /**
     * Different image for different level 
     * 
     * @param level   different picture for different level
     * @return int    level number
     */
    public GreyPlatform(int level)
    {
        platformSize();
        platform = new GreenfootImage("platform" + level + ".png");
        setImage(platform);
    }
    
}

