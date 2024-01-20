import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseWorld extends World
{
    private GameWorld game;
    private Button returnToGame;
    
    /**
     * Constructor for objects of class PauseWorld.
     * 
     */
    public PauseWorld(GameWorld gw)
    {
        super(1000, 700, 1); 
        game = gw;
        returnToGame = new Button();
        addObject(returnToGame, 240, 450);
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(returnToGame)){
            Greenfoot.setWorld(game);
        }
        //go back to game from pause world
    }
}
