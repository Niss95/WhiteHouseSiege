import greenfoot.*;

/**
 * Write a description of class attackableBuildings here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public class AttackableBuildings extends Buildings
{
    public HealthBar bar;
    public void act() 
    {
        checkDeath();
    }    

    //Der LebensBalken updatet sich von alleine!
    public void initHealthBar(){
        if(bar == null){
            bar = new HealthBar(getHpMax(), getHp(), getImage().getWidth() + 25, 24);
            getWorld().addObject(bar, getX(), getY() - (getImage().getHeight() / 1));
        }
    }

    @Override
    public void hurt(int x){
        initHealthBar();
        if((getHp() - x) <= 0){
            setHp(0);
            bar.setValue(getHp());
        }
        else{
            setHp((getHp() - x));
            bar.add(getHp() - bar.getValue());
        }
    }

    @Override
    public void checkDeath(){
        if(getHp() == 0){
            if(bar != null){
                getWorld().removeObject(bar);
            }
            getWorld().removeObject(this);
        }
    }
}
