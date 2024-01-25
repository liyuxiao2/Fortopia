import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * WelcomeWorld is a Greenfoot World that welcomes players to the game  
 * 
 * @Natalie Huang
 * @January 2024
 */
public class WelcomeWorld extends World
{
    Button next = new Button();
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
