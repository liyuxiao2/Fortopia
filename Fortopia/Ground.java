import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;
import greenfoot.Actor;
/**
 * Ground is a Greenfoot Actor that creates the ground of our game
 * which is the surface the players run on
 * 
 * all graphics credit to : Gisele Huang
 * @author Gisele Huang 
 * @version 01/24/2024
 */
public class Ground extends Obstacles
{
    /**
     * Creates the ground graphics according the world level
     * @param level What wolrd level we are dealing with 
     */
    public Ground(int level){
        GreenfootImage road = new GreenfootImage("ground" + level + ".png");
        GreenfootImage image = new GreenfootImage(1040, road.getHeight());
        int w=road.getWidth();
        for (int offset=0; offset<2*1040; offset+=w) {
            image.drawImage(road, offset, 0);
        }
        setImage(image);
    }
}
