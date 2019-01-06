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
        this.setBackground(Engine.ImageLoader._image_MainMenu_BackGround);

        baseLevel = new Base(this);
        desertLevel = new Desert(this);
        forestLevel = new Forest(this);

        addObject(new MenuButton(MenuButton.ButtonType.Start), (this.getWidth() / 2), (this.getHeight()) / 3 * 2);  //Start Button
        addObject(new MenuButton(MenuButton.ButtonType.Exit), (this.getWidth() / 2), (this.getHeight()) / 6 * 5);  //Exit Button
    }
    
    public void startPressed(){
        switchWorldTo(levelTypes.BASE);
    }
    
    public void switchWorldTo(MainMenu.levelTypes type){
        switch(type){
            case BASE:
                //Engine.GameValues._GameOver = false;
                Engine.GameValues._RoundStarted = false;
                Greenfoot.setWorld(baseLevel);
                break;
            case DESERT:
                desertLevel = new Desert(this);
                desertLevel.initValues();
                Greenfoot.setWorld(desertLevel);
                break;
            case FOREST:
                forestLevel = new Forest(this);
                forestLevel.initValues();
                Greenfoot.setWorld(forestLevel);
                break;
        }
    }
}
