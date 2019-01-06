import greenfoot.*;

/**
 * Write a description of class Wall here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class Wall extends AttackableBuildings
{
    private GreenfootImage image = Engine.ImageLoader._image_Wall;

    private int initHealth = 200;

    public Wall(Base world){
        this.world = world;
        this.setImage(image);
        initHp(initHealth);

        setIntact(true);
    }  

    @Override
    public void checkDeath(){
        if(getHp() == 0){
            if(bar != null){
                getWorld().removeObject(bar);
            }

            setIntact(false);
            lastX = getX();
            lastY = getY();
            killed = true;
            getWorld().removeObject(this);
        }
    }
}
