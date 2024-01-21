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
    private GreenfootImage uyli1;
    private GreenfootImage uyli2;
    /**
     * Act - do whatever the HorryfyingMonkeys wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HorryfyingMonkeys(int level)
    {
        if(level == 1){
            uyli1 = new GreenfootImage("uyil1.png");
            uyli2 = new GreenfootImage("uyil2.png");
        }
        if(level == 2){
            uyli1 = new GreenfootImage("neouyil1.png");
            uyli2 = new GreenfootImage("neouyil2.png");
        }
        if(level == 3){
            uyli1 = new GreenfootImage("cuteuyil1.png");
            uyli2 = new GreenfootImage("cuteuyil2.png");
        }
        if(level == 4){
            uyli1 = new GreenfootImage("uyil1.png");
            uyli2 = new GreenfootImage("uyil2.png");
        }
    }
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
