import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoryWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryWorld extends World
{
    private int storyFrame = 1;
    Button next = new Button();
    
    /**
     * Constructor for objects of class StoryWorld.
     * 
     */
    public StoryWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
    }
    
    public void act(){
        frames();
    }
    
    public void frames(){
        if(storyFrame == 1){
            //setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(next, 699, 600);
        } else if(storyFrame == 2){
            addObject(next, 699, 600);
        } else if(storyFrame == 3){
            addObject(next, 699, 600);
        } else if(storyFrame == 4){
            addObject(next, 699, 600);
        } else if(storyFrame == 5){
            addObject(next, 699, 600);
        } else if(storyFrame == 6){
            addObject(next, 699, 600);
        } else if(storyFrame == 7){
            addObject(next, 699, 600);
        } else if(storyFrame == 8){
            addObject(next, 699, 600);
        } else if(storyFrame == 9){
            Greenfoot.setWorld(new GameWorld());
        }
    }
}
