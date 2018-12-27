import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Enemy extends Unit
{
   
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        /*
        if(!this.grounded()){
            gravity();
        }
        if(grounded()){
            run(getDirection());
        }
        //ab hier alle Aktionen!
        */
       direction();
       if(isTouching(Objects.class)){
           turn(90);
        }

    }
    
    public void run(String direction, String imageRight, String imageLeft){
        if(direction.equals("right")){
            moveRight(); 
            this.setImage(imageRight);
        }
        else if(direction.equals("left")){
            moveLeft();
            this.setImage(imageLeft);
        }
    }
    public void direction(){
        if( this.isAtEdge() && getDirection()=="right"){
            setDirection("left");
        }
        else if(this.isAtEdge() && getDirection()=="left"){
            setDirection("right");
    }
}
}
