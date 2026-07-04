import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.io.*;
import java.util.ArrayList;

/**
 * GameInfo stores the data of player's game information
 * like the worlds they completed and coin collected
 * 
 * @Liyu Xiao
 * @01/24/2024
 */
public class GameInfo  
{
    private static int savedCoins;

    /**
     * loads the data for how many coins are collected 
     * @param fileName : retrieves a desired name for the file from player
     */
    public static void loadCoins(String fileName){
        try{
            Scanner fileScanner = new Scanner(new File(fileName));
            savedCoins = Integer.valueOf(fileScanner.nextLine());
            fileScanner.close();

            Coins.setCoins(savedCoins);
        }
        catch(FileNotFoundException e){

        }
    }

    /**
     * loads the data for the completed worlds 
     * @param fileName : retrieves a desired name for the file from player
     * @return int : for the world level 
     */
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

    /**
     * saves the game progress by having a file name from player 
     * @param int : gets the world level player ended with
     * 
     */
    public static void saveGame(int [] maps){
        Scanner scan = new Scanner(System.in);

        System.out.println("Save your progress under what name?");

        String fileName = scan.nextLine();

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
        scan.close();

    }
}
