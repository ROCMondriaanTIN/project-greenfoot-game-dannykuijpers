import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GemBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GemBlue extends Mover
{
    static boolean gemCollectedL1 = false;
    static boolean gemCollectedL2 = false;
    static boolean gemCollectedL3 = false;
    static boolean gemCollectedL4 = false;
    
    
    public void act() 
    {
       for (Actor enemy : getIntersectingObjects(Hero.class)) {
           if (getWorld() instanceof Level1){
                gemCollectedL1(); 
                //LevelSelect.act();
           }
           if (getWorld() instanceof Level2){
                gemCollectedL2(); 
           }
           if (getWorld() instanceof Level3){
                gemCollectedL3(); 
           }
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
    
    public void gemCollectedL1(){
        gemCollectedL1 = true;
    }
    
    public static void gemCollectedL2(){
        gemCollectedL2 = true;
    }
    
    public static void gemCollectedL3(){
        gemCollectedL3 = true;
    }
    
    public static void gemCollectedL4(){
        gemCollectedL4 = true;
    }
    
    public void Level5(){
        if((gemCollectedL1 == true) && (gemCollectedL2 == true) && (gemCollectedL3 == true) && (gemCollectedL4 == true)){
            Greenfoot.setWorld(new Level5());
        }
        else{
            Greenfoot.setWorld(new Diamantloos());
        }
    }
}
