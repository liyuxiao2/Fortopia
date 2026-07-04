import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * "Enemy" graphic 
 * 
 * @Gisele
 * @Jan 2024
 */
public class HorrifyingMonkeys extends Actor
{
    int frame = 0;
    private GreenfootImage uyli1;
    private GreenfootImage uyli2;
    /**
     * Different enemy image for each different level
     */
    public HorrifyingMonkeys(int level)
    {
        if(level == 1){
            uyli1 = new GreenfootImage("uyil1.png");
            uyli2 = new GreenfootImage("uyil2.png");
        }
        else if(level == 2){
            uyli1 = new GreenfootImage("neouyil1.png");
            uyli2 = new GreenfootImage("neouyil2.png");
        }
        else if(level == 3){
            uyli1 = new GreenfootImage("cuteuyil1.png");
            uyli2 = new GreenfootImage("cuteuyil2.png");
        }
        else if(level == 4){
            uyli1 = new GreenfootImage("uyil1.png");
            uyli2 = new GreenfootImage("uyil2.png");
        }
        setImage(uyli1);
    }
    public void act()
    {
        animate();
    }
    
    /**
     * Different animation for each level
     */
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
