import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;

/**
 * Menu is a Greenfoot World that allows player to choose the maps and save/load option
 * All graphics credit to Gisele Huang
 * @Liyu Xiao, Gisele Huang, Wendy Luo
 * @01/24/24
 */

public class Menu extends World
{
    /**
     * main constructor of the MenuWorld, creates the world and displays 
     * the options on menu
     * 
     * This constructor is used without any previous data
     */

    public Menu()
    {    
        super(1000, 700, 1, false); 
        addDeco();
        addButtons();
    }
    
    /**
     * main constructor of the MenuWorld, creates the world and displays 
     * the options on menu
     * This constructor is used after completing a world, or when loading a users data
     * 
     * @param int[]x:  the list of completed maps per the user
     * 
     */
    public Menu(int[] x)
    {    
        super(1000, 700, 1, false); 
        addDeco();
        addButtons();
        checkMapCompletion(x);
    }
    
    //add all background graphics 
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
    
    //add all buttons 
    public void addButtons()
    {
        addObject(new Level(1), 334, 283);
        addObject(new Level(2), 666, 283);
        addObject(new Level(3), 334, 527);
        addObject(new Level(4), 666, 527);
        addObject(new Save(), 182, 83);
        addObject(new Load(), 818, 83);
    }
    
    /**
     * checks the see if the game ends in the map
     * @param int[] x: A list of completed/non completed worlds by the user
     */
    public void checkMapCompletion(int[] x){
        for(int i = 0; i < x.length; i++){
            if(i == 0 && x[i] == 1){
                addObject(new CheckMark(), 334, 283);
            }
            if(i == 1 && x[i] == 1){
                addObject(new CheckMark(), 666, 283);
            }
            if(i == 2 && x[i] == 1){
                addObject(new CheckMark(), 334, 527);
            }
            if(i == 3 && x[i] == 1){
                addObject(new CheckMark(), 666, 527);
            }
        }
    }
}

//sets the background image for the menu world
class MenuImg extends Actor
{
    public MenuImg()
    {
        setImage("menu.png");
    }
}

//sprite graphics for visuals in the menu
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
    public Save()
    {
        idle = new GreenfootImage("save.png");
        hovered = new GreenfootImage("pressedsave.png");
        setImage(idle);
    }
    
    
    
    public void act()
    {
        hovering();
        if (Greenfoot.mouseClicked(this)) {
            if(Greenfoot.mouseClicked(this)){
                
            int[] maps = MapList.getMapList();    
            String fileName = Greenfoot.ask("Save your progress under what name?");
            
            try{
                 
                 
                 FileWriter writer = new FileWriter(fileName);
                 PrintWriter print = new PrintWriter(writer);
                 
                  
                 print.println(Coins.getCoins());
                 
                 for(int x: maps){
                      print.println(x);
                 }
                   
                 print.close();
                 writer.close();
            } 
               
               
            catch(IOException e){    
                   
            }
        }

        }
    }
    
    
    protected void hovering()
    {
        if (Greenfoot.mouseMoved(this))setImage(hovered);
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))setImage(idle);
    }
}
class Load extends Actor
{
    private GreenfootImage idle;
    private GreenfootImage hovered;
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

            String fileName = Greenfoot.ask("enter your user name (the name that you saved under)");
            
            int[] maps = MapList.getMapList();
            
            
            try{
                Scanner fileScanner = new Scanner(new File(fileName));
                int savedCoins= Integer.valueOf(fileScanner.nextLine());
                
                Coins.setCoins(savedCoins);
                
                int counter = 0;
                while(fileScanner.hasNext()){
                        maps[counter] = Integer.valueOf(fileScanner.nextLine());
                        counter++;
                }
                fileScanner.close();
            }
            
            catch(FileNotFoundException e){
                Greenfoot.setWorld(new Menu());
            }
            
            
            Greenfoot.setWorld(new Menu(maps));
        }
    }
    
    protected void hovering()
    {
        if (Greenfoot.mouseMoved(this))setImage(hovered);
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))setImage(idle);
    }
}