import greenfoot.*;

/**
 * Write a description of class TowerDefenceEnemys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class TowerDefenceEnemys extends Enemys
{
    private GreenfootImage image_right;
    private GreenfootImage image_left;

    private SimpleTimer timer = new SimpleTimer();
    private Buildings target;

    public void act() 
    {
        checkGravity();
        
        if(checkIsWhiteHouseAlive()){
            checkRun();
            checkAttack();

            checkDeath();
        }
    }    

    private void checkRun(){
        if(grounded()){
            if(this.getOneIntersectingObject(AttackableBuildings.class) == null  && this.getX() < ((getWorld().getWidth() / 2) - 10) || this.getX() > ((getWorld().getWidth() / 2) + 10)){
                run(getDirection(), image_right, image_left);
            }
        }
    }

    private void checkGravity(){
        if(!this.grounded()){
            gravity();
        }
    }

    private void checkAttack(){
        if(this.getOneIntersectingObject(AttackableBuildings.class) != null){
            target = (Buildings) this.getOneIntersectingObject(Buildings.class);

            if(timer.millisElapsed() >= (this.getAttackSpeed() * 1000)){
                target.hurt(this.getAttack());
                timer.mark();
            }

        }
    }

    //Getter & Setter:
    public void setImages(GreenfootImage image_right, GreenfootImage image_left){
        this.image_right = image_right;
        this.image_left = image_left;
    }

}
