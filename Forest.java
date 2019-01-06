import greenfoot.*;

/**
 * Write a description of class Desert here.
 * 
 * @author (Sven ) 
 * @version (a version number or a date)
 */
public class Forest extends Platformer
{
    private Forest_Ground fosg;

    //----------------------------------------------
    

    long begintime=System.currentTimeMillis();
    long interval=getRandomTime(150, 500);
    private SimpleTimer timer=new SimpleTimer(); // funktioniert noch nicht    

    //Etc: 
    private RessourcenDisplay resDisplay = new RessourcenDisplay(true);

    //----------------------------------------------

    public Forest(MainMenu menu)
    {
        super(menu, Engine.Config._Width, Engine.Config._Height); 
        this.setBackground(new GreenfootImage("forest_background.png"));
        this.addObject(resDisplay, (this.getWidth() / 2), 0 + (resDisplay.getImage().getHeight()));
        //initValues();
        prepare();
    }

    public void act(){
        if(!initialized){initValues();}
        show_time();
        time--;
        addEnemys();
        if (time==0) {
            endRoutine();
        }                
    } 

    public void initValues(){
        Engine.GameValues._CurrentRoundTime = Engine.GameValues._CurrentRoundTime - Engine.GameValuesFixed._RoundTimeDecreases;
        if(Engine.GameValues._CurrentRoundTime < Engine.GameValuesFixed._MinimumRoundTimer){ Engine.GameValues._CurrentRoundTime = Engine.GameValuesFixed._MinimumRoundTimer;}
        time = Engine.GameValues._CurrentRoundTime;
        initialized = true;
    }

    private void prepare()
    {
        fosg = new Forest_Ground();
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
        BrickMovingWhenTouched brick28 = new BrickMovingWhenTouched();
        addObject(brick28, 1418, 455);
        BrickMovingWhenTouched brick29 = new BrickMovingWhenTouched();
        addObject(brick29, 1648, 408);
        brick29.setLocation(1668,408);
        BrickMovingWhenTouched brick210 = new BrickMovingWhenTouched();
        addObject(brick210, 1728, 526);

        BrickMovingWhenTouched brick211 = new BrickMovingWhenTouched();
        addObject(brick211, 1637, 409);
        BrickMovingWhenTouched brick212 = new BrickMovingWhenTouched();
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

        HQ hq = new HQ();
        addObject(hq, 38, 700);
        
        player = new Player();
        player.setSpawnX(hq.getX());
        player.setSpawnY(hq.getY() -  hq.getImage().getHeight() );
        this.addObject(player, player.getSpawnX(), player.getSpawnY());

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
                    addObject(new BrickMovingWhenTouched(), b, h);
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


}
