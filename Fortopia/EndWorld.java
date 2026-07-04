
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * EndWorld is a Greenfoot World that players will be taken to as the game ends
 * All graphics credit to Gisele Huang
 * @Natalie Huang
 * @01/24/2024
 */
public class EndWorld extends World
{
    private Button startOver;
    private GreenfootImage background;
    
    /**
     * Constructor for objects of class EndWorld.
     * adds the background and buttons to the endworld
     */
    public EndWorld(GreenfootImage background)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        startOver = new Button();
        this.background = background;
        setBackground(background);
    }
    //allows menuworld to pop up again if needed 
    public void act(){
        if(Greenfoot.mouseClicked(startOver)){

            Greenfoot.setWorld(new Menu());

        }
    }
}
