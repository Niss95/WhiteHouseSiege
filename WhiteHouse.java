import greenfoot.*;

/**
 * Write a description of class WhiteHouse here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public class WhiteHouse extends AttackableBuildings
{
    private GreenfootImage image = new GreenfootImage("WhiteHouse.png");

    public WhiteHouse(){
        this.setImage(image);
        initHp(1000);
    }  

    @Override
    public void checkDeath(){
        if(getHp() == 0){
            if(bar != null){
                getWorld().removeObject(bar);
            }
            getWorld().removeObject(this);
            Engine.GameValues._GameOver = true;
        }
    }
}
