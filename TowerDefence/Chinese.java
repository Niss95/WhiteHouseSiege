import greenfoot.*;

/**
 * Write a description of class Chinese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chinese extends TDEnemy
{
    public Chinese(String direction){
        setSpeed(4);
        setHp(50);
        setAttackDelay(20);
        setAttackDamage(100);
        setDirection(direction);
        setStopPointX(501);
    }
}
