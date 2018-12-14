import greenfoot.*;

/**
 * Write a description of class Mexican here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mexican extends TDEnemy
{
    public Mexican(String direction){
        setSpeed(2);
        setHp(100);
        setAttackDelay(10);
        setAttackDamage(100);
        setDirection(direction);
        setStopPointX(501);
    }  
}
