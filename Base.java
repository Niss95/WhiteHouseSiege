import greenfoot.*;

/**
 * Write a description of class Base here.
 * 
 * @author (Dennis Sellemann) 
 * @version (a version number or a date)
 */
public class Base extends Level
{
    private Base_Ground ground;
    private Base_Logic logic;
    
    private GreenfootImage background = new GreenfootImage("base_background.png"); 

    public Base(MainMenu menu)
    {    
        super(menu, Engine.Config._Width, Engine.Config._Height); 
        this.setBackground(background);
        
        logic = new Base_Logic(this);
        this.addObject(logic, 0, 0);
        prepare();
        
        initUpgradingPhase();
    }

    public Base()
    {    
        super(new MainMenu(), Engine.Config._Width, Engine.Config._Height); 
        this.setBackground(background);
        
        logic = new Base_Logic(this);
        this.addObject(logic, 0, 0);
        prepare();
        
        initUpgradingPhase();
    }
    
    
    private void prepare()
    {
        logic.spawnGround();
        logic.spawnBuildings();
    }
    
    private void initUpgradingPhase(){
        logic.initUpgradingPhase();
    }
    
    public void startRound(){
        logic.startRound();  
    }
}
