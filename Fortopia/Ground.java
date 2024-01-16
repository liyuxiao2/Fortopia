import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;
import greenfoot.Actor;
/**
 * Write a description of class Ground here.
 * 
 * @danpost
 * MODIFIED BY Natalie
 * @version (a version number or a date)
 */
public class Ground extends Obstacles
{
    //private int unitWidth, imageWidth, worldWidth;
    public Ground(){
        GreenfootImage road = new GreenfootImage("road.jpg");
        GreenfootImage image = new GreenfootImage(1040, road.getHeight());
        int w = road.getWidth();
        for (int offset = 0; offset < 1040; offset += w) {
            image.drawImage(road, offset, 0);
        }
        setImage(image);
    }
    
    /**
     * public void addedToWorld(World world){
        worldWidth = world.getWidth();
        GreenfootImage unit = getImage();
        unitWidth = unit.getWidth();
        imageWidth = (worldWidth/unitWidth+5)*unitWidth;
        GreenfootImage image = new GreenfootImage(imageWidth, unit.getHeight());
        for (int i=0; i<imageWidth; i+=unitWidth) image.drawImage(unit, i, 0);
        setImage(image);
    }
    
    public void act(){
        if (getX() < -(imageWidth/2+unitWidth*3)) setLocation(getX()+2*imageWidth, getY());
        if (getX() > worldWidth+(imageWidth/2+unitWidth*3)) setLocation(getX()-2*imageWidth, getY());
    }
     */
}

