import greenfoot.*;

/**
 * Write a description of class Unit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Unit extends Actor
{
    private int force = 10;
    private int speed = 0;
    private int hp = 1;

    private int attackDelay = 0;
    private int tempAttackSpeed = 100;
    private int attackDamage = 0;

    public void gravity(){
        this.setLocation(this.getX(), this.getY() + force);
    }

    public void moveLeft(){
        loc(this.getX() - getSpeed(), this.getY());
    }

    public void moveRight(){
        loc(this.getX() + getSpeed(), this.getY());
    }

    public void checkDeath(){
        if(this.getHp() <= 0){
            getWorld().removeObject(this);
        }
    }

    public boolean grounded(){
        if(this.getOneIntersectingObject(Ground.class) != null){
            return true;
        }
        return false;
    }

    public void hurt(int x){
        setImage(new GreenfootImage("brick.png"));
        if((getHp() - x) <= 0){
            setHp(0);
        }
        else{setHp((getHp() - x));}
    }

    public void loc(int x, int y){this.setLocation(x,y);}

    // Getter / Setter -------------------------------------------------------------------------------------------------------------------------------------
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getHp(){
        return this.hp;
    }

    public int getAttackDamage(){
        return attackDamage;
    }

    public void setAttackDamage(int attack){
        this.attackDamage = attack;
    }

    public int getForce(){
        return force;
    }

    public void setForce(int force){
        this.force = force;
    }

    public void setAttackDelay(int i){
        this.attackDelay = i;
    }

    public int getAttackDelay(){
        return this.attackDelay;
    }

    public void setTempAttackSpeed(int i){
        this.tempAttackSpeed = i;
    }

    public int getTempAttackSpeed(){
        return this.tempAttackSpeed;
    }
}
