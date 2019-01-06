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
    private GreenfootImage image_unclickable = Engine.ImageLoader._UpgradeButton_unclickable;
    private GreenfootImage image_invisible = new GreenfootImage(1, 1);

    private int posX;
    private int posY;

    private Buildings building;

    private boolean visible;

    public UpgradeButton(Buildings building){
        this.setImage(image_visible);
        this.building = building;
        visible = true;
        posX = building.getX();
        posY = building.getY();
    }

    public void act() {
        
        calcImage();
        
        if (visible && Greenfoot.mouseClicked(this)) {
            building.upgrade();
            setLocation(getX(), getY());
        }
    }
    
    private void calcImage(){
        if(this.visible){
            if(building.checkUpgradebal()){
                this.setImage(image_visible);
            }
            else{
                this.setImage(image_unclickable);
            }

        }
        else{
            this.setImage(image_invisible);
        }
    }

    public void setVisible(boolean visible){
        this.visible = visible;
        
    }

    public int getPosX(){
        return posX;
    }

    public int getPosY(){
        return posY;
    }
}
