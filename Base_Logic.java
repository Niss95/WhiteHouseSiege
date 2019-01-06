import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Base_Spawner here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public class Base_Logic extends Logic
{
    private enum EnemyTypes{ ARABS, CHINESE, MEXICANS; }
    private SimpleTimer timer = new SimpleTimer();

    private Base world;

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

    private EnemyTypes enemyTypeToSpawn;
    private int enemyCounter = 0;

    //Ect:
    private Base_Ground ground = new Base_Ground();
    private Player player;
    private RessourcenDisplay resDisplay = new RessourcenDisplay(true);

    //Buttons:
    private ReadyButton readyButton = new ReadyButton();

    //Buildings:
    public WhiteHouse wh;

    public PhysicalTower ptLeft;
    public PhysicalTower ptRight;

    public EffectTower etLeft;
    public EffectTower etRight;

    public Wall wLeft;
    public Wall wRight;

    private List<Buildings> buildings = new ArrayList<Buildings>();
    private List<UpgradeButton> upgradeButtons = new ArrayList<UpgradeButton>();

    public Base_Logic(Base world){
        this.setImage(new GreenfootImage(1,1));
        this.world = world;

        midX = world.getWidth() / 2;
        midY = world.getHeight() / 2;

        spawnPoint_right = world.getWidth() - 20;
        spawnPoint_left = 20;
        spawnHeight = world.getHeight() - (ground.getImage().getHeight() + 30);

        world.addObject(resDisplay, (world.getWidth() / 2) , 0 + (resDisplay.getImage().getHeight()));

        initBuildings();
    }

    public void act(){

        if(Engine.GameValues._RoundStarted && !Engine.GameValues._GameOver){

            if(player == null){spawnPlayer();}

            spawn();
            checkRoundOver();
        }
        if(Engine.GameValues._GameOver){
            Greenfoot.setWorld(new EndScreen());
        }
    }

    public void startRound(){
        for(Buildings t : buildings){
            if(t instanceof Towers){
                //((Towers)t).getRangeDisplay().setVisible(false);
            }
        }

        for(UpgradeButton b : upgradeButtons){
            b.setVisible(false);
        }

        Engine.GameValues._currentRound++;
        Engine.GameValues._RoundStarted = true;
    }

    private void checkRoundOver(){
        if(enemyCounter >= Engine.GameValues._CurrentAmountOfEnemysToSpawn && getWorld().getObjects(TowerDefenceEnemys.class).isEmpty()){

            endRoutine();

            if(getRandomNumber(1,2) == 1){
                ((Base) getWorld()).getMenu().switchWorldTo(MainMenu.levelTypes.DESERT);
            }else{
                ((Base) getWorld()).getMenu().switchWorldTo(MainMenu.levelTypes.FOREST);
            }
        }
    }

    private void endRoutine(){

        for(UpgradeButton b : upgradeButtons){
            b.setVisible(true);
        }

        wRight.heal();
        wLeft.heal();

        
        world.removeObject(player);
        player = null;
        readyButton.setVisible(true);

        Engine.GameValues._RoundStarted = false;
        Engine.GameValues._CurrentAmountOfEnemysToSpawn += Engine.GameValuesFixed._AmountOfEnemysToSpawnIncrease;
        enemyCounter = 0;
        enemyTypeToSpawn = null;

        upgradeEnemys();
    }

    private void upgradeEnemys(){

        if(Engine.GameValues._currentRound != 0 && (Engine.GameValues._currentRound % 3 == 0)){
            Engine.ActorValues._TD_ArabLife = Engine.ActorValues._TD_ArabLife + Engine.GameValuesFixed._EnemyHealthUpgrade;
            Engine.ActorValues._TD_ChineseLife = Engine.ActorValues._TD_ChineseLife + Engine.GameValuesFixed._EnemyHealthUpgrade;
            Engine.ActorValues._TD_MexicanLife = Engine.ActorValues._TD_MexicanLife + Engine.GameValuesFixed._EnemyHealthUpgrade;

            Engine.ActorValues._TD_ArabSpeed = Engine.ActorValues._TD_ArabSpeed + Engine.GameValuesFixed._EnemySpeedUpgrade;
            Engine.ActorValues._TD_ChineseSpeed = Engine.ActorValues._TD_ChineseSpeed + Engine.GameValuesFixed._EnemySpeedUpgrade;
            Engine.ActorValues._TD_MexicanSpeed = Engine.ActorValues._TD_MexicanSpeed + Engine.GameValuesFixed._EnemySpeedUpgrade;

            Engine.ActorValues._TD_ArabAttackSpeed = Engine.ActorValues._TD_ArabAttackSpeed + Engine.GameValuesFixed._EnemyAttackSpeedUpgrade;
            Engine.ActorValues._TD_ChineseAttackSpeed = Engine.ActorValues._TD_ChineseAttackSpeed + Engine.GameValuesFixed._EnemyAttackSpeedUpgrade;
            Engine.ActorValues._TD_MexicanAttackSpeed = Engine.ActorValues._TD_MexicanAttackSpeed + Engine.GameValuesFixed._EnemyAttackSpeedUpgrade;

            Engine.ActorValues._TD_ArabAttackDamage = Engine.ActorValues._TD_ArabAttackDamage + Engine.GameValuesFixed._EnemyAttackDamageUpgrade;
            Engine.ActorValues._TD_ChineseAttackDamage = Engine.ActorValues._TD_ChineseAttackDamage + Engine.GameValuesFixed._EnemyAttackDamageUpgrade;
            Engine.ActorValues._TD_MexicanAttackDamage = Engine.ActorValues._TD_MexicanAttackDamage + Engine.GameValuesFixed._EnemyAttackDamageUpgrade;
        }
    }

    public void initUpgradingPhase(){
        world.addObject(readyButton, midX, midY / 2);

        if(upgradeButtons.isEmpty()){
            for(Buildings b : buildings){
                UpgradeButton button_temp = new UpgradeButton(b);
                upgradeButtons.add(button_temp);
            }
        }

        for(UpgradeButton b : upgradeButtons){
            world.addObject(b, b.getPosX() , b.getPosY() - b.getImage().getHeight() * 2);
        }
    }

    private void decideEnemyType(){
        int random = getRandomNumber(1,3);
        if(random == 1){
            enemyTypeToSpawn = EnemyTypes.ARABS;
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

        if((enemyCounter < Engine.GameValues._CurrentAmountOfEnemysToSpawn) && (timer.millisElapsed() >= Engine.GameValuesFixed._spawnRateinMilliSeconds)){
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
            if(enemyTypeToSpawn == EnemyTypes.ARABS){
                enemyCounter++; 
            }
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
        wh = new WhiteHouse(world);

        ptLeft = new PhysicalTower(world);
        ptRight = new PhysicalTower(world);

        etLeft = new EffectTower(world);
        etRight = new EffectTower(world);

        wLeft = new Wall(world);
        wRight = new Wall(world);

        buildings.add(wh);
        buildings.add(ptLeft);
        buildings.add(ptRight);
        buildings.add(etLeft);
        buildings.add(etRight);
        buildings.add(wLeft);
        buildings.add(wRight);
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

        //spawn Displays:
        for(Buildings b : buildings){
            b.addDisplay();
        }
    }

    public void spawnGround(){
        world.addObject(ground, world.getWidth() / 2, world.getHeight() - (ground.getImage().getHeight() / 2));
    }

    public void spawnPlayer(){
        player = new Player();
        world.addObject(player, wh.getX(), wh.getY());
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

}
