import greenfoot.*;

/**
 * Write a description of class Arab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arab extends Enemy
{
    int leben=2;
    public Arab(String direction){
        setSpeed(2);
        setHp(100);
        setDirection(direction);
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
            run(getDirection(), "arab1.png", "arab1links.png"); //////hier!
        }
        
        //ab hier alle Aktionen!
        direction();
        beam();
    }  
    public void beam(){
        if(isTouching(Door.class)){
            setLocation(75,176);
        }
    }
    public void setLeben(int leben) {
        this.leben=leben;
    }
    public int getLeben() {
        return this.leben;
    }
}
