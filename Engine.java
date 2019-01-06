import greenfoot.*;

/**
 * Write a description of class BackEnd here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class Engine
{
    public static class Config{

        public static int _Width = 1800;
        public static int _Height = 900;

    }

    public static class GameValuesFixed{

        public static int _AmountOfEnemysToSpawnIncrease = 10;
        
        public static int _ResPerRoundBase = 250;
        public static int _CoinValue = 200;
        public static int _BarrelValue = 200;
        public static int _SteelValue = 200;

        public static int _FirstRoundTime = 3000;
        public static int _RoundTimeDecreases = 500;
        public static int _MinimumRoundTimer = 1000;
        
        public static int _spawnRateinMilliSeconds = 1500;
        
        public static int _UpgradeCostAtStart = 500;
        
        public static int _UpgradeCostIncrease = 500;
        
        public static int _AttackDamageUpdate = 25;
        public static int _AttackSpeedUpdate = -150;
        public static int _HealthUpdate = 50;
        
        public static int _PhysicalRangeBonus = 5;
        public static int _EffectRangeBonus = 10;
        
        //Enemys:
        public static int _EnemySpeedUpgrade = 1;
        public static int _EnemyAttackDamageUpgrade = 10;
        public static int _EnemyAttackSpeedUpgrade = -100;
        public static int _EnemyHealthUpgrade = 25;
        

    }

    public static class GameValues{

        public static int _CurrentRoundTime = Engine.GameValuesFixed._FirstRoundTime;

        public static boolean _GameOver = false;

        public static boolean _RoundStarted = false;

        public static int _currentRound = 0;
        public static int _CurrentAmountOfEnemysToSpawn = 10;
        public static int _RessourcesCurrent = 1000;

    }

    public static class ActorValues{
        //Player:
        public static int _ShootInterval = 800;

        //Bullet:
        public static int _BulletSpeed = 20;
        public static int _BulletDamage = 50;

        //Display: 
        public static int _Display_Position_Y = 600;
        
        //Tower:
        
        public static int _PhysicalAttackDamage = 25;
        public static int _EffectAttackDamage = 25;
        
        public static int _PhysicalAttackSpeed = 1500;
        public static int _EffectAttackSpeed = 3000;
        
        public static int _SlowTicks = 1000;

        //Enemys:
        public static int _ArabLife = 200;
        public static int _ChineseLife = 100;
        public static int _MexicanLife = 100;

        public static int _ArabSpeed = 3;
        public static int _ChineseSpeed = 4;
        public static int _MexicanSpeed = 3;

        public static int _ArabAttackSpeed = 2000;
        public static int _ChineseAttackSpeed = 1000;
        public static int _MexicanAttackSpeed = 2000;

        public static int _ArabAttackDamage = 50;
        public static int _ChineseAttackDamage = 30;
        public static int _MexicanAttackDamage = 50;

        public static int _ArabRes = 50;
        public static int _ChineseRes = 50;
        public static int _MexicanRes = 50;
        
        
        //TD_Enemys:
        public static int _TD_ArabLife = 200;
        public static int _TD_ChineseLife = 50;
        public static int _TD_MexicanLife = 100;

        public static int _TD_ArabSpeed = 2;
        public static int _TD_ChineseSpeed = 4;
        public static int _TD_MexicanSpeed = 2;

        public static int _TD_ArabAttackSpeed = 2000;
        public static int _TD_ChineseAttackSpeed = 1000;
        public static int _TD_MexicanAttackSpeed = 2000;

        public static int _TD_ArabAttackDamage = 50;
        public static int _TD_ChineseAttackDamage = 30;
        public static int _TD_MexicanAttackDamage = 50;

        public static int _TD_ArabRes = 50;
        public static int _TD_ChineseRes = 50;
        public static int _TD_MexicanRes = 50;

    }

    public static class ImageLoader{
        //  Engine.ImageLoader.xxx;

        //Buttons
        public static GreenfootImage _startButton = new GreenfootImage("startButton.png");
        public static GreenfootImage _exitButton = new GreenfootImage("exitButton.png");

        public static GreenfootImage _ReadyButton = new GreenfootImage("readyButton.png");

        public static GreenfootImage _UpgradeButton_visible = new GreenfootImage("upgradeButton_visible.png");
        public static GreenfootImage _UpgradeButton_unclickable = new GreenfootImage("upgradeButton_unclickable.png");

        //Player:
        public static GreenfootImage _image_right_Player = new GreenfootImage("player_right.png");
        public static GreenfootImage _image_left_Player = new GreenfootImage("player_left.png");

        //Bullet:
        public static GreenfootImage _image_right_Bullet = new GreenfootImage("bullet_right.png");
        public static GreenfootImage _image_left_Bullet = new GreenfootImage("bullet_left.png");

        //Enemys:
        //Arabs
        public static GreenfootImage _image_right_Arab = new GreenfootImage("arab_right.png");
        public static GreenfootImage _image_left_Arab = new GreenfootImage("arab_left.png");

        //Chinese
        public static GreenfootImage _image_right_Chinese = new GreenfootImage("chinese_right.png");
        public static GreenfootImage _image_left_Chinese = new GreenfootImage("chinese_left.png");

        //Mexicans
        public static GreenfootImage _image_right_Mexican = new GreenfootImage("mexican_right.png");
        public static GreenfootImage _image_left_Mexican = new GreenfootImage("mexican_left.png");

        //Buildings:
        public static GreenfootImage _image_WhiteHouse = new GreenfootImage("WhiteHouse.png");

        public static GreenfootImage _image_Wall = new GreenfootImage("wall.png");

        public static GreenfootImage _image_PhysicalTower = new GreenfootImage("physicalTower.png");

        public static GreenfootImage _image_EffectTower = new GreenfootImage("effectTower.png");

        //Grounds:
        public static GreenfootImage _image_Base_Ground = new GreenfootImage("base_ground.png");
        public static GreenfootImage _image_Desert_Ground = new GreenfootImage("desert_ground.png");
        public static GreenfootImage _image_Forest_Ground = new GreenfootImage("forest_ground.png");

        //BackGrounds:
        public static GreenfootImage _image_MainMenu_BackGround = new GreenfootImage("mainMenu_background.png");
        public static GreenfootImage _image_EndScreen = new GreenfootImage("EndScreen.png");

    }
}
