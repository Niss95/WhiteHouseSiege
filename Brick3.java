import greenfoot.*;

/**
 * Write a description of class brick3 here.
 * 
 * @author (Sven) 
 * @version (a version number or a date)
 */
public class Brick3 extends Platforms
{
    private GreenfootImage image = new GreenfootImage("brick3.png");

    public Brick3(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()*2, getImage().getHeight());
    }   
}
