import greenfoot.*;

/**
 * Write a description of class Tower here.
 * 
 * @author (Sven)
 * @version (a version number or a date)
 */
public class Tower extends Visuals
{
     private GreenfootImage image = new GreenfootImage("tower.png");

   public Tower(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
       
    }    
}
