import greenfoot.*;

/**
 * Write a description of class Arab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arab extends Enemy
{
    public Arab(String direction){
        setSpeed(2);
        setHp(100);
        setDirection(direction);
        int leben=2;
    }
    
    /**
     * Act - do whatever the Arab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!this.grounded()){
            gravity();
        }
        if(grounded()){
            run(getDirection());
        }
        //ab hier alle Aktionen!
    }    
}
