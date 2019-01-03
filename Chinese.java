import greenfoot.*;

/**
 * Write a description of class Chinese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chinese extends PlatformerEnemys
{
    private GreenfootImage image_right = new GreenfootImage("chinese_right.png");
    private GreenfootImage image_left = new GreenfootImage("chinese_left.png");

    public Chinese(String direction){
        this.setImage(image_right);
        setSpeed(4);
        initHp(50);
        setDirection(direction);
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
