import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;
import greenfoot.Actor;
/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    public Ground(){
        GreenfootImage road = new GreenfootImage("ground.png");
        GreenfootImage image = new GreenfootImage(1040, road.getHeight());
        int w=road.getWidth();
        for (int offset=0; offset<2*1040; offset+=w) {
            image.drawImage(road, offset, 0);
        }
        setImage(image);
    }
}

