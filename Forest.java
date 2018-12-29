import greenfoot.*;

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends Platformer
{
    private static int width = 1800;
    private static int height = 900;
    
    private Base_Ground ground;
    public Forest()
    {
        super(width, height);
        this.setBackground(new GreenfootImage("forest_background.png"));
        
        
        prepare();
    }
    
    
    private void prepare()
    {
        

        ground = new Base_Ground();
        addObject(ground, width / 2, height - (ground.getImage().getHeight() / 2));
        
        spawnObjects();
    }
    
    private void spawnObjects(){
        addObject(new Forest_Ground(), 500, 900);
        Steel steel2 = new Steel();
        Coin coin = new Coin();
        Barrels barrels = new Barrel1();
        addObject(barrels, 1675, 22);
        addObject(steel2, 1724, 22);
        addObject(coin, 1621, 21);
       
        //TURM turm = new TURM();
        //addObject(turm,1324,489);
        //TURM turm2 = new TURM();
        //addObject(turm2,666,488);
        //turm2.setLocation(614,483);
        HQ headq = new HQ();
        addObject(headq,704,546);
        headq.setLocation(701,561);
        Clouds clouds = new Cloud1();
        addObject(clouds,1651,73);
        Clouds clouds2 = new Cloud2();
        addObject(clouds2,1532,127);
        Clouds clouds22 = new Cloud2();
        addObject(clouds22,829,69);
        //turm.setLocation(1380,487);
        //removeObject(turm);
        //removeObject(headq);
        //removeObject(turm2);
        WoodenFence holzpalisade1 = new WoodenFence();
        addObject(holzpalisade1,507,100);
        WoodenFence holzpalisade2 = new WoodenFence();
        addObject(holzpalisade2,967,150);
        WoodenFence holzpalisade3 = new WoodenFence();
        addObject(holzpalisade3,1256,140);
        WoodenFence holzpalisade4 = new WoodenFence();
        addObject(holzpalisade4,556,224);
        WoodenFence holzpalisade5 = new WoodenFence();
        addObject(holzpalisade5,909,212);
        WoodenFence holzpalisade6 = new WoodenFence();
        addObject(holzpalisade6,1272,204);
        holzpalisade4.setLocation(743,488);
        holzpalisade5.setLocation(911,487);
        holzpalisade6.setLocation(1078,487);
        holzpalisade3.setLocation(1246,486);
        holzpalisade6.setLocation(1079,486);
        holzpalisade2.setLocation(1414,487);
        holzpalisade1.setLocation(576,488);
        //WhiteHouse whitehouse2 = new WhiteHouse();
        //addObject(whitehouse2,980,329);
        //whitehouse2.setLocation(1016,470);
        //TURM turm3 = new TURM();
        //addObject(turm3,1417,489);
        //TURM turm4 = new TURM();
        //addObject(turm4,577,490);
        HQ headq2 = new HQ();
        addObject(headq2,722,278);
        headq2.setLocation(690,562);

        addObject(new Mexican("right"), 500, 300);
        addObject(new Chinese("left"), 900, 300);
        addObject(new Arab("left"), 900, 300);

        Player player = new Player();
        addObject(player, 701, 507);
    }
}
