import greenfoot.*;

public class Floater extends Platform
{
    int frame = 0;
    private int vSpeed = 0;
    private int spriteHeight = getImage().getHeight();
    private int spriteWidth = getImage().getWidth();
    private int lookForGroundDistance = (int)spriteHeight/2;
    private int lookForEdge = (int)spriteWidth/2;
    private int speed = 1;
    
    public void act() 
    {
        tryToHoldPlayer();
        checkEdge();
        move(speed);
        checkRightWalls();
        checkLeftWalls();
    }    
    
    public void checkEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth() - 10) speed *= -1;
    }   
    
    public void move()
    {
        Actor ground = getOneObjectAtOffset(lookForEdge, lookForGroundDistance, Platform.class);
        if(ground == null) speed *= -1; else move(speed);
    }
    
    public boolean checkRightWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/2);
        Actor rightWall = getOneObjectAtOffset(xDistance, 0, Platform.class);
        if(rightWall == null) return false;
        stopByRightWall(rightWall);
        return true;
    }

    public void stopByRightWall(Actor rightWall)
    {
        int wallWidth = rightWall.getImage().getWidth();
        int newX = rightWall.getX() - (wallWidth + getImage().getWidth())/2;
        setLocation(newX - 5, getY());
        speed *= -1;

    }

    public boolean checkLeftWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/-2);
        Actor leftWall = getOneObjectAtOffset(xDistance, 0, Platform.class);
        if(leftWall == null) return false;
        stopByLeftWall(leftWall);
        return true;
    }

    public void stopByLeftWall(Actor leftWall)
    {
        int wallWidth = leftWall.getImage().getWidth();
        int newX = leftWall.getX() + (wallWidth + getImage().getWidth())/2;
        setLocation(newX + 5, getY());
        speed *= -1;

    }

    public void tryToHoldPlayer()
    {
        if (canSee(Player.class) )
        {
            //Hold Player Up
        }
    }
    
    public boolean canSee(Class clss)
    {
        return getOneObjectAtOffset(0, 0, clss) != null;        
    }
}