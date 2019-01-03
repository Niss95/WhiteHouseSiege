import greenfoot.*;

/**
 * Write a description of class Desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends Platformer
{
    private static int width = 1800;
    private static int height = 900;
    
    private Base_Ground ground;
    
    //----------------------------------------------
    int max_Mexicans= 4;
    int max_Chinese= 4;
    int max_Arabs= 4;
    
    int act_Mexicans = 0;
    int act_Arabs = 0;
    int act_Chinese = 0;
    
    long begintime=System.currentTimeMillis();
    int time=3000;
    long interval=getRandomTime(150, 500);
    private SimpleTimer timer=new SimpleTimer(); // funktioniert noch nicht    
    //----------------------------------------------
    
    public Forest()
    {
        super(width, height);
        
        this.setBackground(new GreenfootImage("forest_background.png"));
        
        prepare();
    }
    
    
    private void prepare()
    {
        Forest_Ground fosg = new Forest_Ground();
        addObject(fosg,942, 875);
        spawnObjects();
        addRessources();

        addObject(new Door(),1312, 778);
        Brick4 brick47 = new Brick4();
        addObject(brick47, 146, 247);
        Brick4 brick48 = new Brick4();
        addObject(brick48, 250, 250);
        brick48.setLocation(251, 247);
        Brick4 brick49 = new Brick4();
        addObject(brick49, 20, 293);
        Brick4 brick410 = new Brick4();
        addObject(brick410, 325, 304);
        Brick4 brick411 = new Brick4();
        addObject(brick411, 243, 457);
        Brick4 brick412 = new Brick4();
        addObject(brick412, 120, 398);
        BrickMoving brickmoving = new BrickMoving();
        addObject(brickmoving, 51, 657);
        BrickMoving brickmoving2 = new BrickMoving();
        addObject(brickmoving2, 1576, 455);
        BrickMoving brickmoving3 = new BrickMoving();
        addObject(brickmoving3, 1642, 765);
        BrickMoving brickmoving4 = new BrickMoving();
        addObject(brickmoving4, 39, 292);

        Brick3 brick33 = new Brick3();
        addObject(brick33, 948, 285);
        Brick3 brick34 = new Brick3();
        addObject(brick34, 858, 288);
        brick34.setLocation(858, 286);
        brick33.setLocation(987, 286);
        Brick3 brick35 = new Brick3();
        addObject(brick35, 1089, 338);
        Brick3 brick36 = new Brick3();
        addObject(brick36, 767, 385);
        Brick3 brick37 = new Brick3();
        addObject(brick37, 841, 438);
        Brick3 brick38 = new Brick3();
        addObject(brick38, 695, 547);
        Brick3 brick39 = new Brick3();
        addObject(brick39, 915, 649);
        Brick2 brick28 = new Brick2();
        addObject(brick28, 1418, 455);
        Brick2 brick29 = new Brick2();
        addObject(brick29, 1648, 408);
        brick29.setLocation(1668,408);
        Brick2 brick210 = new Brick2();
        addObject(brick210, 1728, 526);

        Brick2 brick211 = new Brick2();
        addObject(brick211, 1637, 409);
        Brick2 brick212 = new Brick2();
        addObject(brick212, 1594, 409);

        Brick3 brick312 = new Brick3();
        addObject(brick312, 977, 598);
        brick312.setLocation(1000, 591);
        Cloud1 cloud1 = new Cloud1();
        addObject(cloud1, 80, 29);
        Cloud1 cloud12 = new Cloud1();
        addObject(cloud12, 606, 41);
        Cloud1 cloud13 = new Cloud1();
        addObject(cloud13, 467, 132);
        Cloud1 cloud14 = new Cloud1();
        addObject(cloud14, 1375, 133);
        Cloud1 cloud15 = new Cloud1();
        addObject(cloud15, 1678, 48);
        Cloud1 cloud16 = new Cloud1();
        addObject(cloud16, 1705, 186);
        cloud16.setLocation(1746, 92);
        Cloud1 cloud17 = new Cloud1();
        addObject(cloud17, 1063, 35);
        Cloud2 cloud2 = new Cloud2();
        addObject(cloud2, 55, 100);
        Cloud2 cloud22 = new Cloud2();
        addObject(cloud22, 67, 83);
        Cloud2 cloud23 = new Cloud2();
        addObject(cloud23, 520, 71);
        Cloud2 cloud24 = new Cloud2();
        addObject(cloud24, 1107, 47);
        Cloud2 cloud25 = new Cloud2();
        addObject(cloud25, 1407, 80);
        Cloud2 cloud26 = new Cloud2();
        addObject(cloud26, 1758, 85);
        cloud22.setLocation(124, 30);
        Bomb2 bomb23 = new Bomb2();
        addObject(bomb23, 526, 113);
        brick33.setLocation(1177, 538);

        brick34.setLocation(1067, 538);

        Brick3 brick313 = new Brick3();
        addObject(brick313, 1268, 596);
        brick313.setLocation(1296, 598);
        brick313.setLocation(1312, 606);
    }
    
    private void spawnObjects(){
        
        Player player = new Player();
        addObject(player, 60, 718);
        addObject(new Mexican("right"), 500, 300);
        addObject(new Chinese("left"), 1114, 439);
        addObject(new Arab("left"), 208, 170);

        act_Mexicans= act_Mexicans+1;
        act_Chinese=act_Chinese +1;
        act_Arabs=act_Arabs+1;
      Steel steel2 = new Steel();
      Coin coin = new Coin();
      Barrel2k barrel = new Barrel2k();
      addObject(barrel, 1675, 22);
      addObject(steel2, 1724, 22);
      addObject(coin, 1621, 21);  
      addObject(new Plane1(), 208, 170);
      addObject(new Plane2(), 917, 79);
      Barrels barrel2 = new Barrel2();
      addObject(barrel2, 136, 260);
      Bomb2 bomb = new Bomb2();
      addObject(bomb, 212, 44);
      Bomb2 bomb2 = new Bomb2();
      addObject(bomb2, 1560, 81);
      
      Tempel temple = new Tempel();
      addObject(temple, 1615, 346);
      Tempel_China tempelchina = new Tempel_China();
      addObject(tempelchina, 1114, 439);
      
      HQ headq = new HQ();
      addObject(headq, 38, 775);
      
      

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
         private void addRessources(){
        for(int j=0; j < 3;j++){
            for(int i=0; i < 5; i++){
            int h = Greenfoot.getRandomNumber(900);
            int b = Greenfoot.getRandomNumber(1750);
            int c = Greenfoot.getRandomNumber(30);
            
            if(c <= 10){
                addObject(new Brick4(), b, h);
            } else if( c > 10 && c <= 20){
                addObject(new Brick3(), b, h);
            } else{
                addObject(new Brick2(), b, h);
            }
            if(j==1){
            addObject(new Barrel2(), b -20, h - 35);
           } else if(j==2){            
            addObject(new Steel(), b, h - 25);
           } else if(j==0){
            addObject(new Coin(), b+25, h-20);
           }
        }   
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
