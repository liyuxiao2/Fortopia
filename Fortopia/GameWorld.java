import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This is the game world for the runner game 
 * 
 * 
 * 
 * 
 * @authors Liyu Xiao, Natalie Huang, Gisele Huang, Wendy Luo
 * @version January 2024
 * 
 */


public class GameWorld extends World
{
    private static int mapCount = 0;
    int counter = 0;
    // 20*20, world by blocks is 20*14
    String[][] arrayMap0 =  {{"x","x","x","x","x","x","x","o","x","x","x","x","x","x","x","x","x","x","x","x","o"},
                            {"x","x","x","x","x","x","x","o","x","x","x","x","x","x","x","x","x","x","x","x","o"},
                            {"x","x","x","x","x","x","x","o","x","x","x","x","x","x","x","x","x","x","x","x","o"},
                            {"x","x","x","x","x","x","x","o","x","x","x","x","x","x","x","x","x","x","x","x","o"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"w","x","x","x","x","x","x","o","x","x","x","o","x","x","x","x","x","x","x","x","o"},
                            {"o","x","x","x","x","x","x","o","x","x","x","o","x","x","x","x","x","x","x","x","o"},
                            {"o","x","x","x","x","x","x","o","x","x","x","o","x","x","x","x","x","x","x","x","o"},
                           };
                           
    String[][] arrayMap1 =  {{"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","w"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","o"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","o"},
                           };
                           
    
    String[][] arrayMap2 =  {{"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","w","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","o","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","o","x","x","x","x","x","x","","x","x","x","x"},
                           };
                           
    String[][] arrayMap3 =  {{"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","w","x","x","x","w","x","w","x","x","x","x","x","x","","x","w","x","x"},
                           };
    String[][] arrayMap4 =  {{"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","w","x","x","x","w","x","w","x","x","x","x","x","x","","x","w","x","x"},
                           };
    String[][] arrayMap5 =  {{"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                            {"x","x","x","w","x","x","x","w","x","w","x","x","x","x","x","x","","x","w","x","x"},
                           };
    
    LinkedList <String[][]> maps = new LinkedList<String[][]>();
    
    private Sky sky1 = new Sky();
    private Sky sky2 = new Sky();
    private Trees trees1 = new Trees();
    private Trees trees2 = new Trees();
    private Clouds clouds1 = new Clouds();
    private Clouds clouds2 = new Clouds();
    public void act(){
        counter++;
        if(counter == 120){
            
            if(mapCount >= maps.size()-1){
                counter = 0;
                mapCount = 0;
                addObstacles(maps.get(mapCount));
            }
            else{
              addObstacles(maps.get(mapCount));
              mapCount++;
              counter = 0;  
            }
        }
    }
    
    /**
     * Constructor for the game world
     */
    public GameWorld() {
        super(1000, 700, 1,false);//creates an infinite scrolling world with a screen size of 600 x 400;
        //if you want to limitate the scrolling world you have to use this constructor:
        //super(600, 400, 1, scrollingWidth, scrollingHeight);
        addObject(sky1, 500, 90);
        addObject(sky2, 1500, 90);
        addObject(clouds1, 500, 90);
        addObject(clouds2, 1500, 90);
        addObject(trees1, 500, 110);
        addObject(trees2, 1500, 110);
        createGameWorld();//this method just adds some objects to the world.
        
        maps.add(arrayMap0);
        maps.add(arrayMap1);
        maps.add(arrayMap2);
    }
    
    /**
     * Creates an example world where the ScrollingActor can move.
     */
    public void createGameWorld() {
        //initializes the worl
        int groundWidth = 1040; // Width of the ground image
        int groundHeight = new Ground().getImage().getHeight(); // Height of the ground image
        int numGroundInstances = 20;
        for (int i = 0; i < numGroundInstances; i++) {
            addObject(new Ground(), i * groundWidth,600);
        }
        if(counter % 2 == 0){
            addObject(new GreyPlatform(),515,315);
        }
        addObject(new Runner(), 300, 380);
    }
    
    public void addObstacles(String[][] x){
        //adds the obstacles according to the 2d array
        for (int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++){
                //checks which obstacles to add
                if(x[i][j].equals("o")){
                    addObject(new Block(), 1000+j*50, i*50);
                }
                else if(x[i][j].equals("w")){
                    addObject(new Spike(), 1000+j*50, i*50);
                }
                else if(x[i][j].equals("r")){
                    addObject(new UpsideDownSpike(), 1000+j*50, i*50);
                }
            }
        }
    }
    
    
}