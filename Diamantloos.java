import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamantloos extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public Diamantloos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(620, 350, 1); 
        prepare();
    }

    public void act(){
        if(Greenfoot.isKeyDown("space"))
            Greenfoot.setWorld(new LevelSelect());
    }

    //
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
