import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

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
    
    public static boolean[] loadCompletedWorlds(String fileName){ 
        boolean [] maps = new boolean [4];
        try{
            Scanner fileScanner = new Scanner(new File(fileName));
            fileScanner.nextLine();
            int counter = 0;
            while(fileScanner.hasNext()){
                 maps[counter] = (Boolean.valueOf(fileScanner.nextLine()));
                 counter++;
            }
            fileScanner.close();
            return maps;
        }
        catch(FileNotFoundException e){
            return maps;
        }
    }
    
    
    public static void saveGame(boolean [] maps){
        
         try{
              Scanner scan = new Scanner(System.in);
              
              System.out.println("Enter file name you want to save to");
              
              
              String fileName = scan.nextLine();
              
              
              FileWriter writer = new FileWriter(fileName);
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

