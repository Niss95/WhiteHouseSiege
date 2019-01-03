import greenfoot.*;

/**
 * Write a description of class Base here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Base extends Level
{

    private static int width = 1800;
    private static int height = 900;

    private Base_Ground ground;
    private Base_Spawner spawner;
    
    private GreenfootImage background = new GreenfootImage("base_background.png"); 

    public Base()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height); 
        this.setBackground(background);
        
        spawner = new Base_Spawner(this);
        this.addObject(spawner, 0, 0);
        prepare();
        
        startRound();
    }

    
    
    private void prepare()
    {

        spawner.spawnGround();
        spawner.spawnBuildings();
    }
    
    private void startRound(){
        spawner.setSpawning(true);
    }
}
