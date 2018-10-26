import greenfoot.*;

/**
 * Write a description of class Unit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Unit extends Actor
{
    private int force = 10;
    private int speed = 5;
    private int jumpHight = 15;
    
    /**
     * Act - do whatever the Unit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        gravity();
        userinput();
    }    
    
    private void gravity(){
        if(getOneIntersectingObject(Ground.class) == null){
            this.setLocation(this.getX(), this.getY() + force);
        }
    }
    
    private void userinput(){
        if(Greenfoot.isKeyDown("Left")){
            loc(this.getX() - speed, this.getY());
        }
        if(Greenfoot.isKeyDown("Right")){loc(
            this.getX() + speed, this.getY());
        }
        if(Greenfoot.isKeyDown("Up")){
            jump();
        }
    }
    
    private void jump(){
        loc(this.getX(), this.getY() - jumpHight);
    }
    private void loc(int x, int y){this.setLocation(x,y);}
}
