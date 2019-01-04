import greenfoot.*;

/**
 * Write a description of class Base_Spawner here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public class Base_Spawner extends Spawners
{
    private enum EnemyTypes{ ARABS, CHINESE, MEXICANS; }
    private SimpleTimer timer = new SimpleTimer();

    private Level world;

    private int midX;
    private int midY;

    private int offset_et = 70;
    private int offset_pt = 180;
    private int offset_wall = 280;
    private int offset_buildingHeight = 20;

    private int spawnPoint_left;
    private int spawnPoint_right;
    private int spawnHeight;

    private boolean marked = false;
    private int spawnDelay = 2;
    private int roundNumber = 1;
    private EnemyTypes enemyTypeToSpawn;
    private int amountToSpawn = 10;
    private int enemyCounter = 0;

    //Ect:
    private Base_Ground ground = new Base_Ground();
    private Player player;

    //Buildings:
    public WhiteHouse wh;

    public PhysicalTower ptLeft;
    public PhysicalTower ptRight;

    public EffectTower etLeft;
    public EffectTower etRight;

    public Wall wLeft;
    public Wall wRight;

    public Base_Spawner(Base world){
        this.world = world;

        midX = world.getWidth() / 2;
        midY = world.getHeight() / 2;

        spawnPoint_right = world.getWidth() - 20;
        spawnPoint_left = 20;
        spawnHeight = world.getHeight() - (ground.getImage().getHeight() + 30);

        initBuildings();
    }

    public void act() 
    {

        if(Engine.GameValues._RoundStarted && !Engine.GameValues._GameOver){
            
            if(player == null){spawnPlayer();}
            spawn();

            if(enemyCounter >= amountToSpawn && getWorld().getObjects(TowerDefenceEnemys.class).isEmpty()){
                //System.out.println("finished spawning.");
                Engine.GameValues._RoundStarted = false;
                enemyTypeToSpawn = null;
                if(getRandomNumber(1,2) == 1){
                    ((Base) getWorld()).getMenu().switchWorldTo(MainMenu.levelTypes.DESERT);
                }else{
                    ((Base) getWorld()).getMenu().switchWorldTo(MainMenu.levelTypes.FOREST);
                }
            }
        }
    }

    private void decideEnemyType(){
        int random = getRandomNumber(1,3);
        if(random == 1){
            enemyTypeToSpawn = EnemyTypes.ARABS;
            amountToSpawn = amountToSpawn / 2;
        }else if(random == 2){
            enemyTypeToSpawn = EnemyTypes.CHINESE;
        }
        else if(random == 3){
            enemyTypeToSpawn = EnemyTypes.MEXICANS;
        }
    }

    private void spawn(){

        if(enemyTypeToSpawn == null){
            decideEnemyType();
        }

        if(!marked){
            marked = true; 
            timer.mark();
        }

        if((enemyCounter < amountToSpawn) && (timer.millisElapsed() >= (spawnDelay * 1000))){
            //System.out.println("spawned enemy number : " + (enemyCounter + 1));

            switch (enemyTypeToSpawn){
                case ARABS:
                    spawnArabs();
                    break;
                case CHINESE:
                    spawnChinese();
                    break;
                case MEXICANS:
                    spawnMexicans();
                    break;
                
            }

            enemyCounter++;
            timer.mark();
        }
    }

    private void spawnArabs(){
        if(getRandomNumber(1,2) == 1){
            world.addObject(new TD_Arab("right"), spawnPoint_left, spawnHeight);
        }else{
            world.addObject(new TD_Arab("left"), spawnPoint_right, spawnHeight);
        }
    }

    private void spawnChinese(){
        if(getRandomNumber(1,2) == 1){
            world.addObject(new TD_Chinese("right"), spawnPoint_left, spawnHeight);
        }else{
            world.addObject(new TD_Chinese("left"), spawnPoint_right, spawnHeight);
        }
    }

    private void spawnMexicans(){        
        if(getRandomNumber(1,2) == 1){
            world.addObject(new TD_Mexican("right"), spawnPoint_left, spawnHeight);
        }else{
            world.addObject(new TD_Mexican("left"), spawnPoint_right, spawnHeight);
        }
    }

    public int getRandomNumber(int start, int end){
        int number=Greenfoot.getRandomNumber(end);
        return number+start;
    }

    private void initBuildings(){
        wh = new WhiteHouse();

        ptLeft = new PhysicalTower();
        ptRight = new PhysicalTower();

        etLeft = new EffectTower();
        etRight = new EffectTower();

        wLeft = new Wall();
        wRight = new Wall();
    }

    public void spawnBuildings(){

        //WhiteHouse:
        world.addObject(wh, midX, world.getHeight() - ground.getImage().getHeight() - (wh.getImage().getHeight() / 2) + 1 );

        //Tower:
        world.addObject(etLeft, midX - ((wh.getImage().getWidth() / 2) + offset_et), world.getHeight() - ground.getImage().getHeight() - (etLeft.getImage().getHeight() / 2) );
        world.addObject(etRight, midX + ((wh.getImage().getWidth() / 2) + offset_et), world.getHeight() - ground.getImage().getHeight() - (etRight.getImage().getHeight() / 2) );

        world.addObject(ptLeft, midX - ((wh.getImage().getWidth() / 2) + offset_pt), world.getHeight() - ground.getImage().getHeight() - (ptLeft.getImage().getHeight() / 2) );
        world.addObject(ptRight, midX + ((wh.getImage().getWidth() / 2) + offset_pt), world.getHeight() - ground.getImage().getHeight() - (ptRight.getImage().getHeight() / 2) );

        //Walls:
        world.addObject(wLeft, midX - ((wh.getImage().getWidth() / 2) + offset_wall), world.getHeight() - ground.getImage().getHeight() - (wLeft.getImage().getHeight() / 2) + offset_buildingHeight );
        world.addObject(wRight, midX + ((wh.getImage().getWidth() / 2) + offset_wall), world.getHeight() - ground.getImage().getHeight() - (wRight.getImage().getHeight() / 2)  + offset_buildingHeight);

    }

    public void spawnGround(){
        world.addObject(ground, world.getWidth() / 2, world.getHeight() - (ground.getImage().getHeight() / 2));
    }
    
    public void spawnPlayer(){
        player = new Player();
        world.addObject(player, world.getWidth() / 2, world.getHeight() / 2);
    }

    //Getter & Setter:

    public int getSpawnPoint_left(){
        return spawnPoint_left;
    } 

    public int getSpawnPoint_right(){
        return spawnPoint_right;
    } 

    public int getSpawnHeight(){
        return spawnHeight;
    }

    public void setSpawning(boolean b){
        Engine.GameValues._RoundStarted = b;
    }

}
