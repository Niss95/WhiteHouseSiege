import greenfoot.*;

/**
 * Write a description of class Chinese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chinese extends Enemy
{
    public Chinese(String direction){
        setSpeed(4);
        setHp(50);
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
            run(getDirection(),"asianRight.png", "asianLeft.png");
        }
        //ab hier alle Aktionen!
        direction();
        beam();
    }    
    public void beam(){
        if(isTouching(Door.class)){
            setLocation(535,182);
        }
    }
}
