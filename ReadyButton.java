import greenfoot.*;

/**
 * Write a description of class ReadyButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReadyButton extends Buttons
{
    private GreenfootImage image = Engine.ImageLoader._ReadyButton;
    
    public ReadyButton(){
        this.setImage(image);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            ((Base) getWorld()).startRound();
            getWorld().removeObject(this);
        }
    }
}
