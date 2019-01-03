import greenfoot.*;

/**
 * Write a description of class Bomb2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb2 extends Airplane
{
   private GreenfootImage image = new GreenfootImage("bombR.png");

   public Bomb2(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/7, getImage().getHeight()/8);
       
    }
    /**
     * Act - do whatever the Bomb2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(2);
        if(getX() == 1790){
            setLocation(0, Greenfoot.getRandomNumber(180)+30);
        }
    }    
}
