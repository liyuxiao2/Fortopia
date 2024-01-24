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
    private GreenfootImage image;
    
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
        if(storyFrame < 4 && Greenfoot.mouseClicked(next)){
            storyFrame++;
        } else if(storyFrame == 4 && Greenfoot.mouseClicked(next)) {
            storyFrame++;
        } else if(storyFrame == 5 && Greenfoot.mouseClicked(next)) {
            storyFrame++;
        } else if(storyFrame == 6) {
            storyFrame++;
        }
    }
    
    public void frames(){
        if(storyFrame == 1){
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(next, 850, 600);
        } else if(storyFrame == 2){
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(next, 850, 600);
        } else if(storyFrame == 3){
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(next, 850, 600);
        } else if(storyFrame == 4){
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(next, 850, 600);
        } else if(storyFrame == 5){
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(next, 850, 600);
        } else if(storyFrame == 6){
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(next, 850, 600);
        } else if(storyFrame == 7){
            Greenfoot.setWorld(new Menu());
        }
    }
}
