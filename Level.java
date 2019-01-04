import greenfoot.*;

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{
    public MainMenu menu;
    public Level(MainMenu menu, int width, int height)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(width, height, 1);
        this.menu = menu;
    }
    
    public MainMenu getMenu(){return menu;}
}
