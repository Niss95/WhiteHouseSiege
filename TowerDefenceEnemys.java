import greenfoot.*;

/**
 * Write a description of class TowerDefenceEnemys here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public abstract class TowerDefenceEnemys extends Enemys
{
    private GreenfootImage image_right;
    private GreenfootImage image_left;

    private SimpleTimer timer = new SimpleTimer();
    private Buildings target;

    private int slowCounter = 0;
    private boolean slowed = false;

    public void act() 
    {
        checkGravity();

        if(checkIsWhiteHouseAlive()){
            checkRun();
            checkAttack();

            checkSlow();
            checkDeath();
        }

    }    

    public void checkSlow(){
        if(slowed){
            if(slowCounter > 0){
                slowCounter--;
            }else{
                slowed = false;
                setSpeed(getSpeed() * 2);
                setAttackSpeed(getAttackSpeed() / 2);
            }
        }
    }

    public void slow(int i){
        if(!slowed){
            if((getSpeed() / 2 > 0) && (getAttackSpeed() * 2 > 0)){
                slowCounter = i;
                setSpeed(getSpeed() / 2);
                setAttackSpeed(getAttackSpeed() * 2);
                slowed = true;
            }
        }
    }

    private void checkRun(){
        if(grounded()){
            if(this.getOneIntersectingObject(AttackableBuildings.class) == null){
                if(getDirection().equals("right") && this.getX() < ((getWorld().getWidth() / 2) - 10)){
                    run(getDirection(), image_right, image_left);
                }
                else if(getDirection().equals("left") && this.getX() > ((getWorld().getWidth() / 2) + 10)){
                    run(getDirection(), image_right, image_left);
                }

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
            target = (Buildings) this.getOneIntersectingObject(AttackableBuildings.class);

            if(timer.millisElapsed() >= (this.getAttackSpeed())){
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
