import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moving_Platforms here.
 * 
 * @Wendy
 * @Jan 2024
 */
public class MovingPlatforms extends Platforms
{
    private int sX=1;//Direction of the movement (Positive - right) (Negative - left) on axis X
    /**
     * Act does nothing
     */
    public void act() 
    {
        //nothing
    }
    
    //Overriding
/**
     * Gives the platform the size and then resizes it
     */
    public void platformSize() 
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/4);//Scale the original image
    }

/*xLimit how much from the border do we want to go 
    xLimit to  720-xLimit*/
    //@Overloading
    /**
     * Moves the platform left and right
     * 
     * @param xLimit   the direction and limit it can go to
     * @return int     the number in which it goes left or right
     */
    public void movingPlatforms(int xLimit) //int 122
    {
        move(3*sX);//Move 3 units in a direction (sX) {-1 negative; +1 posite on X axis}
        if(getX()>getWorld().getWidth()-xLimit)
            sX=-1;//change diretction
        if(getX()<xLimit)
          sX=1;//change diretction
    }

//@Overloading
    /**
     * Moves platform left and right
     * 
     * @param xLimit   the direction and limit it can go
     * @return double  move specific number in which it moves left and right
     */
    public void movingPlatforms(double xLimit) // double 122.2
    {
        move(3*sX);//Move 3 units in a direction (sX) {-1 negative; +1 posite on X axis} 
        if(getX()>getWorld().getWidth()-xLimit)
            sX=-1;//change diretction
        if(getX()<xLimit)
          sX=1;//change diretction
    }
}
