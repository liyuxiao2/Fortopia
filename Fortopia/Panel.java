import greenfoot.*;

/**
 * <h2>Class Panel</h2>
 * <b>A class to dislay text and run a restart time while a world is paused.</b>
 * <p>Displays a 'game paused' message until click on; then gives a 'restart in 3...2...1' message before re-activating the paused world.</p>
 */
public class Panel extends Actor
{
    /** 
     * The number of act cycles between each instance of counting down in the time to restart; adjust
     * this value to suit your needs.
     */
    static final int TIME_UNIT=50;
    int timer=3*TIME_UNIT;
    boolean running;
    
    /**
     * Used for getting the dimensions of the world to determine size of image to create.
     *
     * @param world the world to be visually duplicated
     */
    public void addedToWorld(World world)
    {
        int cs=world.getCellSize();
        int w=world.getWidth()*cs, h=world.getHeight()*cs;
        GreenfootImage image=new GreenfootImage(w, h);
        setImage(image);
        updateImage();
    }
    
    /**
     * Builds the image to display.
     */
    private void updateImage()
    {
        GreenfootImage image=getImage();
        int w=image.getWidth(), h=image.getHeight();
        image.clear();
        image.setColor(new Color(192, 192, 192, 96));
        image.fill();
        image.setColor(new Color(96, 96, 96, 96));
        int dw=w/8, dh=h/8;
        image.fillRect(dw, dh, w-2*dw, h-2*dh);
        String txt="";
        Color textColor=new Color(255, 255, 255, 96), backColor=new Color(0, 0, 0, 0);
        if(!running)
        {
            GreenfootImage text=new GreenfootImage("GAME\nPAUSED", 64, textColor, backColor);
            image.drawImage(text, (w-text.getWidth())/2, dh-30+text.getHeight()/2);
            GreenfootImage click=new GreenfootImage("CLICK TO RESTART", 24, textColor, backColor);
            image.drawImage(click, (w-click.getWidth())/2, h-dh-70-click.getHeight()/2);
        }
        else
        {
            GreenfootImage text=new GreenfootImage("RESTART IN\n"+(timer/TIME_UNIT), 64, textColor, backColor);
            image.drawImage(text, (w-text.getWidth())/2, (h-text.getHeight())/2);
        }            
        setImage(image);
    }

    /**
     * Checks for timer start and then runs the timer.
     */
    public void act()
    {
        if(running)
        {
            timer--;
            if(timer%TIME_UNIT==0) updateImage();
            if(timer==0) getWorld().removeObject(this);
        }
        if(!running && Greenfoot.mouseClicked(this))
        {
            running=true;
            updateImage();
        }
    }        
}
