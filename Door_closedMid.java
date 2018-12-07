import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door_closedMid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door_closedMid extends Mover
{
   KeyBlue sleutel = new KeyBlue();
   GemBlue gem = new GemBlue();
   GemGreen gemG = new GemGreen();
   GemRed gemR = new GemRed();
   GemYellow gemY = new GemYellow();
    public void act() 
   {
       if(getOneIntersectingObject(Hero.class)!= null && getWorld().getObjects(KeyBlue.class).isEmpty())
        {
            if (getWorld() instanceof Level5){
                Greenfoot.setWorld(new Overwinningscherm());
                sleutel.levelStart();
            }
            else{
                Greenfoot.setWorld(new LevelSelect());
                sleutel.levelStart();
                gem.levelStart();
                gemG.levelStart();
                gemR.levelStart();
                gemY.levelStart();
            }
            }
       applyVelocity();
   }    
}
