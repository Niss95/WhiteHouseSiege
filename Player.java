import greenfoot.*;

/**
 * Write a description of class Player here.
 * 
 * @author (Dennis Sellemann, Sven)
 * @version (a version number or a date)
 */
public class Player extends Unit
{
    private GreenfootImage image_right = Engine.ImageLoader._image_right_Player;
    private GreenfootImage image_left = Engine.ImageLoader._image_left_Player;

    // änderbar
    private int jumpHight = 150;    //Wie hoch er in pixeln springen soll
    private int jumpSpeed = getForce();  // Wie schnell er springen soll (aktuell gleichgesetzt mit der Gravitation)
    private Desert desert;

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
    public Player(){
        this.setImage(image_right);
        setHp(100);
        setSpeed(10);

    }

    /**
     * jump() und gravity() müssen bei jedem durchlauf gecheckt werden!
     * 
     */
    public void act() 
    {
        if(!Engine.GameValues._GameOver){
            if(!grounded() && !jumping){
                gravity();
            }
            ShowScore();
            jump();
            userinput();
            checkHit();
            checkDeath();
        }
    }   

    private void ShowScore(){
        if(isTouching(Barrels.class)){
            barrel++;
            removeTouching(Barrels.class);
        }
        if(isTouching(Coin.class)){
            coins++;
            removeTouching(Coin.class);
        }
        if(isTouching(Steel.class)){
            steel++;
            removeTouching(Steel.class);
        }
        getWorld().showText(coins + "     " + barrel + "      " + steel, 1697, 20);
    }

    private void userinput(){
        boolean rightb=false;
        if(Greenfoot.isKeyDown(left)){
            this.setImage(image_left);
            moveLeft();
            direction = "left";
        }
        if(Greenfoot.isKeyDown(right)){
            this.setImage(image_right);
            moveRight();   
            direction= "right";
        }
        if(!spacedown && "space".equals(Greenfoot.getKey()) && timer.millisElapsed() >= Engine.ActorValues._ShootInterval){
            if(!shooot){
                shooot=true;

            }
            spacedown=true;
            shoot();
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

    private void shoot(){
        Bullet bullet = new Bullet(direction);
        if (direction.equals("right")){    
            getWorld().addObject(bullet, getX()+48, getY()-2);
        } else if(direction.equals("left")){
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

    private void checkHit(){
        if(isTouching(HQ.class) == false){

            if (isTouching(Enemys.class)){
                hurt(50);
            }
        }
    }

    @Override
    public void checkDeath(){
        if(getHp() == 0){
            if(this.getWorld() instanceof Platformer){
                coins=0;
                barrel=0;
                steel=0;
                setHp(100);
                setLocation(60, 725);
            }
            else{
                setHp(100);
                setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            }
        }
    }

    //public void setScore(double score) { this.score=score; }
    //public double getScore() { return score; }
}
