import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Tower extends Building
{
    private List<Enemy> currentEnemys = new ArrayList<Enemy>();
    private int range;
    
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        shoot(getEnemys());
    }    
    
    @Override
    public void checkDeath(){}
    
    private void shoot(ArrayList<Enemy> enemys){
        
        if(getTempAttackSpeed() == 0){
            System.out.println("attack!");

            if(!enemys.isEmpty()){
                System.out.println("attacked!");
                enemys.get(0).hurt(this.getAttackDamage());
                setTempAttackSpeed(100);

            }
        }
        setTempAttackSpeed(getTempAttackSpeed() - 1);
        
    }
    
    private ArrayList<Enemy> getEnemys(){
        return (ArrayList<Enemy>) getObjectsInRange(getRange(), Enemy.class);
    }
    
   public int getRange(){return this.range;}
    
   public void setRange(int r){this.range = r;}
}
