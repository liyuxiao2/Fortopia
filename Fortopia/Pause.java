import greenfoot.*;

/**
  * <h1>Class Pause</h1>
  * <b>This class can be used as a support class to <i>visually</i> (and truly) 'pause' a scenario.</b><br><br>
  * <p>This world copies onto its background image the background of the world supplied and the images of all its actors as they
  * currently appear.  If the world supplied was the active world, then not only is the state of the world paused due to changing
  * worlds, but it will visually appear to be paused, even though a different world (this world) is active.  You can either 
  * modify the 'act' method in this class or override it in a sub-class of the Pause class.</p>
  * @Gisele Huang, Liyu Xiao
  * @version : 01/24/2024
  */
public class Pause extends World
{
    /** 
     * Field firstWorld is used to hold a reference to the calling world (which is the same as the world to return to and the 
     * world whose visual state is to be duplicated).
     */
    private World firstWorld;
    
    /**
     * Creates a background image of the current visual state of the given world.
     *
     * @param world the given world whose visual state is to be duplicated in the background of this world
     * @param actorClasses an array of all actor classes in the given world
     * @param paintOrder an array of actor classes specifying the paint order in the given world
     */
    public Pause(World world, Class[] actorClasses, Class[] paintOrder)
    {    
        super(world.getWidth()*world.getCellSize(), world.getHeight()*world.getCellSize(), 1);
        firstWorld=world;
        
        setBackground(new GreenfootImage(world.getBackground())); // copies the background of the previous world
        // draw the images of all non-paint order objects on the background of the new world
        for(Object obj: world.getObjects(null))
        {
            Actor actor=(Actor)obj;
            if(!isPaintOrderActor(actor, paintOrder)) drawActorImage(actor);
        }
        // draw the images of all paint order objects on the background of the new world
        for(int i=1; i<=paintOrder.length; i++) for(Object obj: world.getObjects(paintOrder[paintOrder.length-i])) drawActorImage((Actor)obj); 
        addObject(new Panel(), getWidth()/2, getHeight()/2);
    }
    
    /**
     * Only returns true if the given actor is of a class that is specified in the paint order;
     *
     * @param actor the actor whose class is to be checked among the paint order classes
     * @param order an array of actor classes specifying the paint order
     * @return the state of the class of the given actor being specified in the paint order
     */
    private boolean isPaintOrderActor(Actor actor, Class[] order)
    {
        for(int i=0; i<order.length; i++) if(actor.getClass().equals(order[i])) return true;
        return false;
    }
    
    /**
     * Draws the image of the given actor onto the background image of this world at the same location as it appears in its world
     * 
     * @param actor the actor whose image is to be drawn
     */
    private void drawActorImage(Actor actor)
    {
        int x=actor.getX()*actor.getWorld().getCellSize()+actor.getWorld().getCellSize()/2;
        int y=actor.getY()*actor.getWorld().getCellSize()+actor.getWorld().getCellSize()/2; // the location of the actor in this world
        GreenfootImage img = getActorImage(actor); // the image of the actor
        int w=img.getWidth(), h=img.getHeight(); // the world dimensions
        getBackground().drawImage(img, x-w/2, y-h/2); // properly draws the image onto the given world's background image
    }
    
    /**
     * Resumes paused world when no Panel object remain in the world
     */
    public void act()
    {
        // this is the trigger to return to the original world in this example;
        // your trigger can be whatever you want it to be
        if(getObjects(Panel.class).isEmpty()) Greenfoot.setWorld(firstWorld);
    }
    
    /**
     * gets an image that represents the current visual state of the image of an actor
     *
     * @param actor the actor whose current visual image state is to be represented in an image object
     * @return the image the represents the current visual state of the image of an actor
     */
    private GreenfootImage getActorImage(Actor actor)
    {
        GreenfootImage actorImg = actor.getImage();
        int w = actorImg.getWidth();
        int h = actorImg.getHeight();
        int max = Math.max(w, h);
        GreenfootImage image = new GreenfootImage(max*2, max*2);
        image.drawImage(actorImg, max-actorImg.getWidth()/2, max-actorImg.getHeight()/2);
        image.rotate(actor.getRotation());
        return image;
    }
}
