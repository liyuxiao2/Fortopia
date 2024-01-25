import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Block is a Greenfoot Actor that has the image of the blocks set
 * 
 *all graphics credit to : Gisele Huang
 *@author Gisele Huang
 *@version January 2024
 */
public class Block extends Obstacles
{
    /**
     * Sets the graphics of the blocks according the world level
     * @param level For which world level we are dealinf with
     */
    public Block(int level)
    {
        setImage("block" + level + ".png");

    }

    public void act()
    {
        super.act();
    }
}
