import greenfoot.*;

/**
 * Write a description of class Plane2 here.
 * 
 * @author (Sven)
 * @version (a version number or a date)
 */
public class Plane2 extends Airplane
{
    private GreenfootImage image = new GreenfootImage("Plane1.png");

    public Plane2(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/5);
    }

    /**
     * Act - do whatever the Plane2 wants to do. This method is called whenever
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
