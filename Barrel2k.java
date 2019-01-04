import greenfoot.*;

/**
 * Write a description of class Barrel2k here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrel2k extends Barrels
{
    private GreenfootImage image = new GreenfootImage("barrel1.png");
    
    public Barrel2k(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);

    }
}
