import greenfoot.*;

/**
 * Write a description of class TD_Arab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TD_Arab extends TowerDefenceEnemys
{
    private GreenfootImage image_right = new GreenfootImage("arab_right.png");
    private GreenfootImage image_left = new GreenfootImage("arab_left.png");

    public TD_Arab(String direction){
        this.setImage(image_right);
        setSpeed(3);
        initHp(100);
        setDirection(direction);
        setImages(image_right, image_left);
    }
      
}
