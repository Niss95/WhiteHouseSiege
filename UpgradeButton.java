import greenfoot.*;

/**
 * Write a description of class UpgradeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeButton extends Buttons
{
    private GreenfootImage upgradeButton = new GreenfootImage("upgradeButton.png");
    
    public UpgradeButton(){
        this.setImage(upgradeButton);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            
            //do stuff
        }
    }
}
