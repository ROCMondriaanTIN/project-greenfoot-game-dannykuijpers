
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
    //Testvijand test = new Testvijand();
    
    
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
    static int waardeCoin = 1;
    int blueCoin = 0;
    private int greenCoin = 0;
    private int pinkCoin = 0;


    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p" + waardeCoin + ".png");
    }

    @Override
    public void act() {
        handleInputP1();
        greenCoin();
        blueCoin();
        pinkCoin();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        
        if (oldY < getY() || oldY > getY()){
            canJump = false;
        }
        else{
            canJump = true;
        }
        if(Greenfoot.isKeyDown("up") == false) oldY = getY();

        LifeCounter water = new LifeCounter();
        for(Actor liquidWater: getIntersectingObjects(TileExtended.class)){
            TileExtended tile = (TileExtended) liquidWater;
            if(tile != null && tile.type == "water"){
                if (getWorld() instanceof Level1) Greenfoot.setWorld(new Level1());
                if (getWorld() instanceof Level2) Greenfoot.setWorld(new Level2());
                water.takelife();
                break;
            }
        }
        
    }
    
    public void greenCoin() {
        if(isTouching(Greencoin.class)) {
            waardeCoin = 1;
            removeTouching(Greencoin.class);
        }
    }
    
    public void blueCoin() {
        if(isTouching(Bluecoin.class)) {
            waardeCoin = 2;
            //removeTouching(Bluecoin.class);
        }
    }
    
    public void pinkCoin() {
        if(isTouching(Pinkcoin.class)) {
            waardeCoin = 3;
            removeTouching(Pinkcoin.class);
        }
    }

    
    public void handleInputP1() {
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
        else if (Greenfoot.isKeyDown("down")){
            animateduck();
        }
    }
    
    public void animateduck(){
        setImage("p"+ waardeCoin +"_duck.png");
    }
    
    public void animatejump(){
        setImage("p" + waardeCoin + "_jump.png");
    }
    
    public void animateleft(){
        if(frame == 1)
        {
            setImage("p"+waardeCoin+"_walk01_mirrored.png");
        }
        else if(frame == 2)
        {
             setImage("p"+waardeCoin+"_walk02_mirrored.png");
        }
        else if(frame == 3)
        {
            setImage("p"+waardeCoin+"_walk03_mirrored.png");
        }
        else if(frame == 4)
        {
            setImage("p"+waardeCoin+"_walk04_mirrored.png");
        }
        else if(frame == 5)
        {
            setImage("p"+waardeCoin+"_walk05_mirrored.png");
        }
        else if(frame == 6)
        {
            setImage("p"+waardeCoin+"_walk06_mirrored.png");
        }
        else if(frame == 7)
        {
            setImage("p"+waardeCoin+"_walk07_mirrored.png");
        }
        else if(frame == 8)
        {
            setImage("p"+waardeCoin+"_walk08_mirrored.png");
        }
        else if(frame == 9)
        {
            setImage("p"+waardeCoin+"_walk09_mirrored.png");
        }
        else if(frame == 10)
        {
            setImage("p"+waardeCoin+"_walk10_mirrored.png");
        }
        else if(frame == 11)
        {
            setImage("p"+waardeCoin+"_walk11_mirrored.png");
            frame = 1;
            return;
        }
        frame++;
    }
    
    public void animateright(){
        if(frame == 1)
        { 
            setImage("p"+waardeCoin+"_walk01.png" );
        }
        else if(frame == 2)
        {
            setImage("p"+waardeCoin+"_walk02.png");
        }
        else if(frame == 3)
        {
            setImage("p"+waardeCoin+"_walk03.png");
        }
        else if(frame == 4)
        {
            setImage("p"+waardeCoin+"_walk04.png");
        }
        else if(frame == 5)
        {
            setImage("p"+waardeCoin+"_walk05.png");
        }
        else if(frame == 6)
        {
            setImage("p"+waardeCoin+"_walk06.png");
        }
        else if(frame == 7)
        {
            setImage("p"+waardeCoin+"_walk07.png");
        }
        else if(frame == 8)
        {
            setImage("p"+waardeCoin+"_walk08.png");
        }
        else if(frame == 9)
        {
            setImage("p"+waardeCoin+"_walk09.png");
        }
        else if(frame == 10)
        {
            setImage("p"+waardeCoin+"_walk10.png");
        }
        else if(frame == 11)
        {
            setImage("p"+waardeCoin+"_walk11.png");
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