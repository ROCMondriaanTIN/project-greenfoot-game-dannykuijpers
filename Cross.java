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
    GemBlue gem = new GemBlue();
    GemGreen gemG = new GemGreen();
    GemRed gemR = new GemRed();
    GemYellow gemY = new GemYellow();
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
            gem.levelStart();
            gemG.levelStart();
            gemR.levelStart();
            gemY.levelStart();
        }
    }
}    

