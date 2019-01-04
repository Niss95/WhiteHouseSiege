import greenfoot.*;

/**
 * Write a description of class Wall here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class Wall extends AttackableBuildings
{
    private GreenfootImage image = Engine.ImageLoader._image_Wall;
    
    private int initHealth = 200;
    
    public Wall(){
        this.setImage(image);
        initHp(initHealth);
        
        
    }   
}
