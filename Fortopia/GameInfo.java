import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.io.*;
import java.util.ArrayList;

/**
 * Write a description of class GameInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameInfo  
{
    private static int savedCoins;

    /**
     * Constructor for objects of class GameInfo
     */
    public GameInfo()
    {
    }

    public static void loadCoins(String fileName){
        try{
            Scanner fileScanner = new Scanner(new File(fileName));
            savedCoins = Integer.valueOf(fileScanner.nextLine());
            fileScanner.close();
        }
        catch(FileNotFoundException e){
            
        }
    }
    
    public static void loadCompletedWorlds(String fileName){
        try{
            Scanner fileScanner = new Scanner(new File(fileName));
            fileScanner.nextLine();
            int counter = 0;
            while(fileScanner.hasNext()){
                //maps.get(counter).set(Boolean.valueOf(fileScanner.nextLine()));
            }
            fileScanner.close();
        }
        catch(FileNotFoundException e){
            
        }
    }
    
    
    public static void saveGame(boolean [] maps){
        
        try{
              FileWriter writer = new FileWriter("hello.txt");
              PrintWriter print = new PrintWriter(writer);
             
              
             print.println(Coins.collected);
             
             for(boolean x: maps){
                  print.println(x);
             }
               
               print.close();
               writer.close();
                
                
         
              
           } 
           catch(IOException e){    
               
            }
         
            
        }
    }

