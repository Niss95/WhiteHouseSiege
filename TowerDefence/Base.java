import greenfoot.*;

/**
 * Write a description of class Base here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Base extends World
{
    /**
     * Constructor for objects of class Base.
     * 
     */
    public Base()
    {    
        // Create a new world with 1001x601 cells with a cell size of 1x1 pixels.
        super(1001, 601, 1); 

        prepare();

    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        this.setBackground(new GreenfootImage("background.png"));
        addObject(new Ground(), 500, 585);
        
        addObject(new Spawner(this), 0, 0);
        //addObject(new Player(), 500, 300);

        

    }

    
}
