import greenfoot.*;

/**
 * Write a description of class Tempel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tempel extends Visuals
{
    private GreenfootImage image = new GreenfootImage("temple.png");

   public Tempel(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
       
    }
    /**
     * Act - do whatever the Tempel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
