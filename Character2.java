import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character2 extends Mover
{
    /**
     * Act - do whatever the Character2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Hero hero = new Hero();
        if (Greenfoot.mousePressed(this)){
            hero.handleInputP2();
            Greenfoot.setWorld(new Level1());
        }
    }    
}
