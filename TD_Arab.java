import greenfoot.*;

/**
 * Write a description of class TD_Arab here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class TD_Arab extends TowerDefenceEnemys
{
    private GreenfootImage image_right = new GreenfootImage("arab_right.png");
    private GreenfootImage image_left = new GreenfootImage("arab_left.png");
    
    public TD_Arab(String direction){
        setDirection(direction);
        
        setImage(image_right);
        setImages(image_right, image_left);
        
        
        setSpeed(Engine.EnemyValues._ArabAttackSpeed);
        setAttack(Engine.EnemyValues._ArabAttackDamage);
        setAttackSpeed(Engine.EnemyValues._ArabSpeed);
        initHp(Engine.EnemyValues._ArabLife);
        setResValue(Engine.EnemyValues._ArabRes);        
    }
      
}
