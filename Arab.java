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
        touchBrick();
    } 
    public void touchBrick(){
        String a=randomDirection();
        if(isTouching(brick3.class)){
            setDirection("left");
        }
    }
    public String randomDirection(){
        int number=Greenfoot.getRandomNumber(100);
        if(number%2==0){
            return "right";
        }
        else{
            return "left";
        }
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
