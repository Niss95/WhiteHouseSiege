import greenfoot.*;

/**
 * Write a description of class HEADQ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HQ extends Grounds
{
    private GreenfootImage image = new GreenfootImage("hq.png");

    public HQ(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
            
    /**
     * Act - do whatever the HEADQ wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
