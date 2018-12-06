import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Overwinningscherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Overwinningscherm extends World
{

    /**
     * Constructor for objects of class Overwinningscherm.
     * 
     */
    public Overwinningscherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 450, 1); 
    }
    public void act(){
        if (Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(new StartScreen());
        }
    }
}
