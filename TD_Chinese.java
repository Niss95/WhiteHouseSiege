import greenfoot.*;

/**
 * Write a description of class TD_Chinese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TD_Chinese extends TowerDefenceEnemys
{
    private GreenfootImage image_right = new GreenfootImage("chinese_right.png");    
    private GreenfootImage image_left = new GreenfootImage("chinese_left.png");

    public TD_Chinese(String direction){
        this.setImage(image_right);
        setSpeed(3);
        initHp(100);
        setDirection(direction);
        setImages(image_right, image_left);
    }
   
}
