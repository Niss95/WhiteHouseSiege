import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Enemy extends Unit
{
    private String direction = "";
    private int stopPointX;

    public void run(String direction){
        if(direction.equals("right")){
            moveRight(); 
        }
        else if(direction.equals("left")){
            moveLeft();
        }
    }

    public boolean collide(){
        
        if(this.getOneIntersectingObject(Wall.class) == null){
            return false;
        }
        
        return true;
    }

    public void attackBuilding(){
        if(getTempAttackSpeed() == 0){
            Building touchingBuilding;

            if(getOneIntersectingObject(Building.class) != null){
                touchingBuilding = (Building) getOneIntersectingObject(Building.class);
                touchingBuilding.hurt(getAttackDamage());
                setTempAttackSpeed(100);

            }
        }
        setTempAttackSpeed(getTempAttackSpeed() - 1);
    }

    public boolean stop(){
        if(this.getX() >= getStopPointX() - 5 &&  this.getX() <= getStopPointX() + 5){return true;}
        return false;
    }
           
    public void setDirection(String direction){
        this.direction = direction;
    }
    
    public String getDirection(){
        return this.direction;
    }
    
    public void setStopPointX(int p){
        this.stopPointX = p;
    }
    
    public int getStopPointX(){
        return this.stopPointX;
    }
}
