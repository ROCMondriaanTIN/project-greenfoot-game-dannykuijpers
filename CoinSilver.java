import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CoinSilver extends Mover
{

    public void act() 
    {
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null) {
                World myWorld = getWorld();
                Testlevel testlevel = (Testlevel)myWorld;
                //Counter counter = Testlevel.getCounter();
                //counter.addScore();
                getWorld().removeObject(this);
                return;
            }
        }
        applyVelocity();
    }    
    
}
