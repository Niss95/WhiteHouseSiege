import greenfoot.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Unit
{
    // änderbar
    private int jumpHight = 250;    //Wie hoch er in pixeln springen soll
    private int jumpSpeed = getForce();  // Wie schnell er springen soll (aktuell gleichgesetzt mit der Gravitation
    
    //Tastenbelegung:
    private String right = "right";
    private String left = "left";
    private String up = "up";
    
    //Nicht ändern!!!
    private int currentJump = 0;    
    private boolean jumping = false;
    
    // standard Konstruktor
    public Player(){
        setHp(100);
        setSpeed(10);
    }

    /**
     * jump() und gravity() müssen bei jedem durchlauf gecheckt werden!
     * 
     */
    public void act() 
    {
        if(!grounded() && jumping == false){
            gravity();
        }
        jump();
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
            if(grounded() && jumping == false){
                jumping = true;
            }
        }
    }

    private void jump(){
        if(jumping == true){
            if(currentJump <= jumpHight){
                if(Greenfoot.isKeyDown(left)){
                    moveLeft();
                }
                if(Greenfoot.isKeyDown(right)){
                    moveRight();    
                }

                loc(this.getX(), this.getY() - jumpSpeed);
                currentJump += jumpSpeed;
            }
            else{
                currentJump = 0;
                jumping = false;
            }
        }
    }
}
