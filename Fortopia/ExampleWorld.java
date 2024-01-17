import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This subclass is just an example. You can delete it or change the code if you want.
 * It's not necessary for the scrolling system.
 */


public class ExampleWorld extends ScrollingWorld
{
    int count = 0;
    Counter counter = new Counter();
    public void act(){
        count++;
    }
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
        int groundWidth = 1040; // Width of the ground image
        int groundHeight = new Ground().getImage().getHeight(); // Height of the ground image
        int numGroundInstances = getWidth() / groundWidth + 2;
         for (int i = 0; i < numGroundInstances; i++) {
            addObject(new Ground(), i * groundWidth, getHeight() - groundHeight / 2);
        }
        
        addObject(new Runner(), getWidth()/2, getHeight()/2);
        addObject(new Ground(), 1000,500);
        
    }
}