import greenfoot.*;

/**
 * Write a description of class Bullet here.
 * 
 * @author (Dennis Sellemann, Sven)
 * @version (a version number or a date)
 */
public class Bullet extends Unit
{
    private GreenfootImage imageRight = Engine.ImageLoader._image_right_Bullet;
    private GreenfootImage imageLeft = Engine.ImageLoader._image_left_Bullet;
    private int directione = 0;

    public Bullet(String direction){
        

        if(direction.equals("left")){
            this.setImage(imageLeft);
            directione = Engine.ActorValues._BulletSpeed * (-1);
        } else if(direction.equals("right")){
            this.setImage(imageRight);
            directione = Engine.ActorValues._BulletSpeed;
        }
    }

    public void act() 
    {
        move(directione);
        hitCheck();
    }

    private void hitCheck(){
        /*
        if(getWorld() instanceof Platformer){
        if (isTouching(Mexican.class)){
        ((Unit) getOneIntersectingObject(Mexican.class)).hurt(((Unit) getOneIntersectingObject(Mexican.class)).getHpMax());
        removeMe();
        return;
        }
        if (isTouching(Chinese.class)){
        ((Unit) getOneIntersectingObject(Chinese.class)).hurt(((Unit) getOneIntersectingObject(Chinese.class)).getHpMax());
        removeMe();
        return;
        }
        if(isTouching(Arab.class)){
        ((Unit) getOneIntersectingObject(Arab.class)).hurt(((Unit) getOneIntersectingObject(Arab.class)).getHpMax() / 2);
        removeMe();
        return;
        }
        }

        else if(getWorld() instanceof Base){
        if (isTouching(TD_Mexican.class)){
        ((Unit) getOneIntersectingObject(TD_Mexican.class)).hurt(((Unit) getOneIntersectingObject(TD_Mexican.class)).getHpMax());
        removeMe();
        return;
        }
        if (isTouching(TD_Chinese.class)){
        ((Unit) getOneIntersectingObject(TD_Chinese.class)).hurt(((Unit) getOneIntersectingObject(TD_Chinese.class)).getHpMax());
        removeMe();
        return;
        }
        if(isTouching(TD_Arab.class)){
        ((Unit) getOneIntersectingObject(TD_Arab.class)).hurt(((Unit) getOneIntersectingObject(TD_Arab.class)).getHpMax() / 2);
        removeMe();
        return;
        }
        }
         */

        if (isTouching(Enemys.class)){
            ((Unit) getOneIntersectingObject(Enemys.class)).hurt(Engine.ActorValues._BulletDamage);
            removeMe();
            return;
        }

        if(this.isAtEdge()){
            removeMe();
            return;
        }
    }

    private void removeMe(){
        getWorld().removeObject(this);
    }
}
