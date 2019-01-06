import greenfoot.*;

/**
 * Write a description of class Buildings here.
 * 
 * @author (Dennis Sellemann)
 * @version (a version number or a date)
 */
public abstract class Buildings extends Unit
{
    public Display display = new Display(1, true);
    
    private int rangeBonus = 0;

    public int level = 1;

    public int lastX = 0;
    public int lastY = 0;

    public boolean intact;
    
    public Base world;
    public boolean killed = false;

    public void upgrade(){
        if(checkUpgradebal()){
            checkRespawn();
            Engine.GameValues._RessourcesCurrent -= this.getUpgradeCostCurrent();
            increaseRange(rangeBonus);
            increaseDamage(Engine.GameValuesFixed._AttackDamageUpdate);
            increaseAttackSpeed(Engine.GameValuesFixed._AttackSpeedUpdate);
            increaseHealth(Engine.GameValuesFixed._HealthUpdate);
            increaseLevel();
            //at the End
            increaseUpgradeCost();
        }
    }
    
    public void checkRespawn(){}

    public void increaseLevel(){
        setLevel(getLevel() + 1);
    }

    public boolean checkUpgradebal(){
        if(Engine.GameValues._RessourcesCurrent >= this.getUpgradeCostCurrent()){return true;}
        return false;
    }

    public void addDisplay(){
        this.getWorld().addObject(display, getX(), Engine.ActorValues._Display_Position_Y);
    }

    public void updateDisplay(int level){
        display.updateDisplay(level);
    }

    public boolean getIntact(){
        return intact;
    }

    public void setLevel(int level){
        this.level = level;
        updateDisplay(level);
    }

    public int getLevel(){
        return this.level;
    }

    public void setIntact(boolean intact){
        this.intact = intact;
    }
    
    public void setRangeBonus(int bonus){
        this.rangeBonus = bonus;
    }
}
