import greenfoot.*;

/**
 * Write a description of class Arab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arab extends TDEnemy
{
    public Arab(String direction){
        setSpeed(2);
        setHp(150);
        setAttackDelay(10);
        setAttackDamage(100);
        setDirection(direction);
        setStopPointX(501);
    }   
}
