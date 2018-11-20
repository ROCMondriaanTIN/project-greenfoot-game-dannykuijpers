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
       if(getOneIntersectingObject(Hero.class)!= null && getWorld().getObjects(KeyBlue.class).isEmpty())
        {
            Greenfoot.setWorld(new LevelSelect());
        }
       applyVelocity();
   }    
}
