import greenfoot.*;

/**
 * Write a description of class TD_Chinese here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class TD_Chinese extends TowerDefenceEnemys
{
    private GreenfootImage image_right = Engine.ImageLoader._image_right_Chinese;
    private GreenfootImage image_left = Engine.ImageLoader._image_left_Chinese;
    
    public TD_Chinese(String direction){
        setDirection(direction);
        
        setImage(image_right);
        setImages(image_right, image_left);
        
        
        setSpeed(Engine.ActorValues._TD_ChineseSpeed);
        setAttack(Engine.ActorValues._TD_ChineseAttackDamage);
        setAttackSpeed(Engine.ActorValues._TD_ChineseAttackSpeed);
        initHp(Engine.ActorValues._TD_ChineseLife);
        setResValue(Engine.ActorValues._TD_ChineseRes);
    }
   
    @Override
    public void notifyDeath(){
        // nothing
    }
}
