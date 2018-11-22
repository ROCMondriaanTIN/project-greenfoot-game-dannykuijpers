import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

public class Counter extends Actor
{
    static int score = 0;
    public void act() 
    {
        setImage(new GreenfootImage("= "+ score, 24, Color.BLACK, null));
    }
    
    public void addSilverCoin(){
        score += 1;
    }
    
    public void addGoldCoin(){
        score += 2;
    }
}
