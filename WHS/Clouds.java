import greenfoot.*;

/**
 * Write a description of class Clouds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clouds extends Actor
{
    /**
     * Act - do whatever the Clouds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-1);
        if(getX() == 0){
            setLocation(getWorld().getWidth()-1, Greenfoot.getRandomNumber(170)+30);
        }
    }    
}
