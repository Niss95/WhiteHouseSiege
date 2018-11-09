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
    private desert desert;
    
    //Tastenbelegung:
    private String right = "right";
    private String left = "left";
    private String up = "up";
    
    //Nicht ändern!!!
    private int currentJump = 0;    
    private boolean jumping = false;
    private double score;
     
    
    // standard Konstruktor
    public Player(desert desert){
        this.desert = desert;
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
        ShowScore();
        jump();
        userinput();
        kill();
        
     
        //ab hier alle Aktionen!
    }   
    private void ShowScore(){
        getWorld().showText("Score:$ "+ score, 920, 20);
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
    private void kill(){
        if(isTouching(Mexican.class)){
            removeTouching(Mexican.class);
            desert.setActMexicans(desert.getActMexicans() - 1);
            score=score+1;
        }
          if(isTouching(Chinese.class)){
            removeTouching(Chinese.class);
            desert.setActChinese(desert.getActChinese() - 1);
             score=score+1;
        }
          if(isTouching(Arab.class)){
            removeTouching(Arab.class);
            desert.setActArabs(desert.getActArabs() - 1);
            score=score+1.5; 
     
        }
       
    }
}
/*Actor Touched=new Actor();
        isTouching(Actor);
        Touched=Actor();
        switch(Touched){
            case isTouching(Mexican.class): 
            removeTouching(Mexican.class);
            break;
            case isTouching(Chinese.class): 
            removeTouching(Chinese.class);
            break;
            case isTouching(Arab.class): 
            removeTouching(Arab.class);
            break;
        }

 * 
 */