import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GemGreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GemGreen extends Mover
{
    static boolean gemCollectedL2 = false;
    static boolean dGemCollectedG = false;
    public void act() 
    {
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
           dGemCollectedG();
            if (getWorld() instanceof Level2){
                gemCollectedL2();
           }
           if (enemy != null) {
                getWorld().removeObject(this);
                return;
           }
        }    
        applyVelocity();
    }
    
    public static void gemCollectedL2(){
        gemCollectedL2 = true;
    }
    
    public void dGemCollectedG(){
        dGemCollectedG = true;
    }
    
    public void levelStart(){
        dGemCollectedG = false;
    }
}
