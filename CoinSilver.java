import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CoinSilver extends Mover
{

    public void act() 
    {
        Counter CoinSilver = new Counter();
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                CoinSilver.addSilverCoin();
                return;
            }
        }
        applyVelocity();
    }    
    
}
