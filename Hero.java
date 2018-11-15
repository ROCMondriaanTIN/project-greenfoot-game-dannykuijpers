
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
    
    private GreenfootImage P1_walk1R = new GreenfootImage("p1_walk01.png");
    private GreenfootImage P1_walk2R = new GreenfootImage("p1_walk02.png");
    private GreenfootImage P1_walk3R = new GreenfootImage("p1_walk03.png");
    private GreenfootImage P1_walk4R = new GreenfootImage("p1_walk04.png");
    private GreenfootImage P1_walk5R = new GreenfootImage("p1_walk05.png");
    private GreenfootImage P1_walk6R = new GreenfootImage("p1_walk06.png");
    private GreenfootImage P1_walk7R = new GreenfootImage("p1_walk07.png");
    private GreenfootImage P1_walk8R = new GreenfootImage("p1_walk08.png");
    private GreenfootImage P1_walk9R = new GreenfootImage("p1_walk09.png");
    private GreenfootImage P1_walk10R = new GreenfootImage("p1_walk10.png");
    private GreenfootImage P1_walk11R = new GreenfootImage("p1_walk11.png");
    private GreenfootImage P1_walk1L = new GreenfootImage("p1_walk01_mirrored.png");
    private GreenfootImage P1_walk2L = new GreenfootImage("p1_walk02_mirrored.png");
    private GreenfootImage P1_walk3L = new GreenfootImage("p1_walk03_mirrored.png");
    private GreenfootImage P1_walk4L = new GreenfootImage("p1_walk04_mirrored.png");
    private GreenfootImage P1_walk5L = new GreenfootImage("p1_walk05_mirrored.png");
    private GreenfootImage P1_walk6L = new GreenfootImage("p1_walk06_mirrored.png");
    private GreenfootImage P1_walk7L = new GreenfootImage("p1_walk07_mirrored.png");
    private GreenfootImage P1_walk8L = new GreenfootImage("p1_walk08_mirrored.png");
    private GreenfootImage P1_walk9L = new GreenfootImage("p1_walk09_mirrored.png");
    private GreenfootImage P1_walk10L = new GreenfootImage("p1_walk10_mirrored.png");
    private GreenfootImage P1_walk11L = new GreenfootImage("p1_walk11_mirrored.png");
    private GreenfootImage P1_jump = new GreenfootImage("p1_jump.png");
    private GreenfootImage P1_duck = new GreenfootImage("p1_duck.png");
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

        for (Actor enemy : getIntersectingObjects(Slak.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                return;
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
            animatejump();
        }
        
        if (Greenfoot.isKeyDown("left")) {
            velocityX = -5;
            animateleft();
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 5;
            animateright();
        }
        if (Greenfoot.isKeyDown("down")){
            animateduck();
        }
    }
    
    public void animateduck(){
        setImage(P1_duck);
    }
    
    public void animatejump(){
        setImage(P1_jump);
    }
    
    public void animateleft(){
        if(frame == 1)
        {
            setImage(P1_walk1L);
        }
        else if(frame == 2)
        {
            setImage(P1_walk2L);
        }
        else if(frame == 3)
        {
            setImage(P1_walk3L);
        }
        else if(frame == 4)
        {
            setImage(P1_walk4L);
        }
        else if(frame == 5)
        {
            setImage(P1_walk5L);
        }
        else if(frame == 6)
        {
            setImage(P1_walk6L);
        }
        else if(frame == 7)
        {
            setImage(P1_walk7L);
        }
        else if(frame == 8)
        {
            setImage(P1_walk8L);
        }
        else if(frame == 9)
        {
            setImage(P1_walk9L);
        }
        else if(frame == 10)
        {
            setImage(P1_walk10L);
        }
        else if(frame == 11)
        {
            setImage(P1_walk11L);
            frame = 1;
            return;
        }
        frame++;
    }
    
    public void animateright(){
        if(frame == 1)
        { 
            setImage(P1_walk1R);
        }
        else if(frame == 2)
        {
            setImage(P1_walk2R);
        }
        else if(frame == 3)
        {
            setImage(P1_walk3R);
        }
        else if(frame == 4)
        {
            setImage(P1_walk4R);
        }
        else if(frame == 5)
        {
            setImage(P1_walk5R);
        }
        else if(frame == 6)
        {
            setImage(P1_walk6R);
        }
        else if(frame == 7)
        {
            setImage(P1_walk7R);
        }
        else if(frame == 8)
        {
            setImage(P1_walk8R);
        }
        else if(frame == 9)
        {
            setImage(P1_walk9R);
        }
        else if(frame == 10)
        {
            setImage(P1_walk10R);
        }
        else if(frame == 11)
        {
            setImage(P1_walk11R);
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
