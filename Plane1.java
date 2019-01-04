import greenfoot.*;

/**
 * Write a description of class Plane1 here.
 * 
 * @author (Sven)
 * @version (a version number or a date)
 */
public class Plane1 extends Airplane
{  
    private GreenfootImage image = new GreenfootImage("planeo.png");
    public Plane1(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }   
}
