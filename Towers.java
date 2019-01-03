import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Towers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Towers extends Buildings
{
    private SimpleTimer attackTimer = new SimpleTimer();

    private List<TowerDefenceEnemys> targets = new ArrayList<TowerDefenceEnemys>();
    private int range = 0;
    private int attacableOpponents = 1;//how many simultaneously attackable opponents

    public void act() 
    {
        if(!Engine.BackEnd._GameOver){

            checkAttack();
        }       
    } 

    public void checkAttack(){
        if(range == 0){calcRange();}

        targets = getObjectsInRange(range, TowerDefenceEnemys.class);

        if(attackTimer.millisElapsed() >= (this.getAttackSpeed() * 1000)){
            for(int i = 0; i < attacableOpponents; i++){
                if( i < targets.size()){
                    getWorld().addObject(new Beam(getX(), getY(), targets.get(i).getX(), targets.get(i).getY()), (Engine.BackEnd._Width / 2), (Engine.BackEnd._Height / 2));
                    targets.get(i).hurt(this.getAttack());
                }

            }
            attackTimer.mark();
        }
    }

    public void calcRange(){
        if(((this.getWorld().getWidth() / 2) - this.getX()) < 0){
           range =  ((this.getX() - (this.getWorld().getWidth() / 2)) * 1);
        }else{
           range =  (((this.getWorld().getWidth() / 2) - this.getX()) * 1);
        }        
    }

    private class Beam extends Actor{

        private SimpleTimer lifeTimer = new SimpleTimer();
        private GreenfootImage image = new GreenfootImage(Engine.BackEnd._Width, Engine.BackEnd._Height);

        public Beam(int fromX, int fromY, int toX, int toY){
            image.drawLine(fromX, fromY, toX, toY);
            this.setImage(image);
            lifeTimer.mark();
        }

        public void act(){            
            if(lifeTimer.millisElapsed() >= 1000){
                getWorld().removeObject(this);
            }
        }
    }

}
