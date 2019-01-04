import greenfoot.*;

/**
 * Write a description of class Arab here.
 * 
 * @author (Dennis Sellemann, Sven) 
 * @version (a version number or a date)
 */
public class Arab extends PlatformerEnemys
{
    private GreenfootImage image_right = new GreenfootImage("arab_right.png");
    private GreenfootImage image_left = new GreenfootImage("arab_left.png");
    
    private int initHealth = 100;
    private int ressourceValue = 50;
    
    public Arab(String direction){
        
        setDirection(direction);
        
        setImage(image_right);
        setImages(image_right, image_left);
        
        
        setSpeed(Engine.EnemyValues._ArabAttackSpeed);
        setAttack(Engine.EnemyValues._ArabAttackDamage);
        setAttackSpeed(Engine.EnemyValues._ArabSpeed);
        initHp(Engine.EnemyValues._ArabLife);
        setResValue(Engine.EnemyValues._ArabRes);
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
