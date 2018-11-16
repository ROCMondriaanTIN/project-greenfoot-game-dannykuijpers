import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GemBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GemBlue extends Mover
{
    /**
     * Act - do whatever the GemBlue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
