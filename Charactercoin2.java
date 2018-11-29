import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Charactercoin2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Charactercoin2 extends Mover
{
    /**
     * Act - do whatever the Charactercoin2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Hero character = new Hero();
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                character.charactercoin2();
                return;
            }
        }
        applyVelocity();
    }  
}
