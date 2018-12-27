import greenfoot.*;

/**
 * Write a description of class desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clearing extends World
{
    int max_Mexicans= 3;
    int max_Chinese= 2;
    int max_Arabs= 2;
    
    int act_Mexicans = 0;
    int act_Arabs = 0;
    int act_Chinese = 0;
    
    long begintime=System.currentTimeMillis();
    int time=3000;
    long interval=getRandomTime(150, 500);
    private SimpleTimer timer=new SimpleTimer(); // funktioniert noch nicht
    
     /**
     * Constructor for objects of class desert.
     * 
     */
   
    
    public clearing()
    {    
        super(1800, 900, 1);
        prepare();
    }
    
    private void prepare()
    {
        addObject(new GroundClearing(), 500, 900);
        Player player = new Player();
        addObject(player, 45, 718);
        Steel steel2 = new Steel();
        Coin coin = new Coin();
        Barrels barrels = new Barrels();
        addObject(barrels, 1675, 22);
        addObject(steel2, 1724, 22);
        addObject(coin, 1624, 21);
        //

        addObject(new Mexican("right"), 500, 300);
        addObject(new Chinese("left"), 900, 300);
        addObject(new Arab("left"), 900, 300);

        act_Mexicans= act_Mexicans+1;
        act_Chinese=act_Chinese +1;
        act_Arabs=act_Arabs+1;

        GroundClearing groundclearing2 = new GroundClearing();
        addObject(groundclearing2, 899, 862);
        groundclearing2.setLocation(899, 860);
        groundclearing2.setLocation(900, 857);
        Door door = new Door();
        addObject(door, 1396, 668);
        door.setLocation(1365, 796);
        HEADQ headq = new HEADQ();
        addObject(headq, 49, 794);
        headq.setLocation(34, 777);
    }

    public void act(){
        show_time();
        time--;
        addEnemys();
        if (time==0) {
                Greenfoot.stop();
                Greenfoot.setWorld(new Forest());     
            }                
        }      
    public int getRandomNumber(int start, int end){
        int number=Greenfoot.getRandomNumber(end);
        return number+start;
    }
    public long getRandomTime(long start, long end){
         long number=Greenfoot.getRandomNumber((int)(end-start));
        return number+start;
    }
    public String randomdirection(){
        int number=Greenfoot.getRandomNumber(100);
        if(number%2==0){
            return "right";
        }
        else{
            return "left";
        }
    }    
    public void addEnemys(){
        addRandommexicans();
        addRandomChinese();
        addRandomArabs();
    }
    public void addRandommexicans (){
        if(act_Mexicans < max_Mexicans && (timer.millisElapsed() >= getRandomTime(500, 1550))){   
            addObject(new Mexican (randomdirection()), getRandomNumber(0, 1000),getRandomNumber(0, 500));
            act_Mexicans= act_Mexicans+1;
            timer.mark();
        } 
    }
     public void addRandomChinese (){
        if(act_Chinese < max_Chinese && (timer.millisElapsed() > getRandomTime(650, 2550))){   
            addObject(new Chinese (randomdirection()), getRandomNumber(0, 1000),getRandomNumber(0, 500));
            act_Chinese= act_Chinese+1;
            timer.mark();
        } 
    }
     public void addRandomArabs(){
        if(act_Arabs < max_Arabs && (timer.millisElapsed() > getRandomTime(480, 2550))){   
            addObject(new Arab (randomdirection()), getRandomNumber(0, 1000),getRandomNumber(0, 500));
            act_Arabs= act_Arabs+1;
            timer.mark();
        } 
    }    
    public void show_time(){ showText("Time: "+time, 65, 20);}
    public void setActMexicans(int i){ this.act_Mexicans = i;}
    public int getActMexicans(){return this.act_Mexicans;}
    public void setActChinese(int i){ this.act_Chinese = i;}
    public int getActChinese(){return this.act_Chinese;}
    public void setActArabs(int i){ this.act_Arabs = i;}
    public int getActArabs(){return this.act_Arabs;}
}
