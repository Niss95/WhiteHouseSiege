import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Unit here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
abstract public class Unit extends Actor
{
    private int upgradeCostCurrent = Engine.GameValuesFixed._UpgradeCostAtStart;
    
    private int force = 10;

    private int speed = 0;
    private String direction = "";

    private int hp = 1;
    private int hpMax = 1;

    private int attack = 1;
    private int attackSpeed = 1;

    private int resValue = 0;

    public void gravity(){
        this.setLocation(this.getX(), this.getY() + force);
    }

    public void moveLeft(){
        loc(this.getX() - getSpeed(), this.getY());
    }

    public void moveRight(){
        loc(this.getX() + getSpeed(), this.getY());
    }

    public boolean grounded(){
        if(this.getOneIntersectingObject(Grounds.class) != null){
            List<Grounds> grounds = this.getIntersectingObjects(Grounds.class);

            for(Grounds g : grounds){
                if(
                (this.getY() + (this.getImage().getHeight() / 2)) >= (g.getY() - (g.getImage().getHeight() / 2)) &&
                (this.getY() + (this.getImage().getHeight() / 2)) <= (g.getY())
                ){
                    return true;  
                }

            }
        }
        return false;
    }

    public void hurt(int x){
        if((getHp() - x) <= 0){
            setHp(0);
        }
        else{setHp((getHp() - x));}
    }

    public void checkDeath(){
        if(getHp() == 0){
            getWorld().removeObject(this);
        }
    }

    public boolean checkIsWhiteHouseAlive(){
        return !getWorld().getObjects(WhiteHouse.class).isEmpty();
    }

    public void loc(int x, int y){this.setLocation(x,y);}

    
    
    
    
    // UpgradeFunctions

    public void increaseAttackSpeed(int i){
        int temp = getAttackSpeed() + i;
        if(temp > 0){
            setAttackSpeed(getAttackSpeed() + i);
        }
    }

    public void increaseDamage(int i){
        setAttack(getAttack() + i);
    }

    public void increaseRange(int i){
        //Override if needed!
    }
    
    public void increaseSpeed(int i){
        setSpeed(getSpeed() + i);
    }

    public void increaseHealth(int hp){
        this.setHpMax(this.getHpMax() + hp);
        this.setHp(this.getHp() + hp);
    }
    
    
    public void increaseUpgradeCost(){
        this.upgradeCostCurrent += Engine.GameValuesFixed._UpgradeCostIncrease;
    }
    
    
    
    // Getter / Setter -------------------------------------------------------------------------------------------------------------------------------------
    public void setUpgradeCostCurrent(int cost){
        this.upgradeCostCurrent = cost;
    }

    public int getUpgradeCostCurrent(){
        return this.upgradeCostCurrent;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setResValue(int value){
        this.resValue = value;
    }

    public int getResValue(){
        return this.resValue;
    }

    public void setDirection(String direction){
        this.direction = direction;
    }

    public String getDirection(){
        return this.direction;
    }

    public void initHp(int hp){
        this.hpMax = hp;
        this.hp = hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getHp(){
        return this.hp;
    }

    public int getHpMax(){
        return this.hpMax;
    }
    
    public void setHpMax(int hp){
        this.hpMax = hp;
    }

    public int getAttack(){
        return attack;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public int getAttackSpeed(){
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed){
        this.attackSpeed = attackSpeed;
    }

    public int getForce(){
        return force;
    }

    public void setForce(int force){
        this.force = force;
    }
}
