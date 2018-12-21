import greenfoot.*;

/**
 * Write a description of class Mexican here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mexican extends Enemy
{
    public Mexican(String direction){
        setSpeed(1);
        setHp(100);
        setDirection(direction);
    }
    /**
     * Act - do whatever the Mexican wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!this.grounded()){
            gravity();
        }
        if(grounded()){
            run(getDirection(),"mexican.png","mexican.png");
        }
        direction();
        //ab hier alle Aktionen!
        if(isTouching(Door.class)){
            setLocation(890, 207);
        }
    }    
    private void kill(){
                if(isTouching(Player.class)){
                    removeTouching(Mexican.class);
                }
            }
        }

