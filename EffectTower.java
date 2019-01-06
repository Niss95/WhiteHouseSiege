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
    
    private int attackSpeedInMilliSeconds = Engine.ActorValues._EffectAttackSpeed;
    private int attackDamagePerHitInHp = Engine.ActorValues._EffectAttackDamage;
    

    public EffectTower(Base world){
        this.world = world;
        this.setImage(image);
        setAttack(attackDamagePerHitInHp);
        setAttackSpeed(attackSpeedInMilliSeconds);        
        setIntact(true);
        setRangeColor(Color.BLUE);
        setRangeBonus(Engine.GameValuesFixed._EffectRangeBonus);
    }

    
    @Override
    public void aplyEffect(TowerDefenceEnemys target){
        target.slow(Engine.ActorValues._SlowTicks);
    }
}
