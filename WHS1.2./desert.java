import greenfoot.*;

/**
 * Write a description of class desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class desert extends World
{
    int max_Mexicans= 4;
    int max_Chinese= 2;
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
   
    
    public desert()
    {    
        super(1800, 900, 1);
        prepare();
    }
    
    private void prepare()
    {
        //this.setBackground(new GreenfootImage(""));
        addObject(new Ground(), 500, 900);
        Player player = new Player();
        addObject(player, 45, 718);
        addObject(new Mexican("right"), 500, 300);
        addObject(new Chinese("left"), 900, 300);
        addObject(new Arab("left"), 900, 300);

        act_Mexicans= act_Mexicans+1;
        act_Chinese=act_Chinese +1;
        act_Arabs=act_Arabs+1;

        Steel steel2 = new Steel();
        Coin coin = new Coin();
        Barrels barrels = new Barrels();
        addObject(barrels, 1675, 22);
        addObject(steel2, 1724, 22);
        addObject(coin, 1621, 21);

        brick brick = new brick();
        addObject(brick, 57, 501);
        brick.setLocation(124, 480);
        brick brick2 = new brick();
        addObject(brick2, 607, 394);
        brick2.setLocation(382, 368);

        Clouds clouds = new Clouds();
        addObject(clouds, 734, 165);
        Clouds clouds2 = new Clouds();
        addObject(clouds2, 870, 208);
        clouds2.getY();
        clouds2.setLocation(695, 67);
        clouds.setLocation(896, 129);
        Clouds clouds3 = new Clouds();
        addObject(clouds3, 132, 115);

        Clouds2 clouds22 = new Clouds2();
        addObject(clouds22, 355, 74);
        Barrel barrel = new Barrel();
        addObject(barrel, 393, 221);
        barrel.setLocation(358, 301);
        barrel.setLocation(136, 260);
        brick2.setLocation(414, 363);

        Airplane airplane = new Airplane();
        addObject(airplane, 618, 90);
        airplane.setLocation(917, 79);
        clouds.setLocation(908, 137);
        Bomb bomb = new Bomb();
        addObject(bomb, 532, 99);
        bomb.setLocation(212, 57);
        Bomb bomb2 = new Bomb();
        addObject(bomb2, 288, 86);
        bomb.setLocation(212, 44);
        bomb2.setLocation(217, 81);
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
        addObject(brick4, 642, 275);
        brick4.setLocation(495, 268);
        brick2.setLocation(278, 312);
        brick3.setLocation(135, 384);
        brick2.setLocation(334, 322);
        brick brick5 = new brick();
        addObject(brick5, 925, 279);
      
        brick5.setLocation(966, 281);
        door.setLocation(950, 494);
        door.setLocation(958, 494);
      
        airplane2.setLocation(1779, 172);
        
        door.setLocation(1759, 467);
        Barrel barrel3 = new Barrel();
        addObject(barrel3, 1237, 221);
      
        barrel3.setLocation(35, 352);
        Tower tower = new Tower();
        addObject(tower, 280, 144);
       
        tower.setLocation(199, 189);
        Tower tower2 = new Tower();
        addObject(tower2, 262, 175);
        tower2.setLocation(237, 189);

        Airplane2 airplane22 = new Airplane2();
        addObject(airplane22, 706, 89);
        airplane22.setLocation(965, 45);
        HEADQ headq = new HEADQ();
        addObject(headq, 59, 558);
        headq.setLocation(46, 571);
        brick4.setLocation(570, 516);
        brick.setLocation(139, 231);
       
        brick5.setLocation(726, 393);

       
        brick brick6 = new brick();
        addObject(brick6, 882, 370);
        brick2 brick22 = new brick2();
        addObject(brick22, 866, 270);
        brick22.setLocation(874, 261);

        Barrel barrel4 = new Barrel();
        addObject(barrel4, 1337, 82);
        barrel4.setLocation(1313, 28);

        barrel4.setLocation(1290, 29);
        barrel4.setLocation(1296, 45);
        removeObject(barrel4);
        Steel steel = new Steel();
        addObject(steel, 1344, 73);
        steel.setLocation(1306, 125);
        removeObject(steel);
        door.setLocation(1759, 477);
        brick brick7 = new brick();
        addObject(brick7, 266, 289);
        brick7.setLocation(278, 283);
        brick brick8 = new brick();
        addObject(brick8, 116, 333);
        brick8.setLocation(172, 327);
        brick3.setLocation(66, 384);
        barrel3.setLocation(25, 348);

        door.setLocation(959, 479);
        clouds23.setLocation(339, 110);
        removeObject(clouds23);
        removeObject(bomb2);
        airplane22.setLocation(858, 44);
        airplane22.setLocation(544, 50);
        airplane22.setLocation(544, 47);
        brick8.setLocation(59, 294);
        brick7.setLocation(192, 294);
        
        brick5.setLocation(198, 377);
        brick3.setLocation(64, 426);
        barrel3.setLocation(16, 390);
        barrel.setLocation(702, 289);

        brick22.setLocation(927, 259);
        brick3 brick32 = new brick3();
        addObject(brick32, 364, 257);
        brick32.setLocation(471, 269);
        brick3 brick33 = new brick3();
        addObject(brick33, 573, 277);
        brick33.setLocation(592, 269);

  
   
        brick2 brick23 = new brick2();
        addObject(brick23, 882, 273);
       
        brick4 brick42 = new brick4();
        addObject(brick42, 171, 235);
        brick4 brick43 = new brick4();
        addObject(brick43, 75, 233);
       
        brick.setLocation(269, 407);
       
        brick42.setLocation(172, 221);
        brick4 brick44 = new brick4();
        addObject(brick44, 262, 306);
       
        brick42.setLocation(161, 221);
        brick32.setLocation(489, 269);
        brick3 brick34 = new brick3();
        addObject(brick34, 439, 311);
        brick34.setLocation(433, 359);
        removeObject(brick8);
        removeObject(brick7);
       
        removeObject(brick);

        headq.setLocation(44, 774);
        brick5.setLocation(66, 809);
        headq.setLocation(38, 775);

       
       
        tempelchina.setLocation(949, 185);
        tower2.setLocation(350, 189);
        tower.setLocation(297, 187);
        tower2.setLocation(341, 187);
        airplaneload.setLocation(176, 171);
        brick42.setLocation(202, 228);
        brick43.setLocation(94, 270);
       
        temple.setLocation(1539, 215);
        
        brick22.setLocation(1582, 297);
        brick23.setLocation(1450, 329);
        brick6.setLocation(881, 370);
        
        brick32.setLocation(1032, 286);
        brick33.setLocation(898, 286);
        brick34.setLocation(835, 339);
        brick44.setLocation(209, 324);
        
        brick43.setLocation(95, 276);
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
