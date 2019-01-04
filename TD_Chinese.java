import greenfoot.*;

/**
 * Write a description of class TD_Chinese here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class TD_Chinese extends TowerDefenceEnemys
{
    private GreenfootImage image_right = new GreenfootImage("chinese_right.png");    
    private GreenfootImage image_left = new GreenfootImage("chinese_left.png");
    
    public TD_Chinese(String direction){
        setDirection(direction);
        
        setImage(image_right);
        setImages(image_right, image_left);
        
        
        setSpeed(Engine.EnemyValues._ChineseAttackSpeed);
        setAttack(Engine.EnemyValues._ChineseAttackDamage);
        setAttackSpeed(Engine.EnemyValues._ChineseSpeed);
        initHp(Engine.EnemyValues._ChineseLife);
        setResValue(Engine.EnemyValues._ChineseRes);
    }
   
}
