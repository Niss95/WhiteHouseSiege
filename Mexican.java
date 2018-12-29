import greenfoot.*;

/**
 * Write a description of class Mexican here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mexican extends PlatformerEnemys
{
    private GreenfootImage image_right = new GreenfootImage("mexican_right.png");
    private GreenfootImage image_left = new GreenfootImage("mexican_left.png");

    public Mexican(String direction){
        this.setImage(image_right);
        setSpeed(3);
        initHp(100);
        setDirection(direction);
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
            setLocation(890, 207);
        }
        
        
        checkDeath();
    }    
    
    
        }

