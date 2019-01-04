import greenfoot.*;

/**
 * Write a description of class TD_Mexican here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public class TD_Mexican extends TowerDefenceEnemys
{   
    private GreenfootImage image_right = new GreenfootImage("mexican_right.png");
    private GreenfootImage image_left = new GreenfootImage("mexican_left.png");

    
    public TD_Mexican(String direction){
        setDirection(direction);
        
        setImage(image_right);
        setImages(image_right, image_left);
        
        
        setSpeed(Engine.EnemyValues._MexicanAttackSpeed);
        setAttack(Engine.EnemyValues._MexicanAttackDamage);
        setAttackSpeed(Engine.EnemyValues._MexicanSpeed);
        initHp(Engine.EnemyValues._MexicanLife);
        setResValue(Engine.EnemyValues._MexicanRes);
    }
    
}
