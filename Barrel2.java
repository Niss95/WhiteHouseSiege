import greenfoot.*;

/**
 * Write a description of class Barrel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrel2 extends Barrels
{
    private GreenfootImage image = new GreenfootImage("goldbarrel.png");

    public Barrel2(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/4);
    }    
}
