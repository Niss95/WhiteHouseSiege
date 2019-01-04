import greenfoot.*;

/**
 * Write a description of class Base here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class Base extends Level
{
    private Base_Ground ground;
    private Base_Spawner spawner;
    
    private GreenfootImage background = new GreenfootImage("base_background.png"); 

    public Base(MainMenu menu)
    {    
        super(menu, Engine.Config._Width, Engine.Config._Height); 
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
