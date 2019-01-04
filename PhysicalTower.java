import greenfoot.*;

/**
 * Write a description of class PhysicalTower here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class PhysicalTower extends Towers
{
    private GreenfootImage image = Engine.ImageLoader._image_PhysicalTower;
    
    private int attackSpeedInMilliSeconds = 2000;
    private int attackDamagePerHitInHp = 50;
    
    public PhysicalTower(){
        this.setImage(image);
        setAttack(attackDamagePerHitInHp);
        setAttackSpeed(attackSpeedInMilliSeconds);
    }
    
    
}
