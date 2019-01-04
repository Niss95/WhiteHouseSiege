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
        
        public static int _Round = 0;
        public static int _Res = 0;
        
    }
    
    public static class EnemyValues{
    
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
    
    }
}
