import greenfoot.*;

/**
 * Write a description of class Button here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public class MenuButton extends Buttons
{   
    public static GreenfootImage startButton = Engine.ImageLoader._startButton;
    public static GreenfootImage exitButton = Engine.ImageLoader._exitButton;
    
    private ButtonType type;
    
    
    public enum ButtonType{
        Start, Exit;
    }
    
    public MenuButton(ButtonType type){
        switch(type){
            case Start:
                this.type = type;
                this.setImage(startButton);
                break;
            case Exit:
                this.type = type;
                this.setImage(exitButton);
                break;
        }
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            if(type == ButtonType.Start){
                ((MainMenu) getWorld()).startPressed();
            }
            else if(type == ButtonType.Exit){
                Greenfoot.stop();
            }
        }
    }
}
