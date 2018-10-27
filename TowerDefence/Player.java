import greenfoot.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Unit
{
    private int jumpHight = 250;
    private int jumpSpeed = force;
    
    //Tastenbelegung:
    private String right = "right";
    private String left = "left";
    private String up = "up";

    public Player(){
        setHp(100);
        setSpeed(10);
    }
    /**
     * Act - do whatever the Unit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!grounded()){
            gravity();
        }
        userinput();
        //ab hier alle Aktionen!
    }

    private void userinput(){
        if(Greenfoot.isKeyDown(left)){
            moveLeft();
        }
        if(Greenfoot.isKeyDown(right)){
            moveRight();    
        }
        if(Greenfoot.isKeyDown(up)){
            if(grounded()){
                jump();
            }
        }
    }

    private void jump(){
        int i = 0;
        
        //kompletter Sprung
        while(Greenfoot.isKeyDown(up) && i <= jumpHight){
            if(Greenfoot.isKeyDown(left)){
                moveLeft();
            }
            if(Greenfoot.isKeyDown(right)){
                moveRight();    
            }
            loc(this.getX(), this.getY() - jumpSpeed);
            Greenfoot.delay(1);
            i += jumpSpeed;

        }
        
        //minimum Sprung
        while(i <= (jumpHight/2)){
            if(Greenfoot.isKeyDown(left)){
                moveLeft();
            }
            if(Greenfoot.isKeyDown(right)){
                moveRight();    
            }

            loc(this.getX(), this.getY() - jumpSpeed);
            Greenfoot.delay(1);
            i += jumpSpeed;
        }
    }
}
