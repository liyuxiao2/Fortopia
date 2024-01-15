import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends ScrollingWorld
{
    public MyWorld()
    {    
        // a new world of dimensions of 1024 by 700 is created.
        // last parameter is for scroll width
        super(700, 700, 1,1244); 
        // in the following statement, the main actor is placed in the center of the window
        setMainActor(new Runner(), 250, 300); // the int parameters are centered window x and y ranges
        // to start the main actor elsewhere
        //mainActor.setLocation(100, 342);
        // adding other objects that are also scrolling
        GreenfootImage bg = new GreenfootImage("scene.jpg");
        setScrollingBackground(bg); // set the scolling background image
        addObject(new Land(), 1000,690);
    }
}
