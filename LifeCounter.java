import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

public class LifeCounter extends Actor
{
    static int lifes = 3;
    public void act() 
    {
        setImage(new GreenfootImage("levens: "+ lifes, 24, Color.BLACK, null));
    }
    
    public void takelife(){
        lifes -= 1;
        if (lifes < 0){
            Greenfoot.setWorld(new StartScreen());
            lifes = 3;
        }
    }
    
    public void extraleven(){
        lifes ++;
    }
}