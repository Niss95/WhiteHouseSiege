import greenfoot.*;

/**
 * Write a description of class brick2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class brick2 extends Grounds
{
    public brick2(){
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