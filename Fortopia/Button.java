import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button that is used in the welcome world to transition to story world
 * 
 * @Natalie 
 * @Jan 2024
 */
public class Button extends Actor
{
    private GreenfootImage button1 = new GreenfootImage("nextbutton.png");
    private GreenfootImage button2 = new GreenfootImage("nextbutton2.png");
    private boolean mouseDown;
     
    public Button() {
        setImage(button1);
        mouseDown = false;
    }
 
    public void act() {
        if (!mouseDown && Greenfoot.mousePressed(this)) {  
            setImage(button2); 
        }  
        if (mouseDown && Greenfoot.mouseClicked(this)) {
            setImage(button1);
        }  
    }
}
