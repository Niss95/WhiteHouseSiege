import greenfoot.*;

public class ShootRight extends ShootingManager
{
    private int shootingSpeed = 8;
    
    public void act() 
    {
        setLocation(getX() + shootingSpeed, getY());
        killBadGuys();
    }    
}