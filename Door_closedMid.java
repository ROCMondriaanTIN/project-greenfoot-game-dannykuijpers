import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door_closedMid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door_closedMid extends Mover
{
   
   public void act() 
   {
    for (Actor enemy : getIntersectingObjects(Hero.class)) {
           if (enemy != null){
                if (getWorld() instanceof Level1) Greenfoot.setWorld(new LevelSelect());
                if (getWorld() instanceof Level2) Greenfoot.setWorld(new LevelSelect());
                return;
           }
    }
    applyVelocity();
   }    
}
