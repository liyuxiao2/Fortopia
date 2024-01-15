import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This subclass is just an example. You can delete it or change the code if you want.
 * It's not necessary for the scrolling system.
 */


public class ExampleWorld extends ScrollingWorld
{
    /**
     *   20 20 20 20 20 20
     * {{1,2,0,0,0,0,0}
     */
    public ExampleWorld() {
        super(600, 400, 1);//creates an infinite scrolling world with a screen size of 600 x 400;
        //if you want to limitate the scrolling world you have to use this constructor:
        //super(600, 400, 1, scrollingWidth, scrollingHeight);
        setScrollingBackground(new GreenfootImage("weave.jpg"));

        createGameWorld();//this method just adds some objects to the world.
    }
    
    /**
     * Creates an example world where the ScrollingActor can move.
     */
    public void createGameWorld() {
        for (int x = getWidth() * -3; x < getWidth() * 3; x += getWidth()/2) {
            for (int y = getHeight() * -3; y < getHeight() * 3; y += getHeight()/2) {
                if (x != getWidth()/2 || y != getHeight()/2) {
                    addObject(new Ground(), 1000,500);
                }
            }
        }
        
        addObject(new Runner(), 300, 300);
        
    }
}