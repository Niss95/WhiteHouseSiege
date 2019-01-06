import greenfoot.*;

/**
 * Write a description of class Chinese here.
 * 
 * @author (Dennis Sellemann, Sven) 
 * @version (a version number or a date)
 */
public class Chinese extends PlatformerEnemys
{
    private GreenfootImage image_right = Engine.ImageLoader._image_right_Chinese;
    private GreenfootImage image_left = Engine.ImageLoader._image_left_Chinese;
    
    private int initHealth = 100;
    private int ressourceValue = 50;

    public Chinese(String direction){
        setDirection(direction);
        
        setImage(image_right);
        setImages(image_right, image_left);
        
        
        setSpeed(Engine.ActorValues._ChineseSpeed);
        setAttack(Engine.ActorValues._ChineseAttackDamage);
        setAttackSpeed(Engine.ActorValues._ChineseAttackSpeed);
        initHp(Engine.ActorValues._ChineseLife);
        setResValue(Engine.ActorValues._ChineseRes);
    }
    
    @Override
    public void beam(){
        if(isTouching(Door.class)){
            if(getWorld() instanceof Forest){
                setLocation(1118,419);
            } else {
                setLocation(949,185);
            }
        }
    }
    
    @Override
    public void notifyDeath(){
        ((Platformer) getWorld()).setActChinese(((Platformer) getWorld()).getActChinese() - 1);
    }
}
