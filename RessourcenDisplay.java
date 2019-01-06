import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class RessourcenDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RessourcenDisplay extends Actor
{
    private int width = 215;
    private int height = 20;

    private GreenfootImage image_visible = new GreenfootImage(width, height);
    private GreenfootImage image_invisible = new GreenfootImage(1, 1);

    private int stirngX = 2;
    private int stirngY = height - 5;

    private int lastRes = Engine.GameValues._RessourcesCurrent;
    private boolean visible;

    public RessourcenDisplay(boolean visible){
        this.visible = visible;

        redraw();

        if(this.visible){
            this.setImage(image_visible);
        }
        else{
            setImage(image_invisible);
        }
    }


    public void setVisible(boolean visible){
        this.visible = visible;
    }

    public void updateDisplay(){

        if(lastRes != Engine.GameValues._RessourcesCurrent){
            lastRes = Engine.GameValues._RessourcesCurrent;
            redraw();
        }
        

        if(this.visible){
            if(!this.getImage().equals(image_visible)){
                setImage(image_visible);
            }
        }
        else{
            if(!this.getImage().equals(image_invisible)){
                setImage(image_invisible);
            }
        }
    }

    private void redraw(){
        image_visible.setColor(Color.WHITE);
        image_visible.fill();
        image_visible.setColor(Color.BLACK);
        String text = "[ Round: " + Engine.GameValues._currentRound + " | Ressources: " + lastRes + " ]";
        image_visible.drawString(text, stirngX, stirngY);
    }

    @Override
    public void act(){
        updateDisplay();
    }
}
