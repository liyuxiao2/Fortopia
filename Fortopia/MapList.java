import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MapList here.
 * 
 * @Liyu Xiao 
 * @version (a version number or a date)
 */
public class MapList extends Actor
{
    private static int[] mapList = {0,0,0,0};
    
    public static int[] getMapList(){
        return mapList;
    }
    
    public static void setMap(int x){
        mapList[x] = 1;
    }
}
