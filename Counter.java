import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

public class Counter extends Actor
{
    int score = 0;
    public Counter() 
    {
        setImage(new GreenfootImage("silver coins : "+ score, 24, Color.WHITE, Color.BLACK));
    }
    
    public void addScore(){
        score ++;
    }
}
