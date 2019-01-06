import greenfoot.*;

/**
 * Write a description of class ReadyButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReadyButton extends Buttons
{
    private GreenfootImage image_visible = Engine.ImageLoader._ReadyButton;

    private GreenfootImage image_invisible = new GreenfootImage(1, 1);

    private boolean visible = true;

    public ReadyButton(){
        this.setImage(image_visible);
    }

    public void act() {

        if (visible && Greenfoot.mouseClicked(this)) {
            setVisible(false);
            ((Base) getWorld()).startRound();
        }
    }

    public void setVisible(boolean visible){
        this.visible = visible;
        calcImage();
    }

    private void calcImage(){
        if(this.visible){
            this.setImage(image_visible);
        }
        else{
            this.setImage(image_invisible);
        }
    }
}
