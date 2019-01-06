import greenfoot.*;

/**
 * Write a description of class PlatformEnemys here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public abstract class PlatformerEnemys extends Enemys
{
    private GreenfootImage image_right;
    private GreenfootImage image_left;
    
    public void act() 
    {
        
        
        if(!this.grounded()){
            gravity();
        }
        if(grounded()){
            run(getDirection(), image_right, image_left); //////hier!
        }
        
        //ab hier alle Aktionen!
        direction();
        beam();
        
        checkDeath();
    }  
    
    public abstract void beam();
    
    //Getter & Setter:
    public void setImages(GreenfootImage image_right, GreenfootImage image_left){
        this.image_right = image_right;
        this.image_left = image_left;
    }
}
