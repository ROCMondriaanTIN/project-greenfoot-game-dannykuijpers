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
    GemGreen groen = new GemGreen();
    GemRed rood = new GemRed();
    GemYellow geel = new GemYellow();
    public void act() 
    {
       for (Actor enemy : getIntersectingObjects(Hero.class)) {
           if (getWorld() instanceof Level1){
                gemCollectedL1();
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
    
    public void Level5(){
        if((gemCollectedL1 == true) && (groen.gemCollectedL2 == true) && (rood.gemCollectedL3 == true) && (geel.gemCollectedL4 == true)){
            Greenfoot.setWorld(new Level5());
        }
        else{
            Greenfoot.setWorld(new Diamantloos());
        }
    }
}
