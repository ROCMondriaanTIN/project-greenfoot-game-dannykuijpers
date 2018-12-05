import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{
    GemBlue blauw = new GemBlue();
    GemGreen groen = new GemGreen();
    GemRed rood = new GemRed();
    GemYellow geel = new GemYellow();
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
            blauw.Level5();
        if(Greenfoot.isKeyDown("6"))
            Greenfoot.setWorld(new CharacterSelect());
        if(Greenfoot.isKeyDown("7"))
            Greenfoot.setWorld(new Tutorial());
        if(Greenfoot.isKeyDown("escape"))
            Greenfoot.setWorld(new Testlevel());
            
        if (blauw.gemCollectedL1 == true){
            addObject(new GemBlue(), 95, 140);
        }
        if (groen.gemCollectedL2 == true){
            addObject(new GemGreen(), 239, 140);
        }
        if (rood.gemCollectedL3 == true){
            addObject(new GemRed(), 383, 140);
        }
        if (geel.gemCollectedL4 == true){
            addObject(new GemYellow(), 526, 140);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}