import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cross here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cross extends Mover
{
    KeyBlue sleutel = new KeyBlue();
    public Cross(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new LevelSelect());
            sleutel.levelStart();
        }
    }
}    

