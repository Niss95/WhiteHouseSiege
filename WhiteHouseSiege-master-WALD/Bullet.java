import greenfoot.*;

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Unit
{
    int counterArab=2;
    int directione=0;
    boolean killed=false;
    public Bullet(String direction){
        if(direction.equals("left")){
            directione=-10;
        } else if(direction.equals("right")){
            directione=10;
        }
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(directione);
        kill();
        }
    private void kill(){
        forest forest = (forest) getWorld();
        Arab arab = new Arab("left");
     
        if (isTouching(Mexican.class)){
            removeTouching(Mexican.class);
            forest.setActMexicans(forest.getActMexicans() - 1);
           killed=true;
        }
          if (isTouching(Chinese.class)){
            removeTouching(Chinese.class);
            forest.setActChinese(forest.getActChinese()-1);
            killed=true;
        }
          if(isTouching(Arab.class)){ // mit leben löuft noch nicht
           //arab.setLeben(arab.getLeben()-1);
           counterArab=counterArab+1;
           killed=true;
        }
        if(counterArab==0) { // tötet ihn noch nicht
            removeTouching(Arab.class);
           //   getWorld().setActArabs(getWorld().getActArabs()-1);
            killed=true;
        }
        if(this.isAtEdge() || killed == true){
            getWorld().removeObject(this); 
        }
    }
}
  