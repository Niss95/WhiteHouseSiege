import greenfoot.*;

/**
 * Write a description of class Steel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Steel extends Collectables
{
    private GreenfootImage image = new GreenfootImage("steel1.png");

    public Steel(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/6, getImage().getHeight()/6);
    }     
}
