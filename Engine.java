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

    public static class GameValues{

        public static boolean _GameOver = false;

        public static boolean _RoundStarted = false;

        public static int _Round = 0;
        public static int _Res = 0;

    }

    public static class ActorValues{
        //Player:
        public static int _ShootInterval = 500;
        //Bullet:
        public static int _BulletSpeed = 20;
        public static int _BulletDamage = 100;
        //Enemys:
        public static int _ArabLife = 200;
        public static int _ChineseLife = 50;
        public static int _MexicanLife = 100;

        public static int _ArabSpeed = 3;
        public static int _ChineseSpeed = 4;
        public static int _MexicanSpeed = 3;

        public static int _ArabAttackSpeed = 2;
        public static int _ChineseAttackSpeed = 1;
        public static int _MexicanAttackSpeed = 2;

        public static int _ArabAttackDamage = 50;
        public static int _ChineseAttackDamage = 30;
        public static int _MexicanAttackDamage = 50;

        public static int _ArabRes = 50;
        public static int _ChineseRes = 50;
        public static int _MexicanRes = 50;

    }

    public static class ImageLoader{
        //  Engine.ImageLoader.xxx;

        public static GreenfootImage _startButton = new GreenfootImage("startButton.png");
        public static GreenfootImage _exitButton = new GreenfootImage("exitButton.png");

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
        public static GreenfootImage _image_Desert_Ground = new GreenfootImage("desground5.png");
        public static GreenfootImage _image_Forest_Ground = new GreenfootImage("FOORESTground.png");

        //BackGrounds:
        public static GreenfootImage _image_MainMenu_BackGround = new GreenfootImage("mainMenu_background.png");

    }
}
