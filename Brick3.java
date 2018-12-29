import greenfoot.*;

/**
 * Write a description of class brick3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brick3 extends Platforms
{
    private GreenfootImage image = new GreenfootImage("brick3.png");

    public Brick3(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()*2, getImage().getHeight());
    }
    
    /**
     * Act - do whatever the brick3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
