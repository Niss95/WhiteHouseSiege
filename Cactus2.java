import greenfoot.*;

/**
 * Write a description of class Cactus2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus2 extends Cactus
{
        private GreenfootImage image = new GreenfootImage("cactShoot.png");
    public Cactus2(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    /**
     * Act - do whatever the Cactus2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
