import greenfoot.*;

/**
 * Write a description of class brick2 here.
 * 
 * @author (Sven) 
 * @version (a version number or a date)
 */
public class BrickMovingWhenTouched extends Platforms
{
    private GreenfootImage image = new GreenfootImage("brick2.png");

    public BrickMovingWhenTouched(){
        this.setImage(image);
        getImage().scale(getImage().getWidth()*2, getImage().getHeight());
    }

    /**
     * Act - do whatever the brick2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Player.class)){
            move(1);
        }
    }    
}
