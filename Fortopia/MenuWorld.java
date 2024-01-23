import greenfoot.*;
import java.io.*;
import java.util.Scanner;


/**
 * Write a description of class Hearts here.
 * 
 * @Wendy Luo, Gisele Huang
 * @version (a version number or a date)
 */
public class MenuWorld extends World {
    // four worlds : Wendy's, Yuli, Neo, Normal
    SaveButton button = new SaveButton();
    NeoButton neo = new NeoButton();
    NormalButton normal = new NormalButton();
    WendyButton wendy = new WendyButton();
    YuliButton yuli = new YuliButton();
    YuliIcon yuliI = new YuliIcon();
    public MenuWorld(){
        super(1000, 700, 1);
    }
    public void act(){
        prepare();
        if(Greenfoot.mouseClicked(button)){
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your file name");
            
            String fileName = scan.nextLine();
            
            try{
                Scanner fileScanner = new Scanner(new File(fileName));
                //Greenfoot.setWorld(new GameWorld());
            }
            catch(FileNotFoundException e){
                //Greenfoot.setWorld(new GameWorld());
            }
        }
        //else if(Greenfoot.mouseClicked(worldmap1)){
        
    }
    public void prepare(){
        addObject(button,800,80);
        addObject(neo,100,330);
        addObject(normal,100,150);
        addObject(wendy,450,330);
        addObject(yuli,450,150);
        addObject(yuliI,450,200);
    }
    
}

