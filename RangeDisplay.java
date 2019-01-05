import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class RangeDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RangeDisplay extends Actor
{
    private GreenfootImage imageRange = new GreenfootImage(1, 1);
    
    private int range;
    
    public RangeDisplay(){
        this.setImage(imageRange);
    }
    
    public void drawRange(Towers tower){
        range = tower.getRange();
        imageRange = new GreenfootImage(range * 2 + 2, range * 2 + 2);
        
        int tempX = tower.getX();
        int tempY = tower.getY() + (tower.getImage().getHeight() / 2) - (tower.getImage().getHeight() / 4 * 3);
        
        this.setLocation(tempX, tempY);
        
        imageRange.setColor(tower.getRangeColor());
        imageRange.drawOval(1, 1, range * 2, range * 2);
        this.setImage(imageRange);
    }
    
    
    @Override
    public void act(){
        //do nothing!
    }
}
