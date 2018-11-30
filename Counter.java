import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

public class Counter extends Actor
{
    static int score = 0;
    static int goldscore = 0;
    LifeCounter test = new LifeCounter();
    public void act() 
    {
        setImage(new GreenfootImage("zilver: "+ score + " goud: " + goldscore, 24, Color.BLACK, null));
        if (score + goldscore > 20){
            test.extraleven();
            score = 0;
            goldscore = 0;
        }
    }
    
    public void addSilverCoin(){
        score += 1;
    }
    
    public void addGoldCoin(){
        goldscore += 2;
    }
    
}
