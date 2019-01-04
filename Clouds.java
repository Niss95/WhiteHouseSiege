import greenfoot.*;

/**
 * Write a description of class Clouds here.
 * 
 * @author (Sven)
 * @version (a version number or a date)
 */
public abstract class Clouds extends Visuals
{
    public void act() 
    {
        move(-1);
        if(getX() == 0){
            setLocation(getWorld().getWidth()-1, Greenfoot.getRandomNumber(170)+30);
        }
    }    
}
