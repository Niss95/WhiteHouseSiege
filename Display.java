import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display extends Actor
{
    private int width1 = 60;
    private int width10 = 68; // Breite ab Level >= 10!
    private int width100 = 76; // Breite ab Level >= 100!

    private int width = 60;
    private int height = 18;

    private GreenfootImage image = new GreenfootImage(width, height);
    private GreenfootImage image_invisible = new GreenfootImage(1, 1);

    private int stirngX = 2;
    private int stirngY = height - 5;

    private int level;
    private boolean visible;

    public Display(int level, boolean visible){
        this.visible = visible;
        this.level = level;
        checkDisplayBreite();

        redraw();

        if(this.visible){
            this.setImage(image);
        }
        else{
            setImage(image_invisible);
        }
    }

    private void checkDisplayBreite(){
        if(level >= 100){
            width = width100;
            image = new GreenfootImage(width, height);
        }
        else if(level >= 10){
            width = width10;
            image = new GreenfootImage(width, height);
        }
        else{
            width = width1;
            image = new GreenfootImage(width, height);
        }
    }
    

    public void setVisible(boolean visible){
        this.visible = visible;
        if(this.visible){
            setImage(image);
        }
        else{
            setImage(image_invisible);
        }
    }

    public void updateDisplay(int level){
        this.level = level;
        checkDisplayBreite();

        redraw();

        if(this.visible){
            setImage(image);
        }
        else{
            setImage(image_invisible);
        }
    }

    private void redraw(){
        image.setColor(Color.WHITE);
        image.fill();
        image.setColor(Color.BLACK);
        String text = "[ Lvl : " + this.level + " ]";
        image.drawString(text, stirngX, stirngY);
    }

    @Override
    public void act(){
        //do nothing!
    }
}    

