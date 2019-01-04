import greenfoot.*;

/**
 * Write a description of class Tempel here.
 * 
 * @author (Sven)
 * @version (a version number or a date)
 */
public class Tempel extends Visuals
{
    private GreenfootImage image = new GreenfootImage("temple.png");

   public Tempel(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
       
    }
      
}
