import greenfoot.*;

/**
 * Write a description of class Airplane2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Airplane2 extends Objects
{
    public Airplane2(){
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/5);
    }
    /**
     * Act - do whatever the Airplane2 wants to do. This method is called whenever
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
