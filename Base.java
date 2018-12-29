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

    public Base()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height); 
        this.setBackground(new GreenfootImage("base_background.png"));
        prepare();
    }

    
    
    private void prepare()
    {
        

        ground = new Base_Ground();
        addObject(ground, width / 2, height - (ground.getImage().getHeight() / 2));
        
        
    }
}
