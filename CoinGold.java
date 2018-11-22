import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoinGold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinGold extends Mover
{

    public void act() 
    {
        Counter CoinGold = new Counter();
         for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                CoinGold.addGoldCoin();
                return;
            }
        }
        applyVelocity();  
    }    
}
