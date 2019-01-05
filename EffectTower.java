import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class EffectTower here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public class EffectTower extends Towers
{
    private GreenfootImage image = Engine.ImageLoader._image_EffectTower;
    private int attackSpeedInMilliSeconds = 1500;
    private int attackDamagePerHitInHp = 50;

    public EffectTower(){
        this.setImage(image);
        setAttack(attackDamagePerHitInHp);
        setAttackSpeed(attackSpeedInMilliSeconds);        
        setIntact(true);
        setRangeColor(Color.BLUE);
    }

}
