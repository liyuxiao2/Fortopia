import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pauseworld is a Greenfoot World that players will see if they pause the game
 * 
 * @Natalie Huang
 * @version : 01/24/2024
 */
public class PauseWorld extends World
{
    private GameWorld game;
    private Button returnToGame;
    
    /**
     * Constructor for objects of class PauseWorld.
     * @param gw stops the gameworld
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
