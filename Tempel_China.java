import greenfoot.*;

/**
 * Write a description of class Tempel_China here.
 * 
 * @author (Sven)
 * @version (a version number or a date)
 */
public class Tempel_China extends Visuals
{
   private GreenfootImage image = new GreenfootImage("china.png");

   public Tempel_China(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
       
    }
   
}
