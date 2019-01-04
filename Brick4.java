import greenfoot.*;

/**
 * Write a description of class brick4 here.
 * 
 * @author (Sven) 
 * @version (a version number or a date)
 */
public class Brick4 extends Platforms
{
    private GreenfootImage image = new GreenfootImage("brick4.png");

    public Brick4(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()*2, getImage().getHeight());
    }  
}
