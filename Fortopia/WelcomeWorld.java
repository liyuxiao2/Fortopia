import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelcomeWorld here.
 * 
 * @Natalie Huang
 * @January 2024
 */
public class WelcomeWorld extends World
{
    Button next = new Button();
    
    private GreenfootImage image;
    
    /**
     * Constructor for objects of class WelcomeWorld.
     * 
     */
    public WelcomeWorld()
    {
        super(1000, 700, 1);
        image = new GreenfootImage("Fortopia.jpg");
        image.scale(1000,700);
        setBackground(image);
        addObject(next, 640, 470);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(next)){
            Greenfoot.setWorld(new StoryWorld());
        }
    }
}
