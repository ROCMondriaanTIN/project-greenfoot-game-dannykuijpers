import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GemYellow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GemYellow extends Mover
{
    static boolean gemCollectedL4 = false;
    static boolean dGemCollectedY = false;
    public void act() 
    {
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
           dGemCollectedY();
           if (getWorld() instanceof Level4){
                gemCollectedL4();
           }
           if (enemy != null) {
                getWorld().removeObject(this);
                return;
           }
        }    
        applyVelocity();
    }
    
    public static void gemCollectedL4(){
        gemCollectedL4 = true;
    }
    
    public void dGemCollectedY(){
        dGemCollectedY = true;
    }
    
    public void levelStart(){
        dGemCollectedY = false;
    }
}