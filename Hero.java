
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    int oldY;
    boolean canJump = true;
    
    private GreenfootImage walk1 = new GreenfootImage("p1_walk01.png");
    private GreenfootImage walk2 = new GreenfootImage("p1_walk02.png");
    private GreenfootImage walk3 = new GreenfootImage("p1_walk03.png");
    private GreenfootImage walk4 = new GreenfootImage("p1_walk04.png");
    private GreenfootImage walk5 = new GreenfootImage("p1_walk05.png");
    private GreenfootImage walk6 = new GreenfootImage("p1_walk06.png");
    private GreenfootImage walk7 = new GreenfootImage("p1_walk07.png");
    private GreenfootImage walk8 = new GreenfootImage("p1_walk08.png");
    private GreenfootImage walk9 = new GreenfootImage("p1_walk09.png");
    private GreenfootImage walk10 = new GreenfootImage("p1_walk10.png");
    private GreenfootImage walk11 = new GreenfootImage("p1_walk11.png");
    private int frame = 1;


    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        
        if (oldY < getY() || oldY > getY()){
            canJump = false;
        }
        else{
            canJump = true;
        }
        if(Greenfoot.isKeyDown("up") == false) oldY = getY();
    }
    

    
    public void handleInput() {
        if (Greenfoot.isKeyDown("up") && canJump == true){
            velocityY = -15;
        }
        
        if (Greenfoot.isKeyDown("left")) {
            velocityX = -5;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 5;
            animateright();
        }
    }
    
    public void animateright()
    {
        if(frame == 1)
        {
            setImage(walk1);
        }
        else if(frame == 2)
        {
            setImage(walk2);
        }
        else if(frame == 3)
        {
            setImage(walk3);
        }
        else if(frame == 4)
        {
            setImage(walk4);
        }
        else if(frame == 5)
        {
            setImage(walk5);
        }
        else if(frame == 6)
        {
            setImage(walk6);
        }
        else if(frame == 7)
        {
            setImage(walk7);
        }
        else if(frame == 8)
        {
            setImage(walk8);
        }
        else if(frame == 9)
        {
            setImage(walk9);
        }
        else if(frame == 10)
        {
            setImage(walk10);
        }
        else if(frame == 11)
        {
            setImage(walk11);
            frame = 1;
            return;
        }
        frame ++;
    }
    
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
