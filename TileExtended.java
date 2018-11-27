import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TileExtended here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TileExtended extends Tile
{
    /**
     * Act - do whatever the TileExtended wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected String type;
    public TileExtended(String image, int width, int height, String type){
      super(image, width, height);
      this.type = type;
    }
    
    public void act() 
    {
        
    }    
}
