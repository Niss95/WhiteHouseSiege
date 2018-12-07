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
    int time=3000;
    long interval=getRandomTime(150, 500);
    private SimpleTimer timer=new SimpleTimer(); // funktioniert noch nicht
    
     /**
     * Constructor for objects of class desert.
     * 
     */
   
    
    public desert()
    {    
        super(1800, 600, 1);
        prepare();
    }
    
    private void prepare()
    {
        //this.setBackground(new GreenfootImage(""));
        addObject(new Ground(), 500, 591);
        addObject(new Player(this), 29, 527);
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
        caktus caktus = new caktus();
        addObject(caktus, 85, 294);
        caktus caktus2 = new caktus();
        addObject(caktus2, 635, 411);
        caktus caktus3 = new caktus();
        addObject(caktus3, 831, 269);
        Clouds clouds = new Clouds();
        addObject(clouds, 734, 165);
        Clouds clouds2 = new Clouds();
        addObject(clouds2, 870, 208);
        clouds2.getY();
        clouds2.setLocation(695, 67);
        clouds.setLocation(896, 129);
        Clouds clouds3 = new Clouds();
        addObject(clouds3, 132, 115);
        caktus2.setLocation(725, 342);
        caktus.setLocation(48, 247);
        Clouds2 clouds22 = new Clouds2();
        addObject(clouds22, 355, 74);
        Barrel barrel = new Barrel();
        addObject(barrel, 393, 221);
        barrel.setLocation(358, 301);
        barrel.setLocation(136, 260);
        brick2.setLocation(414, 363);
        caktus2.setLocation(879, 378);
        Cactusl cactusl = new Cactusl();
        addObject(cactusl, 745, 174);
        cactusl.setLocation(713, 275);
        caktus2.setLocation(841, 390);
        removeObject(caktus2);
        cactusl.setLocation(943, 361);
        caktus3.setLocation(805, 266);
        Barrel2 barrel2 = new Barrel2();
        addObject(barrel2, 647, 205);
        barrel2.setLocation(508, 269);
        barrel2.setLocation(757, 302);
        barrel2.setLocation(842, 309);
        Airplane airplane = new Airplane();
        addObject(airplane, 618, 90);
        airplane.setLocation(757, 128);
        airplane.setLocation(917, 79);
        clouds.setLocation(908, 137);
        Bomb bomb = new Bomb();
        addObject(bomb, 532, 99);
        bomb.setLocation(504, 97);
        bomb.setLocation(294, 44);
        bomb.setLocation(195, 47);
        bomb.setLocation(212, 57);
        Bomb bomb2 = new Bomb();
        addObject(bomb2, 288, 86);
        bomb2.setLocation(217, 84);
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
        caktus.setLocation(305, 286);
        barrel.setLocation(419, 260);
        brick.setLocation(129, 233);
        caktus.setLocation(168, 426);
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

        brick5.setLocation(925, 279);
        brick5.setLocation(925, 279);
        brick5.setLocation(925, 279);
        brick5.setLocation(925, 279);
        brick5.setLocation(925, 279);
        brick5.setLocation(925, 279);
        brick5.setLocation(925, 279);
        brick5.setLocation(925, 279);
        brick5.setLocation(925, 279);
        brick5.setLocation(966, 263);
        brick5.setLocation(966, 263);
        brick5.setLocation(966, 281);
        door.setLocation(950, 494);
        door.setLocation(958, 494);
        airplane2.setLocation(1620, 185);
        airplane2.setLocation(1779, 172);
        door.setLocation(1467, 399);
        door.setLocation(1759, 467);
        Barrel barrel3 = new Barrel();
        addObject(barrel3, 1237, 221);
        barrel3.setLocation(692, 334);
        barrel3.setLocation(295, 314);
        barrel3.setLocation(71, 360);
        barrel3.setLocation(35, 352);
        Tower tower = new Tower();
        addObject(tower, 280, 144);
        tower.setLocation(203, 193);
        tower.setLocation(198, 189);
        tower.setLocation(199, 189);
        Tower tower2 = new Tower();
        addObject(tower2, 262, 175);
        tower2.setLocation(237, 189);
        caktus.setLocation(65, 455);
        barrel.setLocation(384, 236);
        Airplane2 airplane22 = new Airplane2();
        addObject(airplane22, 706, 89);
        airplane22.setLocation(965, 45);
        HEADQ headq = new HEADQ();
        addObject(headq, 59, 558);
        headq.setLocation(46, 571);
        brick4.setLocation(570, 516);
        brick.setLocation(139, 231);
        brick2.setLocation(499, 350);
        brick5.setLocation(726, 393);
        barrel2.setLocation(704, 256);
        removeObject(caktus3);

        brick2.setLocation(652, 326);

      
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
        barrel4.setLocation(1290, 29);
        barrel4.setLocation(1296, 45);
        removeObject(barrel4);
        Steel steel = new Steel();
        addObject(steel, 1344, 73);
        steel.setLocation(1306, 125);
        removeObject(steel);
        door.setLocation(1759, 477);
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


