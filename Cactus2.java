import greenfoot.*;

/**
 * Write a description of class Cactus2 here.
 * 
 * @author (Sven)
 * @version (a version number or a date)
 */
public class Cactus2 extends Cactus
{
    private GreenfootImage image = new GreenfootImage("cactShoot.png");
    
    public Cactus2(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }

}
