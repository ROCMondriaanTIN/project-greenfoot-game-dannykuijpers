import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Slak extends Mover
{
    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public Slak() {
        super();
        setImage("slak.png");
        getImage().mirrorHorizontally();
        walkRange = 260;
        firstAct = true;
        speed = 1;
       
    }

    @Override
    public void act() {
        //setImage(new GreenfootImage("levens: "+ lifes, 24, Color.BLACK, null));
        
        LifeCounter slak = new LifeCounter();
        for (Actor enemy : getIntersectingObjects(Hero.class)) {
            if (enemy != null){
                if (getWorld() instanceof Level1) Greenfoot.setWorld(new Level1());
                if (getWorld() instanceof Level2) Greenfoot.setWorld(new Level2());
                if (getWorld() instanceof Level3) Greenfoot.setWorld(new Level3());
                if (getWorld() instanceof Level4) Greenfoot.setWorld(new Level4());
                if (getWorld() instanceof Testlevel) Greenfoot.setWorld(new Testlevel());
                return;
            }
        }
        
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            getImage().mirrorHorizontally();
        }
        if(isTouching(Hero.class)) slak.takelife();
    }
}
