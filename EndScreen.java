import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{
   private GreenfootImage image = new GreenfootImage(Engine.ImageLoader._image_EndScreen); 

    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {
        super(Engine.Config._Width, Engine.Config._Height, 1);
        prepare();
    }
    
    private void prepare(){
        draw();
        this.setBackground(image);
        addObject(new MenuButton(MenuButton.ButtonType.Exit), (this.getWidth() / 2), (this.getHeight()) / 6 * 5);  //Start Button
    }
    
    private void draw(){
        image.setColor(Color.RED);
        image.setFont(image.getFont().deriveFont(32f));
        String text = "[ You survived : " + Engine.GameValues._currentRound + " rounds ]";
        image.drawString(text, (this.getWidth() / 2) - 220, (this.getHeight() / 2) - 100);
    }
}
