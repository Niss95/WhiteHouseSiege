import greenfoot.*;

/**
 * Write a description of class Bomb1 here.
 * 
 * @author (Sven)
 * @version (a version number or a date)
 */
public class Bomb1 extends Airplane
{
    private GreenfootImage image = new GreenfootImage("bombR.png");

   public Bomb1(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/7, getImage().getHeight()/8);
       
    }
}
