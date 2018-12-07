import greenfoot.*;

/**
 * Write a description of class TDEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class TDEnemy extends Enemy
{
    /**
     * Act - do whatever the TDEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkDeath();
        if(!this.grounded()){
            gravity();
        }

        if(grounded() && !collide() && !stop()){
            run(getDirection());
        }

        if(collide()){
            attackBuilding();
        }
    }
    
    @Override
    public void hurt(int x){
        System.out.println("mex");
        setImage(new GreenfootImage("brick.png"));
        if((getHp() - x) <= 0){
            setHp(0);
        }
        else{setHp((getHp() - x));}
    }
}
