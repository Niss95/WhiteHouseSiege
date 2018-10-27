import greenfoot.*;

/**
 * Write a description of class Unit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Unit extends Actor
{
    public int force = 10;
    public int speed = 0;
    public String direction = "";
    public int hp = 1;

    public void gravity(){
        this.setLocation(this.getX(), this.getY() + force);
        Greenfoot.delay(1);
    }

    public void moveLeft(){
        loc(this.getX() - getSpeed(), this.getY());
    }

    public void moveRight(){
        loc(this.getX() + getSpeed(), this.getY());
    }

    public boolean grounded(){
        if(this.getOneIntersectingObject(Ground.class) != null){
            return true;
        }
        return false;
    }

    public void loc(int x, int y){this.setLocation(x,y);}
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
    public void setDirection(String direction){
        this.direction = direction;
    }
    
    public String getDirection(){
        return this.direction;
    }
    
    public void setHp(int hp){
        this.hp = hp;
    }
    
    public int getHp(){
        return this.hp;
    }
}
