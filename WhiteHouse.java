import greenfoot.*;

/**
 * Write a description of class WhiteHouse here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public class WhiteHouse extends AttackableBuildings
{
    private GreenfootImage image = Engine.ImageLoader._image_WhiteHouse;

    public WhiteHouse(Base world){
        this.world = world;
        this.setImage(image);
        initHp(1000);
        setIntact(true);
    }  

    @Override
    public void checkDeath(){
        if(getHp() == 0){
            if(bar != null){
                getWorld().removeObject(bar);
            }

            setIntact(false);
            getWorld().removeObject(this);
            Engine.GameValues._GameOver = true;
        }
    }
    
    
    @Override
    public void increaseHealth(int hp){
        int doubleHp = hp * 2;
        this.setHpMax(getHpMax() + doubleHp);
        this.setHp(getHp() + doubleHp);

        if(bar == null){initHealthBar();}
        
        bar.setMax(this.getHpMax());
        bar.setTarget(this.getHpMax());
    }
}
