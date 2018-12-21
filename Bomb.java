import greenfoot.*;

/**
 * Write a description of class Airplane2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Objects
{
    public Bomb(){
        getImage().scale(getImage().getWidth()/7, getImage().getHeight()/8);
    }
    
    /**
     * Act - do whatever the Airplane2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(2);
        if(getX() == 940){
            setLocation(0, Greenfoot.getRandomNumber(180)+30);
        }
    }    
}
