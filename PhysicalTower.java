import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class PhysicalTower here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class PhysicalTower extends Towers
{
    private GreenfootImage image = Engine.ImageLoader._image_PhysicalTower;

    private int attackSpeedInMilliSeconds = Engine.ActorValues._PhysicalAttackSpeed;
    private int attackDamagePerHitInHp = Engine.ActorValues._PhysicalAttackDamage;

    public PhysicalTower(Base world){
        this.world = world;
        this.setImage(image);
        setAttack(attackDamagePerHitInHp);
        setAttackSpeed(attackSpeedInMilliSeconds);
        setIntact(true);
        setRangeColor(Color.RED);
        setRangeBonus(Engine.GameValuesFixed._PhysicalRangeBonus);
    }
    
    @Override
    public void aplyEffect(TowerDefenceEnemys target){
        //nothing here
    }
    
}
