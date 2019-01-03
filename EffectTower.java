import greenfoot.*;

/**
 * Write a description of class EffectTower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EffectTower extends Towers
{
    private GreenfootImage image = new GreenfootImage("effectTower.png");
    private int attackSpeedInSeconds = 6;
    private int attackDamagePerHitInHp = 50;
    
    public EffectTower(){
        this.setImage(image);
        setAttack(attackDamagePerHitInHp);
        setAttackSpeed(attackSpeedInSeconds);
    }
    
    
}
