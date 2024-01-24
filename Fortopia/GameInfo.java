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
            
            Coins.collected = savedCoins;
        }
        catch(FileNotFoundException e){
            
        }
    }
    
    public static int[] loadCompletedWorlds(String fileName){
        int [] maps = new int[4];
        try{
            Scanner fileScanner = new Scanner(new File(fileName));
            fileScanner.nextLine();
            int counter = 0;
            while(fileScanner.hasNext()){
                maps[counter] = Integer.valueOf(fileScanner.nextLine());
                counter++;
            }
            fileScanner.close();
            return maps;
        }
        catch(FileNotFoundException e){
            return maps;
        }
    }
    
    
    public static void saveGame(int [] maps){
        Scanner scan = new Scanner(System.in);
             
        System.out.println("Save your progress under what name?");
             
        String fileName = scan.nextLine();
        
        
        try{
             
             
             
             FileWriter writer = new FileWriter(fileName);
             PrintWriter print = new PrintWriter(writer);
             
              
             print.println(Coins.collected);
             
             for(int x: maps){
                  print.println(x);
             }
               
             print.close();
             writer.close();
        } 
           
           
        catch(IOException e){    
               
        }
        scan.close();
            
        }
    }

