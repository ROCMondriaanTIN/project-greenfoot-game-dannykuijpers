import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaterTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WaterTile extends Tile
{
    /**
     * Act - do whatever the WaterTile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        LifeCounter water = new LifeCounter();
        if(isTouching(Hero.class)) water.takelife();
    }
    public WaterTile(String image, int width, int height){
        super(image, width, height);
    }
       
}