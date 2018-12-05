import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{
    private CollisionEngine ce;
    Counter counter = new Counter();
    LifeCounter lifecounter = new LifeCounter();
    
    /**
     * Constructor for objects of class level1.
     * 
     */
    public Level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        this.setBackground("bg.png");

        int[][] map = {
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,14,14,-1,-1,-1,-1,-1,-1,-1,-1,14,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,14,12,12,12,33,33,33,33,33,33,33,33,12,12,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,12,12,12,12,12,33,33,33,33,33,33,33,33,12,12,12,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,12,12,12,12,12,33,33,33,33,33,33,33,33,12,12,12,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,14,14,12,12,12,12,12,12,33,33,33,33,33,33,33,33,12,12,12,12,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {14,14,14,14,14,14,14,14,12,12,12,12,12,12,12,12,33,33,33,33,33,33,33,33,12,12,12,12,12,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,33,33,33,33,33,33,33,33,33,12,12,12,12,12,12,14,14,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,14,14,14,14,14,14,14,14,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14},
        {12,12,12,12,12,12,12,12,12,12,12,12,12,12,33,33,33,33,33,33,33,33,33,33,12,12,12,12,12,12,12,12,12,14,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,14,12,12,12,12,12,12,12,12,12,12,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,12},
        {12,12,12,12,12,12,12,12,12,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,12,12,12,12,12,12,14,14,-1,-1,-1,-1,14,14,14,14,12,12,12,12,12,12,12,12,12,12,12,12,12,14,-1,-1,-1,-1,-1,-1,-1,-1,14,12,12},
        {12,12,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,12,12,12,14,14,14,14,12,12,12,12,12,12,33,33,33,33,33,33,33,12,12,12,12,12,14,-1,-1,-1,-1,-1,-1,14,12,33,33},
        {12,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,12,12,12,12,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,14,-1,-1,-1,14,14,12,12,33,33},
        {12,12,12,12,33,33,33,33,33,33,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,33,33,33,33,33,33,12,12,12,12,12,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,-1,-1,12,12,12,33,33,33},
        {12,12,12,12,33,33,33,33,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,33,33,33,33,33,12,12,12,12,12,33,33,33,33,33,12,12,12,12,12,12,12,12,12,12,12,33,33,33,33,33,33,12,12,33,33,33,33,33},
        {12,12,12,12,33,33,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,12,12,12,12,12,33,33,33,33,33,33},
        {12,12,12,12,33,33,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,33,33,33,33,33,33,33,33},
        {12,12,12,12,33,33,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,12,12,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,12,12,33,33,33,33,33,33,33},
        {12,12,12,12,33,33,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,12,33,33,33,33,33,33,33,12,12,12,12,33,33,33,33,33,33,33},
        {12,12,12,12,33,33,12,12,12,12,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,12,12,33,33,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,12,12,12,12,12,12,12,12,33,33,33,33,33,33,33,33},
        {12,12,12,12,33,33,33,12,33,33,33,33,12,12,12,12,33,33,12,12,12,33,33,12,12,12,12,12,33,33,33,33,33,33,33,12,12,12,12,12,12,12,12,12,12,33,33,33,33,33,33,33,33,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33},
        {12,12,12,12,33,33,33,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33},
        {12,12,12,12,33,33,33,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33},
        {12,12,12,12,33,33,33,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33},
        {12,12,12,12,33,33,33,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12},
        {12,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12},
        {12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,12,12},
        {12,12,12,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,12,12,12,12,12,12},
        {12,12,12,14,14,14,14,14,14,14,14,14,14,33,33,14,33,33,14,14,33,33,14,14,14,14,14,33,33,14,33,33,14,14,12,14,14,14,12,14,14,14,12,12,12,14,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12},
        {12,12,12,12,12,12,12,12,12,12,12,12,12,24,24,12,24,24,12,12,24,24,12,12,12,12,12,24,24,12,24,24,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12},
        {12,12,12,12,12,12,12,12,12,12,12,12,12,24,24,12,24,24,12,12,24,24,12,12,12,12,12,24,24,12,24,24,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12},
        };
        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 450, 990);
        addObject(counter, 900, 30);
        addObject(lifecounter, 71, 30);
        addObject(new Cross(), 900, 70);
        
        addObject(new CoinSilver(), 1110, 630);
        addObject(new CoinSilver(), 1170, 2190);
        addObject(new CoinSilver(), 2550, 2190);
        addObject(new CoinSilver(), 3570, 1590);
        addObject(new CoinSilver(), 4170, 1950);
        addObject(new CoinGold(), 1530, 630);
        addObject(new KeyBlue(), 330, 2190);
        addObject(new GemYellow(), 510, 1650);
        
        addObject(new Slak(),890, 1305);
        addObject(new Slak(), 3630, 2205);
        addObject(new Slak(), 2190, 2205);
        addObject(new Slak(), 570, 2205);
        addObject(new Slak(), 3150, 1005);
        
        addObject(new Door_closedMid(), 4170, 1045);
        addObject(new Door_closedTop(), 4170, 985);
        // hoogte/breedte * 60 + 30
        

        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);

        prepare();
    }
    
    public Counter getCounter(){
        return counter;
    }
    
    @Override
    public void act() {
        ce.update();
    } 

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
