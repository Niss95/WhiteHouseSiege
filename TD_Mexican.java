import greenfoot.*;

/**
 * Write a description of class TD_Mexican here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TD_Mexican extends TowerDefenceEnemys
{   
    private GreenfootImage image_right = new GreenfootImage("mexican_right.png");
    private GreenfootImage image_left = new GreenfootImage("mexican_left.png");

    private int initHealth = 100;
    
    public TD_Mexican(String direction){
        setImage(image_right);
        setImages(image_right, image_left);
        
        setSpeed(3);
        setAttack(50);
        setAttackSpeed(2);
        initHp(initHealth);
        
        setDirection(direction);
        
    }
    
    
}
