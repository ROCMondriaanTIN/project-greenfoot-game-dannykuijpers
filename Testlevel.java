import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Testlevel extends World
{
    private CollisionEngine ce;
    Counter counter = new Counter();
    LifeCounter lifecounter = new LifeCounter();
    
    public Testlevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        this.setBackground("bg.png");
        int[][] map = {
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {25,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,25},
            {24,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,24},
            {24,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,24},
            {24,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,24},
            {24,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,24},
            {24,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,24},
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
        
        addObject(counter, 900, 30);
        addObject(lifecounter, 71, 30);
        addObject(camera, 0, 0);
        addObject(hero, 400, 700);
        addObject(new Pinkcoin(), 1110, 930);
        //addObject(new Door_closedMid(), 1050, 810);
        // addObject(new CoinSilver(), 500, 810);
        //addObject(new Testvijand(), 600, 822);
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
        Counter counter = new Counter();
        addObject(counter,70,83);
        counter.setLocation(57,22);
        counter.setLocation(59,20);
        counter.setLocation(94,34);
        counter.setLocation(74,20);
        Counter counter2 = new Counter();
        addObject(counter2,859,402);
        counter2.setLocation(775,405);
        removeObject(counter2);
        KeyBlue keyBlue = new KeyBlue();
        addObject(keyBlue,677,652);
        removeObject(counter);
        CoinGold coinGold = new CoinGold();
        addObject(coinGold,627,741);
        removeObject(coinGold);
        CoinGold coinGold2 = new CoinGold();
        addObject(coinGold2,459,649);
        CoinGold coinGold3 = new CoinGold();
        addObject(coinGold3,261,657);
        CoinGold coinGold4 = new CoinGold();
        addObject(coinGold4,523,578);
        CoinSilver coinSilver = new CoinSilver();
        addObject(coinSilver,302,691);
        CoinSilver coinSilver2 = new CoinSilver();
        addObject(coinSilver2,259,724);
        CoinSilver coinSilver3 = new CoinSilver();
        addObject(coinSilver3,201,699);
        CoinSilver coinSilver4 = new CoinSilver();
        addObject(coinSilver4,240,678);
        CoinSilver coinSilver5 = new CoinSilver();
        addObject(coinSilver5,296,654);
        removeObject(coinSilver4);
        removeObject(coinSilver5);
        removeObject(coinGold3);
        removeObject(coinSilver);
        removeObject(coinSilver2);
        removeObject(coinSilver3);
        removeObject(coinGold2);
        removeObject(coinGold4);
        removeObject(keyBlue);

       
        Bluecoin bluecoin = new Bluecoin();
        addObject(bluecoin,850,751);
        Pinkcoin pinkcoin = new Pinkcoin();
        addObject(pinkcoin,581,753);
    }
}
