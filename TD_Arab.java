import greenfoot.*;

/**
 * Write a description of class TD_Arab here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class TD_Arab extends TowerDefenceEnemys
{
    private GreenfootImage image_right = Engine.ImageLoader._image_right_Arab;
    private GreenfootImage image_left = Engine.ImageLoader._image_left_Arab;
    
    public TD_Arab(String direction){
        setDirection(direction);
        
        setImage(image_right);
        setImages(image_right, image_left);
        
        
        setSpeed(Engine.ActorValues._TD_ArabSpeed);
        setAttack(Engine.ActorValues._TD_ArabAttackDamage);
        setAttackSpeed(Engine.ActorValues._TD_ArabAttackSpeed);
        initHp(Engine.ActorValues._TD_ArabLife);
        setResValue(Engine.ActorValues._TD_ArabRes);        
    }
      
    
    @Override
    public void notifyDeath(){
        // nothing
    }
}
