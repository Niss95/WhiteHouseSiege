import greenfoot.*;

/**
 * Write a description of class TD_Mexican here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public class TD_Mexican extends TowerDefenceEnemys
{   
    private GreenfootImage image_right = Engine.ImageLoader._image_right_Mexican;
    private GreenfootImage image_left = Engine.ImageLoader._image_left_Mexican;

    
    public TD_Mexican(String direction){
        setDirection(direction);
        
        setImage(image_right);
        setImages(image_right, image_left);
        
        
        setSpeed(Engine.ActorValues._TD_MexicanSpeed);
        setAttack(Engine.ActorValues._TD_MexicanAttackDamage);
        setAttackSpeed(Engine.ActorValues._TD_MexicanAttackSpeed);
        initHp(Engine.ActorValues._TD_MexicanLife);
        setResValue(Engine.ActorValues._TD_MexicanRes);
    }
    
    
    @Override
    public void notifyDeath(){
        // nothing
    }
}
