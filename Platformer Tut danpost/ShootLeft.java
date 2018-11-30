import greenfoot.*;

public class ShootLeft extends ShootingManager
{
    private int shootingSpeed = 8;
    
    public void act() 
    {
        setLocation(getX() - shootingSpeed, getY());
        killBadGuys();
    }    
}