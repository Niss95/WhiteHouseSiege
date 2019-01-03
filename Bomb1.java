import greenfoot.*;

/**
 * Write a description of class Bomb1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb1 extends Airplane
{
    private GreenfootImage image = new GreenfootImage("bombR.png");

   public Bomb1(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/7, getImage().getHeight()/8);
       
    }
    /**
     * Act - do whatever the Bomb1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }    
}
