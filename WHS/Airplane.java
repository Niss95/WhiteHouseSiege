import greenfoot.*;

/**
 * Write a description of class Airplane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Airplane extends Objects
{
    public Airplane(){
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/5);
    }
    /**
     * Act - do whatever the Airplane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-2);
        
        if(getX() == 0){
            setLocation(getWorld().getWidth()-1, Greenfoot.getRandomNumber(180)+30);
        }
    }    
}
