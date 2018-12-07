import greenfoot.*;

/**
 * Write a description of class spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawner extends Actor
{
    private World world;
    private int groundHight = 545;
    private boolean done = false;
    private int delay = 3;
    private int anzahl = 1;
    private SimpleTimer timer = new SimpleTimer();
    private int midX = 501;
    private int midY = 301;

    public Spawner(World world){
        this.world = world;
        loadBuildings();
    }

    /**
     * Act - do whatever the spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(done == false){
            timer.mark();
            done = true;
        }
        
        

        //int anzahl = 10;
        //spawnEnemys(10, 'c');
        
        
        
        if(timer.millisElapsed() > (delay * 1000) && anzahl > 0  )
        {
            world.addObject(new Mexican("left"), midX + 480, 300);
            world.addObject(new Mexican("right"), midX - 480, 300);
            timer.mark();
            anzahl = anzahl -1;
        }

            
    } 
    
    private void loadBuildings(){
        world.addObject(new Wall(), midX + 300, groundHight);
        world.addObject(new Wall(), midX - 300, groundHight);
        world.addObject(new PhysicalTower(), midX + 250, groundHight);
        world.addObject(new PhysicalTower(), midX - 250, groundHight);

    }
    
    /*
     * Anzahl == Wie viele Gegner sollen insgesammt gespawnt werden?
     * 
     * Typ: 
     *      a == Araber
     *      m == Mexicaner
     *      c == Chinese
     */
    private void spawnEnemys(int anzahl, char Typ){

        switch(Typ){ 
            case 'm':
            spawnMexican(anzahl);
            break;
            case 'c': 
            spawnChinese(anzahl);
            break; 
            case 'a': 
            spawnArab(anzahl);
            break;
            default: 
            spawnChinese(anzahl); 
        } 
    }

    public void spawnMexican(int anzahl){
        
    }

    public void spawnChinese(int anzahl){
        for(int i = 1; i <= anzahl; i++){
            world.addObject(new Chinese("left"), 900, 300);
        }
    }

    public void spawnArab(int anzahl){
        for(int i = 1; i <= anzahl; i++){
            world.addObject(new Arab("left"), 900, 300);
        }
    }
}
