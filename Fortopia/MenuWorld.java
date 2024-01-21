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
    SaveButton button = new SaveButton();;
    public MenuWorld() {
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
                Greenfoot.setWorld(new GameWorld());
            }
            catch(FileNotFoundException e){
                Greenfoot.setWorld(new GameWorld());
            }
        }
    }
    public void prepare(){
        addObject(button,490,230);d
        ad
        Label labelW = new Label("Wendy's",30);
        addObject (labelW, 830, 40);
        Label labelY = new Label("Yuli",30);
        addObject (labelY, 630, 40);
        Label labelN = new Label("Neo",30);
        addObject (labelN, 530, 40);
        Label labelR = new Label("Yuli",30);
        addObject (labelR, 430, 40);
    }
    
}

