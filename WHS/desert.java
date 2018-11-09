import greenfoot.*;

/**
 * Write a description of class desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class desert extends World
{
    int max_Mexicans= 11;
    int max_Chinese= 5;
    int max_Arabs= 7;
    
    int act_Mexicans = 0;
    int act_Arabs = 0;
    int act_Chinese = 0;
    
    long begintime=System.currentTimeMillis();
    int time=30000;
    long interval=getRandomTime(150, 500);
    private SimpleTimer timer=new SimpleTimer(); // funktioniert noch nicht
    
     /**
     * Constructor for objects of class desert.
     * 
     */
   
    
    public desert()
    {    
        super(1000, 600, 1);
        prepare();
    }
    private void prepare()
    {
        //this.setBackground(new GreenfootImage(""));
        addObject(new Ground(), 500, 585);
        addObject(new Ground(), 2, 400);
        addObject(new Player(this), 500, 300);
        addObject(new Mexican("right"), 900, 300);
        addObject(new Chinese("left"), 900, 300);
        addObject(new Arab("left"), 900, 300);
        act_Mexicans= act_Mexicans+1;
        act_Chinese=act_Chinese +1;
        act_Arabs=act_Arabs+1;
    }
    public void act(){
        show_time();
        time--;
        addEnemys();
        
        if(time==0){
                Greenfoot.stop();
                Greenfoot.setWorld(new Base());     
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
    public void addEnemys(){
        addRandommexicans();
        addRandomChinese();
        addRandomArabs();
    }
    public void addRandommexicans (){
        if(act_Mexicans < max_Mexicans && (timer.millisElapsed() > getRandomTime(255, 2550))){   
            addObject(new Mexican ("left"), getRandomNumber(0, 1000),getRandomNumber(0, 500));
            act_Mexicans= act_Mexicans+1;
            timer.mark();
        } 
    }
     public void addRandomChinese (){
        if(act_Chinese < max_Chinese && (timer.millisElapsed() > getRandomTime(255, 2550))){   
            addObject(new Chinese ("left"), getRandomNumber(0, 1000),getRandomNumber(0, 500));
            act_Chinese= act_Chinese+1;
            timer.mark();
        } 
    }
     public void addRandomArabs(){
        if(act_Arabs < max_Arabs && (timer.millisElapsed() > getRandomTime(255, 2550))){   
            addObject(new Arab ("left"), getRandomNumber(0, 1000),getRandomNumber(0, 500));
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


