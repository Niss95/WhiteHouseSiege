import greenfoot.*;

/**
 * Write a description of class brickmove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class brickmove extends Ground
{
    public brickmove(){
        getImage().scale(getImage().getWidth()*2, getImage().getHeight());
    }
    /**
     * Act - do whatever the brickmove wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
        if(isAtEdge()){
            turn(90);
        }
    }    
}
