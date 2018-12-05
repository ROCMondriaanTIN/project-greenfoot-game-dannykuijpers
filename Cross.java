import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cross here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cross extends Mover
{
    public Cross(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act() 
    {
        if (Greenfoot.mousePressed(Cross.class) == true){
            if (getWorld() instanceof Level1) Greenfoot.setWorld(new Level1());
        }
    }    
}
