import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tempmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    
    public Menu()
    {    
        super(1000, 700, 1, false); 
        addDeco();
        addButtons();
    }
    public void addDeco()
    {
        addObject(new Sky(), 500, 350);
        addObject(new Sky(), 1500, 350);
        addObject(new Clouds(), 500, 350);
        addObject(new Clouds(), 1500, 350);
        addObject(new Trees(), 500, 350);
        addObject(new Trees(), 1500, 350);
        addObject(new MenuImg(), 500, 350);
        addObject(new Sprite(1), 150, 300);
        addObject(new Sprite(2), 850, 300);
        addObject(new Sprite(3), 150, 550);
        addObject(new Sprite(4), 850, 550);
    }
    public void addButtons()
    {
        addObject(new Level(1), 334, 283);
        addObject(new Level(2), 666, 283);
        addObject(new Level(3), 334, 527);
        addObject(new Level(4), 666, 527);
    }
}
class MenuImg extends Actor
{
    public MenuImg()
    {
        setImage("menu.png");
    }
}
class Sprite extends Actor
{
    int frame = 0;
    private GreenfootImage frame1;
    private GreenfootImage frame2;
    public Sprite(int who)
    {
        if(who == 1){//Natalie
            frame1 = new GreenfootImage("natalie1.png");
            frame2 = new GreenfootImage("natalie2.png");
        }
        if(who == 2){//Gisele
            frame1 = new GreenfootImage("gisele2.png");
            frame2 = new GreenfootImage("gisele1.png");
        }
        if(who == 3){//Wendy
            frame1 = new GreenfootImage("wendy2.png");
            frame2 = new GreenfootImage("wendy1.png");
        }
        if(who == 4){//Liyu
            frame1 = new GreenfootImage("liyu1.png");
            frame2 = new GreenfootImage("liyu2.png");
        }
        setImage(frame1);
    }
    public void act()
    {
        animate();
    }
    public void animate(){
        if(frame == 40)
        {
            setImage(frame1);
        }
        else if(frame == 80)
        {
            setImage(frame2);
            frame = 1;
            return;
        }
        frame++;
    }
}
class Level extends Actor
{
    private GreenfootImage idle;
    private GreenfootImage hovered;
    private int level;
    public Level(int level)
    {
        this.level = level;
        idle = new GreenfootImage("level" + level + ".png");
        hovered = new GreenfootImage("pressedlevel" + level + ".png");
        setImage(idle);
    }
    public void act()
    {
        hovering();
        if (Greenfoot.mouseClicked(this)) {
            GameWorld game = new GameWorld(level);
            Greenfoot.setWorld(game);
        }
    }
    protected void hovering()
    {
        if (Greenfoot.mouseMoved(this))setImage(hovered);
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))setImage(idle);
    }
}
