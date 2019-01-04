import greenfoot.*;

/**
 * Write a description of class Arab here.
 * 
 * @author (Dennis Sellemann, Sven) 
 * @version (a version number or a date)
 */
public class Arab extends PlatformerEnemys
{
    private GreenfootImage image_right = Engine.ImageLoader._image_right_Arab;
    private GreenfootImage image_left = Engine.ImageLoader._image_left_Arab;
    
    private int initHealth = 100;
    private int ressourceValue = 50;
    
    public Arab(String direction){
        
        setDirection(direction);
        
        setImage(image_right);
        setImages(image_right, image_left);
        
        
        setSpeed(Engine.ActorValues._ArabAttackSpeed);
        setAttack(Engine.ActorValues._ArabAttackDamage);
        setAttackSpeed(Engine.ActorValues._ArabSpeed);
        initHp(Engine.ActorValues._ArabLife);
        setResValue(Engine.ActorValues._ArabRes);
    }
    
    /**
     * Act - do whatever the Arab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        if(!this.grounded()){
            gravity();
        }
        if(grounded()){
            run(getDirection(), image_right, image_left); //////hier!
        }
        
        //ab hier alle Aktionen!
        direction();
        beam();
        
        checkDeath();
    }  
    
    public void beam(){
        if(isTouching(Door.class)){
            if(getWorld() instanceof Forest){
                setLocation(208,215);
            } else {
                setLocation(75,176);
            }
        }
    }
  
}
