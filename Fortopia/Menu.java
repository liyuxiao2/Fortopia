import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

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
    
    public Menu(int[] x)
    {    
        super(1000, 700, 1, false); 
        addDeco();
        addButtons();
        checkMapCompletion(x);
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
        addObject(new Save(), 182, 83);
        addObject(new Load(), 818, 83);
    }
    
    public void checkMapCompletion(int[] x){
        for(int i = 0; i < x.length; i++){
            if(i == 0 && x[i] == 1){
                addObject(new CheckMark(), 300, 400);
            }
            if(i == 1 && x[i] == 1){
                addObject(new CheckMark(), 300, 400);
            }
            if(i == 2 && x[i] == 1){
                addObject(new CheckMark(), 300, 400);
            }
            if(i == 3 && x[i] == 1){
                addObject(new CheckMark(), 300, 400);
            }
        }
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
class Save extends Actor
{
    private GreenfootImage idle;
    private GreenfootImage hovered;
    
    public static int [] mapCompletion;
    public Save()
    {
        idle = new GreenfootImage("save.png");
        hovered = new GreenfootImage("pressedsave.png");
        setImage(idle);
    }
    public void act()
    {
        hovering();
        if(Greenfoot.mouseClicked(this)){
            GameInfo.saveGame(mapCompletion);
            Greenfoot.setWorld(new Menu(mapCompletion));
        }
      
    }
    protected void hovering()
    {
        if (Greenfoot.mouseMoved(this))setImage(hovered);
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))setImage(idle);
    }
    
    public static void updateMapCompletion(int x){
        mapCompletion[x] = 1;
    }
    
    protected static int[] getMaps(){
        return mapCompletion;
    }
}
class Load extends Actor
{
    private GreenfootImage idle;
    private GreenfootImage hovered;
    private static int [] maps;
    
    
    public Load()
    {
        idle = new GreenfootImage("load.png");
        hovered = new GreenfootImage("pressedload.png");
        setImage(idle);
    }
    public void act()
    {
        hovering();
        if (Greenfoot.mouseClicked(this)) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your user name (the name that you saved under)");
            

            
            String fileName = scan.nextLine();
            
            System.out.println("Loading");
            
            GameInfo.loadCoins(fileName);
            
            maps = GameInfo.loadCompletedWorlds(fileName);
            
            Greenfoot.setWorld(new Menu(maps));
            
            System.out.println("Loaded");
        }
    }
    
    protected void hovering()
    {
        if (Greenfoot.mouseMoved(this))setImage(hovered);
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))setImage(idle);
    }
    
    protected static int[] getMaps(){
        return maps;
    }
    
}

class CheckMark extends Actor{
    private GreenfootImage check;
    public CheckMark(){
        check = new GreenfootImage("completed.png");
        check.scale(500,500);
        setImage(check);
    }
}
