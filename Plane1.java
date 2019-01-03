import greenfoot.*;

/**
 * Write a description of class Plane1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane1 extends Airplane
{  private GreenfootImage image = new GreenfootImage("planeo.png");

   public Plane1(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
       
    }
    /**
     * Act - do whatever the Plane1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
