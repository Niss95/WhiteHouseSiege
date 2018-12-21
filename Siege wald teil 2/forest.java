import greenfoot.*;

/**
 * Write a description of class desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class forest extends World
{
    int max_Mexicans= 4;
    int max_Chinese= 3;
    int max_Arabs= 3;
    
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
   
    
    public forest()
    {    
        super(1800, 900, 1);
        prepare();
    }
    
    private void prepare()
    {
        //this.setBackground(new GreenfootImage(""));

        addObject(new Player(this), 73, 760);
        addObject(new Mexican("right"), 500, 300);
        addObject(new Chinese("left"), 900, 300);
        addObject(new Arab("left"), 900, 300);
        act_Mexicans= act_Mexicans+1;
        act_Chinese=act_Chinese +1;
        act_Arabs=act_Arabs+1;
        brick brick = new brick();
        addObject(brick, 57, 501);
        brick.setLocation(124, 480);
        brick brick2 = new brick();
        addObject(brick2, 607, 394);
        brick2.setLocation(382, 368);

        Barrel barrel = new Barrel();
        addObject(barrel, 393, 221);
        barrel.setLocation(358, 301);
        barrel.setLocation(136, 260);

        Airplane airplane = new Airplane();
        addObject(airplane, 618, 90);
        airplane.setLocation(757, 128);
        airplane.setLocation(917, 79);

        removeObject(airplane);
        Airplane airplane2 = new Airplane();
        addObject(airplane2, 853, 59);
        airplane2.setLocation(905, 94);
        Clouds2 clouds23 = new Clouds2();
        addObject(clouds23, 340, 110);
        Door door = new Door();
        addObject(door, 789, 402);
        door.setLocation(963, 530);
        door.setLocation(965, 540);
        AirplaneLoad airplaneload = new AirplaneLoad();
        addObject(airplaneload, 210, 163);
        airplaneload.setLocation(88, 170);

        barrel.setLocation(419, 260);
        brick.setLocation(129, 233);

        brick2.setLocation(276, 293);
        brick.setLocation(168, 230);
        brick brick3 = new brick();
        addObject(brick3, 443, 413);
        brick3.setLocation(134, 349);
        brick3.setLocation(136, 367);
        Temple temple = new Temple();
        addObject(temple, 934, 210);
        TempelChina tempelchina = new TempelChina();
        addObject(tempelchina, 580, 162);
        tempelchina.setLocation(530, 183);
        tempelchina.setLocation(535, 182);
        brick brick4 = new brick();

        brick brick6 = new brick();
        addObject(brick6, 882, 370);
        brick2 brick22 = new brick2();
        addObject(brick22, 866, 270);
        brick22.setLocation(874, 261);
        Coin coin = new Coin();
        addObject(coin, 1209, 23);
        Barrel barrel4 = new Barrel();
        addObject(barrel4, 1337, 82);
        barrel4.setLocation(1313, 28);
        coin.setLocation(1209, 29);

        door.setLocation(965, 456);

        getActMexicans();
        addEnemys();

        HEADQ headq = new HEADQ();
        addObject(headq, 50, 552);
        headq.setLocation(50, 565);

        Ground ground2 = new Ground();
        addObject(ground2, 776, 866);
        ground2.setLocation(902, 860);

        headq.setLocation(65, 815);

        door.setLocation(1472, 294);
        brick brick5 = new brick();
        addObject(brick5, 180, 723);
        brick brick7 = new brick();
        addObject(brick7, 528, 598);
        brick brick8 = new brick();
        addObject(brick8, 746, 558);
        brick brick9 = new brick();
        addObject(brick9, 848, 557);
        brick brick10 = new brick();
        addObject(brick10, 942, 554);
        removeObject(brick10);
        brick brick11 = new brick();
        addObject(brick11, 951, 557);
        brick brick12 = new brick();
        addObject(brick12, 1053, 558);
        brick brick13 = new brick();
        addObject(brick13, 1349, 500);
        brick brick14 = new brick();
        addObject(brick14, 1589, 602);
        removeObject(brick14);
        brick brick15 = new brick();
        addObject(brick15, 1508, 567);
        brick brick16 = new brick();
        addObject(brick16, 1738, 511);
        brick brick17 = new brick();
        addObject(brick17, 333, 652);
    }

    public void act(){
        show_time();
        time--;
        addEnemys();
        if (time==0) {
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
        if(act_Mexicans < max_Mexicans && (timer.millisElapsed() >= getRandomTime(255, 1550))){   
            addObject(new Mexican (randomdirection()), getRandomNumber(0, 1000),getRandomNumber(0, 500));
            act_Mexicans= act_Mexicans+1;
            timer.mark();
        } 
    }
     public void addRandomChinese (){
        if(act_Chinese < max_Chinese && (timer.millisElapsed() > getRandomTime(255, 2550))){   
            addObject(new Chinese (randomdirection()), getRandomNumber(0, 1000),getRandomNumber(0, 500));
            act_Chinese= act_Chinese+1;
            timer.mark();
        } 
    }
     public void addRandomArabs(){
        if(act_Arabs < max_Arabs && (timer.millisElapsed() > getRandomTime(255, 2550))){   
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


