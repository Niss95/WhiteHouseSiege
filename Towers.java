import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.Color;

/**
 * Write a description of class Towers here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public abstract class Towers extends Buildings
{
    private SimpleTimer attackTimer = new SimpleTimer();
    public RangeDisplay rangeDisplay;

    private Color rangeColor = Color.RED;

    private List<TowerDefenceEnemys> targets = new ArrayList<TowerDefenceEnemys>();
    private int range = 0;
    private int attacableOpponents = 1;//how many simultaneously attackable opponents

    private boolean _attacking = true;  //just for debugging

    private boolean initialized = false;

    public void act() 
    {
        if(_attacking){
            if(!Engine.GameValues._GameOver){
                init();
                checkAttack();
            }  
        }
    } 

    public void init(){
        if(!initialized){
            calcRange();
            initialized = true;
        }
    }

    public void checkAttack(){
        if(attackTimer.millisElapsed() >= (this.getAttackSpeed())){

            targets = sortByNearestToWhiteHouse(getObjectsInRange(range, TowerDefenceEnemys.class));

            for(int i = 0; i < attacableOpponents; i++){
                if( i < targets.size()){
                    getWorld().addObject(new Beam(getX(), getY() + (getImage().getHeight() / 2) - (getImage().getHeight() / 4 * 3), targets.get(i).getX(), targets.get(i).getY()), (Engine.Config._Width / 2), (Engine.Config._Height / 2));

                    if(targets.get(i) != null){
                        targets.get(i).hurt(this.getAttack());
                    } 
                }

            }
            attackTimer.mark();
        }
    }

    public void calcRange(){
        setRange(Math.abs( (this.getX() - (this.getWorld().getWidth() / 2)) ));
        if(this.rangeDisplay == null){
            rangeDisplay = new RangeDisplay();
            this.getWorld().addObject(rangeDisplay, 1, 1);
        }

        rangeDisplay.drawRange(this);
    }

    private List<TowerDefenceEnemys> sortByNearestToWhiteHouse(List<TowerDefenceEnemys> sortMe){
        List<TowerDefenceEnemys> temp = new ArrayList<TowerDefenceEnemys>();
        if(!sortMe.isEmpty()){
            int mid = (sortMe.get(0).getWorld().getWidth() / 2);
            while(!sortMe.isEmpty()){
                TowerDefenceEnemys nearest = sortMe.get(0);

                for(TowerDefenceEnemys enemy : sortMe){
                    if(Math.abs((enemy.getX() - mid)) < Math.abs((nearest.getX() - mid))){
                        nearest = enemy;
                    }
                }
                temp.add(nearest);
                sortMe.remove(nearest);
            }
        }

        return temp;
    }

    public RangeDisplay getRangeDisplay(){
        return rangeDisplay;
    }
    
    public void setRange(int range){
        if(range >= 0){
            this.range = range;
        }
    }

    public int getRange(){
        return range;
    }

    public void setRangeColor(Color color){ this.rangeColor = color;}

    public Color getRangeColor(){ return this.rangeColor;}

    private class Beam extends Actor{

        private SimpleTimer lifeTimer = new SimpleTimer();
        private GreenfootImage image = new GreenfootImage(Engine.Config._Width, Engine.Config._Height);
        private int timeToLiveInMilliSeconds = 250;

        public Beam(int fromX, int fromY, int toX, int toY){
            image.setColor(Color.RED);
            image.drawLine(fromX, fromY, toX, toY);
            this.setImage(image);
            lifeTimer.mark();
        }

        public void act(){            
            if(lifeTimer.millisElapsed() >= timeToLiveInMilliSeconds){
                getWorld().removeObject(this);
            }
        }
    }

}
