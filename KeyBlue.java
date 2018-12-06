import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyBlue extends Mover
{
    static boolean keyCollected = false;
    public void act() 
    {
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
            keyCollected();
            if (enemy != null) {
                getWorld().removeObject(this);
                return;
            }
        }
        applyVelocity(); 
    }    
    
    public void levelStart(){
        keyCollected = false;
    }
    
    public void keyCollected(){
        keyCollected = true;
    }
}
