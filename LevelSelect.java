import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
    }
    public void act(){
        if(Greenfoot.isKeyDown("1"))
            Greenfoot.setWorld(new Level1());
        if(Greenfoot.isKeyDown("2"))
            Greenfoot.setWorld(new Level2());
        if(Greenfoot.isKeyDown("3"))
            Greenfoot.setWorld(new Level3());
        }
}
