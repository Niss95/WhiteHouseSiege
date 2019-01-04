import greenfoot.*;

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends AttackableBuildings
{
    private GreenfootImage image = new GreenfootImage("wall.png");
    private int initHealth = 200;
    
    public Wall(){
        this.setImage(image);
        initHp(initHealth);
        
        
    }   
}
