import greenfoot.*;

/**
 * Write a description of class Tempel_China here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tempel_China extends Visuals
{
   private GreenfootImage image = new GreenfootImage("china.png");

   public Tempel_China(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
       
    }
    /**
     * Act - do whatever the Tempel_China wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
