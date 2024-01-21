import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HorryfyingMonkeys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HorryfyingMonkeys extends Actor
{
    int frame = 0;
    private GreenfootImage uyli1 = new GreenfootImage("uyil1.png");
    private GreenfootImage uyli2 = new GreenfootImage("uyil2.png");
    /**
     * Act - do whatever the HorryfyingMonkeys wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animate();
    }
    
    public void animate(){
        if(frame == 20)
        {
            setImage(uyli1);
        }
        else if(frame == 40)
        {
            setImage(uyli2);
            frame = 1;
            return;
        }
        frame++;
    }
}
