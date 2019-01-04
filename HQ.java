import greenfoot.*;

/**
 * Write a description of class HEADQ here.
 * 
 * @author (Sven) 
 * @version (a version number or a date)
 */
public class HQ extends Grounds
{
    private GreenfootImage image = new GreenfootImage("hq.png");

    public HQ(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }   
}
