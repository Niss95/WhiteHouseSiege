import greenfoot.*;

/**
 * Write a description of class Buildings here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public abstract class Buildings extends Unit
{
    public Display display = new Display(1, true);
    
    public int lastX;
    public int lastY;
    
    public boolean intact;
    
    public void addDisplay(){
        this.getWorld().addObject(display, getX(), Engine.ActorValues._Display_Position_Y);
    }
    
    public void updateDisplay(int level){
        display.updateDisplay(level);
    }
    
    public boolean getIntact(){
        return intact;
    }
    
    public void setIntact(boolean intact){
        this.intact = intact;
    }
}
