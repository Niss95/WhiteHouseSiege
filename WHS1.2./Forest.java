import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends World
{
    

    /**
     * Constructor for objects of class Forest.
     * 
     */
    public Forest()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1800, 900, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        addObject(new GroundForest(), 500, 900);
        Steel steel2 = new Steel();
        Coin coin = new Coin();
        Barrels barrels = new Barrels();
        addObject(barrels, 1675, 22);
        addObject(steel2, 1724, 22);
        addObject(coin, 1621, 21);
       
        TURM turm = new TURM();
        addObject(turm,1324,489);
        TURM turm2 = new TURM();
        addObject(turm2,666,488);
        turm2.setLocation(614,483);
        HEADQ headq = new HEADQ();
        addObject(headq,704,546);
        headq.setLocation(701,561);
        Clouds clouds = new Clouds();
        addObject(clouds,1651,73);
        Clouds clouds2 = new Clouds();
        addObject(clouds2,1532,127);
        Clouds2 clouds22 = new Clouds2();
        addObject(clouds22,829,69);
        turm.setLocation(1380,487);
        removeObject(turm);
        removeObject(headq);
        removeObject(turm2);
        HolzPalisade holzpalisade = new HolzPalisade();
        addObject(holzpalisade,507,100);
        HolzPalisade holzpalisade2 = new HolzPalisade();
        addObject(holzpalisade2,967,150);
        HolzPalisade holzpalisade3 = new HolzPalisade();
        addObject(holzpalisade3,1256,140);
        HolzPalisade holzpalisade4 = new HolzPalisade();
        addObject(holzpalisade4,556,224);
        HolzPalisade holzpalisade5 = new HolzPalisade();
        addObject(holzpalisade5,909,212);
        HolzPalisade holzpalisade6 = new HolzPalisade();
        addObject(holzpalisade6,1272,204);
        holzpalisade4.setLocation(743,488);
        holzpalisade5.setLocation(911,487);
        holzpalisade6.setLocation(1078,487);
        holzpalisade3.setLocation(1246,486);
        holzpalisade6.setLocation(1079,486);
        holzpalisade2.setLocation(1414,487);
        holzpalisade.setLocation(576,488);
        WhiteHouse whitehouse2 = new WhiteHouse();
        addObject(whitehouse2,980,329);
        whitehouse2.setLocation(1016,470);
        TURM turm3 = new TURM();
        addObject(turm3,1417,489);
        TURM turm4 = new TURM();
        addObject(turm4,577,490);
        HEADQ headq2 = new HEADQ();
        addObject(headq2,722,278);
        headq2.setLocation(690,562);

        addObject(new Mexican("right"), 500, 300);
        addObject(new Chinese("left"), 900, 300);
        addObject(new Arab("left"), 900, 300);

        Player player = new Player();
        addObject(player, 701, 507);
    }  
}
        


