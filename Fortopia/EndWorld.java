import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndWorld here.
 * 
 * @Natalie 
 * @version (a version number or a date)
 */
public class EndWorld extends World
{
    private Button startOver;
    private GreenfootImage background;
    
    /**
     * Constructor for objects of class EndWorld.
     * 
     */
    public EndWorld(GreenfootImage background)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        startOver = new Button();
        this.background = background;
        setBackground(background);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(startOver)){
            Greenfoot.setWorld(new Menu());
        }
    }
}
