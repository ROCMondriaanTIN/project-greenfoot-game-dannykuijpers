import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

public class Counter extends Actor
{
    static int score = 0;
    public void act() 
    {
        setImage(new GreenfootImage("silver coins : "+ score, 24, Color.WHITE, Color.BLACK));
    }
    
    public void addScore(){
        score += 1;
    }
}
