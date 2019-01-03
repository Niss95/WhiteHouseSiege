import greenfoot.*;

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends LevelObjects
{
    private GreenfootImage image = new GreenfootImage("lakzsmid.png");
    
    public Door(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
}
