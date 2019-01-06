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
    private GreenfootImage imageRange_invisible = new GreenfootImage(1, 1);
    private int range;
    private boolean visible;

    private boolean debug = false;

    public RangeDisplay(){
        this.setImage(imageRange);
    }

    public void drawRange(Towers tower){
        if(debug){
            range = tower.getRange();
            imageRange = new GreenfootImage(range * 2 + 2, range * 2 + 2);

            int tempX = tower.getX();
            int tempY = tower.getY() + (tower.getImage().getHeight() / 2) - (tower.getImage().getHeight() / 4 * 3);

            this.setLocation(tempX, tempY);

            imageRange.setColor(tower.getRangeColor());
            imageRange.drawOval(1, 1, range * 2, range * 2);
            this.setImage(imageRange);
            visible = true;
        }
    }

    public void setVisible(boolean visible){
        this.visible = visible;
        if(this.visible){
            setImage(imageRange);
        }
        else{
            setImage(imageRange_invisible);
        }
    }

    @Override
    public void act(){
        //do nothing!
    }
}
