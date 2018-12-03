import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GemBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GemBlue extends Mover
{
    public boolean gemcollected;
    public void act() 
    {
       for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                gemcollected = true;
                return;
            }
       }
       applyVelocity();
    }    
}
