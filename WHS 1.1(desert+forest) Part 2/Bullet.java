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
        desert desert=new desert();
        Player player = new Player();
        Arab arab = new Arab("left");
        /**Actor Chinese = getOneIntersectingObject(Chinese.class);
        if (Chinese !=null){
            World myworld= getWorld();
            myworld.removeObject(Chinese.class);
            myworld.removeObject(this); 
        }*/
        if (isTouching(Mexican.class)){
            removeTouching(Mexican.class);
            desert.setActMexicans(desert.getActMexicans() - 1);
           //player.setScore(player.getScore()+1);
           killed=true;
        }
          if (isTouching(Chinese.class)){
            removeTouching(Chinese.class);
            desert.setActChinese(desert.getActChinese()-1);
            //player.setScore(player.getScore()+1);
            killed=true;
        }
          if(isTouching(Arab.class)){ // mit leben löuft noch nicht
           //arab.setLeben(arab.getLeben()-1);
           //player.setScore(player.getScore()+1.5);
           counterArab=counterArab+1;
           killed=true;
        }
        if(counterArab==0) { // tötet ihn noch nicht
            removeTouching(Arab.class);
            desert.setActArabs(desert.getActArabs()-1);
            killed=true;
        }
        if(this.isAtEdge() || killed == true){
            getWorld().removeObject(this); 
        }
    }
}
  