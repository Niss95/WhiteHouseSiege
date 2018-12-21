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
    private int jumpHight = 75;    //Wie hoch er in pixeln springen soll
    private int jumpSpeed = getForce();  // Wie schnell er springen soll (aktuell gleichgesetzt mit der Gravitation)
    private desert desert;
    
    //Tastenbelegung:
    private String right = "right";
    private String left = "left";
    private String up = "up";
    
    //Nicht ändern!!!
    private int currentJump = 0;    
    private boolean jumping = false;
    private boolean spacedown = false;
    private int coins=0;
    private int barrel=0;
    private int steel=0;
    private SimpleTimer timer=new SimpleTimer();
    private String direction="right";
    private boolean shooot=false;
     
    
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
        if(isTouching(Barrel.class)){
            barrel++;
            removeTouching(Barrel.class);
        }
        if(isTouching(Coin.class)){
            coins++;
            removeTouching(Coin.class);
        }
        if(isTouching(Steel.class)){
            steel++;
            removeTouching(Steel.class);
        }
        getWorld().showText(coins + "    " + barrel + "      " + steel, 1700, 20);
    }
    private void userinput(){
        boolean rightb=false;
        if(Greenfoot.isKeyDown(left)){
            this.setImage("TrumpGGl.png");
            moveLeft();
            direction="left";
        }
        if(Greenfoot.isKeyDown(right)){
            this.setImage("TrumpGGr.png");
            moveRight();   
            direction="right";
        }
        if(!spacedown && "space".equals(Greenfoot.getKey()) && timer.millisElapsed() >= 400){
            if(!shooot){
            this.setImage("TrumpGGr.png");
            shooot=true;
        
        }
            spacedown=true;
            shoot(direction);
        }
        if(spacedown && !"space".equals(Greenfoot.getKey())){
            spacedown=false;
        }
        if(Greenfoot.isKeyDown(up)){
            if(grounded() && jumping == false){
                jumping = true;
            }
        }
    }
    private void shoot(String directione){
         Bullet bullet = new Bullet(directione);
         if (directione.equals("right")){    
             getWorld().addObject(bullet, getX()+48, getY()-2);
            } else if(directione.equals("left")){
             getWorld().addObject(bullet, getX()-48, getY()-2);               
                
            }

         bullet.setRotation(getRotation());
         timer.mark();
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
            else {
                currentJump = 0;
                jumping = false;
            }
        }
    }
    private void kill(){
        if (isTouching(Mexican.class) || isTouching(Chinese.class) || isTouching(Arab.class)){
            //Greenfoot.stop();
            //Greenfoot.setWorld(new desert());
            coins=0;
            barrel=0;
            steel=0;
            setLocation(45, 718);
            
        }
         
    }
}
