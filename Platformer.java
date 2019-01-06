import greenfoot.*;

/**
 * Write a description of class Platformer here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class Platformer extends Level
{
    public Player player;
    
    public boolean initialized = false;
    
    public int time = Engine.GameValuesFixed._FirstRoundTime;
    
    int max_Mexicans= 4;
    int max_Chinese= 4;
    int max_Arabs= 4;

    int act_Mexicans = 0;
    int act_Arabs = 0;
    int act_Chinese = 0;
    
    public Platformer(MainMenu menu, int width, int height)
    {
        super(menu, width, height);
    }
    
    
    public void endRoutine(){
        initialized = false;
        player.addRessources();
        Engine.GameValues._RessourcesCurrent += Engine.GameValuesFixed._ResPerRoundBase;
        menu.switchWorldTo(MainMenu.levelTypes.BASE); 
    }
    
    
    public void setActMexicans(int i){ this.act_Mexicans = i;}

    public int getActMexicans(){return this.act_Mexicans;}

    public void setActChinese(int i){ this.act_Chinese = i;}

    public int getActChinese(){return this.act_Chinese;}

    public void setActArabs(int i){ this.act_Arabs = i;}

    public int getActArabs(){return this.act_Arabs;}
}
