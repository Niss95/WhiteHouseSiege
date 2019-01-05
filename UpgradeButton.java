import greenfoot.*;

/**
 * Write a description of class UpgradeButton here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class UpgradeButton extends Buttons
{
    private GreenfootImage image_visible = Engine.ImageLoader._UpgradeButton_visible;
    private GreenfootImage image_invisible = Engine.ImageLoader._UpgradeButton_invisible;
    
    public UpgradeButton(){
        this.setImage(image_visible);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            
            //do stuff
        }
    }
}
