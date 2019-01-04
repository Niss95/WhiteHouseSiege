import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
abstract public class Enemys extends Unit
{

    public void run(String direction, GreenfootImage imageRight, GreenfootImage imageLeft){
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
    
    @Override
    public void checkDeath(){
        if(getHp() == 0){
            changeRes();
            getWorld().removeObject(this);
        }
    }

    public void changeRes(){
        Engine.GameValues._Res += getResValue();
    }
}
