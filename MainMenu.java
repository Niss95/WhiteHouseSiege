import greenfoot.*;

/**
 * Startpunkt für das Spiel!
 * 
 * Von hier aus wird alles weitere gestartet.
 * 
 * @author (Dennis Sellemann)
 */
public class MainMenu extends World
{
    private Base baseLevel;
    private Desert desertLevel;
    private Forest forestLevel;
    
    private static int width = 1800;
    private static int heigth = 900;
    
    public enum levelTypes{
        BASE, DESERT, FOREST;
    }
    
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        super(width, heigth, 1); 
        prepare();
    }
    
    private void prepare(){
        this.setBackground(new GreenfootImage("mainMenu_background.png"));
        
        baseLevel = new Base(this);
        desertLevel = new Desert(this);
        forestLevel = new Forest(this);

        addObject(new MenuButton(MenuButton.ButtonType.Start), (this.getWidth() / 2), (this.getHeight()) / 3 * 2);  //Start Button
        addObject(new MenuButton(MenuButton.ButtonType.Exit), (this.getWidth() / 2), (this.getHeight()) / 6 * 5);  //Start Button
    }
    
    public void startPressed(){
        Engine.GameValues._GameOver = false;
        switchWorldTo(levelTypes.BASE);
    }
    
    public void switchWorldTo(MainMenu.levelTypes type){
        switch(type){
            case BASE:
                Greenfoot.setWorld(baseLevel);
                break;
            case DESERT:
                Greenfoot.setWorld(desertLevel);
                break;
            case FOREST:
                Greenfoot.setWorld(forestLevel);
                break;
        }
    }
}
