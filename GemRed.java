import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GemRed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GemRed extends Mover
{
    static boolean gemCollectedL3 = false;
    static boolean dGemCollectedR = false;
    public void act() 
    {
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
           dGemCollectedR();
           if (getWorld() instanceof Level3){
                gemCollectedL3();
           }
           if (enemy != null) {
                getWorld().removeObject(this);
                return;
           }
        }    
        applyVelocity();
    }
    
    public static void gemCollectedL3(){
        gemCollectedL3 = true;
    }
    
    public void dGemCollectedR(){
        dGemCollectedR = true;
    }
    
    public void levelStart(){
        dGemCollectedR = false;
    }
}
