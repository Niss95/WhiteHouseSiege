import greenfoot.*;

/**
 * Write a description of class brick here.
 * 
 * @author (Sven) 
 * @version (a version number or a date)
 */
public class Brick1 extends Platforms
{
    private GreenfootImage image = new GreenfootImage("brick1.png");
    
    public Brick1(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()*2, getImage().getHeight());
    }   
}
