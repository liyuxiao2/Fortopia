import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This subclass is just an example. You can delete it or change the code if you want.
 * It's not necessary for the scrolling system.
 */


public class GameWorld extends World
{
    int counter = 0;
    // 50*50, world by blocks is 20*14
    String[][] arrayMap1 =  {{"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","o","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                             {"x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x","x"},
                           };
    public void act(){
        counter++;
        
    }
    public GameWorld() {
        super(1000, 700, 1,false);//creates an infinite scrolling world with a screen size of 600 x 400;
        //if you want to limitate the scrolling world you have to use this constructor:
        //super(600, 400, 1, scrollingWidth, scrollingHeight);

        createGameWorld();//this method just adds some objects to the world.
    }
    
    /**
     * Creates an example world where the ScrollingActor can move.
     */
    public void createGameWorld() {
        int groundWidth = 1040; // Width of the ground image
        int groundHeight = new Ground().getImage().getHeight(); // Height of the ground image
        int numGroundInstances =10;
        for (int i = 0; i < numGroundInstances; i++) {
<<<<<<< Updated upstream:Fortopia/GameWorld.java
            addObject(new Ground(), i * groundWidth,600);
        }
        for (int i = 0; i < arrayMap.length; i++) {
            for(int j = 0; j < arrayMap[i].length; j++){
                if(arrayMap[i][j].equals("o")){
                    addObject(new Block(), j*40, i*40);
                }
            }
        }
        if(counter % 2 == 0){
            addObject(new GreyPlatform(),515,315);
        }
        addObject(new Runner(), 300, 525);
=======
            addObject(new Ground(), i * groundWidth,650);
        }
        
        
        
        addObject(new Runner(), 500, 450);
        
    }
    
    
    public void addObstacles(){
        for (int i = 0; i < arrayMap1.length; i++) {
            for(int j = 0; j < arrayMap1[i].length; j++){
                if(arrayMap1[i][j].equals("o")){
                    addObject(new Block(), j*50, i*50);
                }
            }
        }
    }
    
    
    
    public void act(){
        counter++;
>>>>>>> Stashed changes:Fortopia/ExampleWorld.java
        if(counter == 60){
            addObstacles();
            counter = 0;
        }
    }
    public void addObstacles(){
        addObject(new Block(), 1000,400);
    }
    
}