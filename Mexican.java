import greenfoot.*;

/**
 * Write a description of class Mexican here.
 * 
 * @author (Dennis Sellemann, Sven)
 * @version (a version number or a date)
 */
public class Mexican extends PlatformerEnemys
{
    private GreenfootImage image_right = Engine.ImageLoader._image_right_Mexican;
    private GreenfootImage image_left = Engine.ImageLoader._image_left_Mexican;

    private int initHealth = 100;
    private int ressourceValue = 50;
    
    public Mexican(String direction){
        setDirection(direction);
        
        setImage(image_right);
        setImages(image_right, image_left);
        
        
        setSpeed(Engine.ActorValues._MexicanAttackSpeed);
        setAttack(Engine.ActorValues._MexicanAttackDamage);
        setAttackSpeed(Engine.ActorValues._MexicanSpeed);
        initHp(Engine.ActorValues._MexicanLife);
        setResValue(Engine.ActorValues._MexicanRes);
    }
    /**
     * Act - do whatever the Mexican wants to do. This method is called whenever
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
        direction();
        //ab hier alle Aktionen!
        if(isTouching(Door.class)){
            if(getWorld() instanceof Forest){
                setLocation(1615,346);
            } else {
                setLocation(1531, 215);
            }
        }
        checkDeath();
    }    
    
    
        }

