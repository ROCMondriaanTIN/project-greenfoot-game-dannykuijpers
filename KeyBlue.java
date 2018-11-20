import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyBlue extends Mover
{
    
    public void act() 
    {
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                return;
            }
        }
        applyVelocity(); 
    }    

}
