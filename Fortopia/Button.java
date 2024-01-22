import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @Natalie 
 * @version (a version number or a date)
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
