import greenfoot.*;

/**
 * Write a description of class PhysicalTower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhysicalTower extends Towers
{
    private GreenfootImage image = new GreenfootImage("physicalTower.png");
    private int attackSpeedInSeconds = 6;
    private int attackDamagePerHitInHp = 50;
    
    public PhysicalTower(){
        this.setImage(image);
        setAttack(attackDamagePerHitInHp);
        setAttackSpeed(attackSpeedInSeconds);
    }
    
    
}
