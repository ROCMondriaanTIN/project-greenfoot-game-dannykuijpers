import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door_closedMid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door_closedMid extends Mover
{
    /**
     * Act - do whatever the Door_closedMid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null){
                if (getWorld() instanceof Level1) Greenfoot.setWorld(new Testlevel());
                if (getWorld() instanceof Testlevel) Greenfoot.setWorld(new Level1());
                return;
            }
        }
        
        applyVelocity();
    }    
}
