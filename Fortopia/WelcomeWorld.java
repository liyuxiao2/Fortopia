import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelcomeWorld here.
 * 
 * @Natalie 
 * @version (a version number or a date)
 */
public class WelcomeWorld extends World
{
    Button next = new Button();
    
    /**
     * Constructor for objects of class WelcomeWorld.
     * 
     */
    public WelcomeWorld()
    {    
        super(1000, 700, 1); 
        addObject(next, 640, 470);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(next)){
            Greenfoot.setWorld(new StoryWorld());
        }
    }
}
