import greenfoot.*;

/**
 * Write a description of class Chinese here.
 * 
 * @author (Dennis Sellemann, Sven) 
 * @version (a version number or a date)
 */
public class Chinese extends PlatformerEnemys
{
    private GreenfootImage image_right = new GreenfootImage("chinese_right.png");
    private GreenfootImage image_left = new GreenfootImage("chinese_left.png");
    
    private int initHealth = 100;
    private int ressourceValue = 50;

    public Chinese(String direction){
        setDirection(direction);
        
        setImage(image_right);
        setImages(image_right, image_left);
        
        
        setSpeed(Engine.EnemyValues._ChineseAttackSpeed);
        setAttack(Engine.EnemyValues._ChineseAttackDamage);
        setAttackSpeed(Engine.EnemyValues._ChineseSpeed);
        initHp(Engine.EnemyValues._ChineseLife);
        setResValue(Engine.EnemyValues._ChineseRes);
    }
    
    /**
     * Act - do whatever the Chinese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!this.grounded()){
            gravity();
        }
        if(grounded()){
            run(getDirection(), image_right, image_left);
        }
        //ab hier alle Aktionen!
        direction();
        beam();
        
        
        checkDeath();
    }    
    public void beam(){
        if(isTouching(Door.class)){
            if(getWorld() instanceof Forest){
                setLocation(1118,419);
            } else {
                setLocation(949,185);
            }
        }
    }
}
