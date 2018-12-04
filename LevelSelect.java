import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{
    GemBlue test = new GemBlue();
    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(620, 350, 1); 
        prepare();
    }

    public void act(){
        if(Greenfoot.isKeyDown("1"))
            Greenfoot.setWorld(new Level1());
        if(Greenfoot.isKeyDown("2"))
            Greenfoot.setWorld(new Level2());
        if(Greenfoot.isKeyDown("3"))
            Greenfoot.setWorld(new Level3());
        if(Greenfoot.isKeyDown("4"))
            Greenfoot.setWorld(new Level4());
        if(Greenfoot.isKeyDown("5"))
            test.Level5();
        if(Greenfoot.isKeyDown("6"))
            Greenfoot.setWorld(new CharacterSelect());
        if(Greenfoot.isKeyDown("0"))
            Greenfoot.setWorld(new Testlevel());
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
