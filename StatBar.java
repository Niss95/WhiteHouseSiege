import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * The StatBar class let's you display any stat with a little amount of code required.
 * 
 * @author Zamoht
 * @version January 2014
 */
public class StatBar extends Actor
{
    public static enum Style {RECT, ROUND, SMOOTH};
    private int max;
    private double value;
    private int target;
    private double temp;
    private double speed;
    private GreenfootImage frame;
    private GreenfootImage fullBar;
    private Style barStyle;
    private int fontSize;
    private int letterWidth;
    private int stringWidth;
    private Color color;
    /**
     * Updates the stat bar every act. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (target > value)
        {
            value+=speed*((double)max/1000.0);
            if (target < value)
            {
                value = target;
            }
        }
        else if (target < value)
        {
            value-=speed*((double)max/1000.0);
            if (target > value)
            {
                value = target;
            }
        }

        if (value != temp)
        {
            updateImage();
        }
    }    

    /**
     * Creates a stat bar using the given color, width, height, style, maximum value and current value.
     *
     * @param color the color of the stat bar. Transparent colors should be avoided.
     * @param width the width of the stat bar.
     * @param height the height of the stat bar.
     * @param style the style of the edges.
     * @param max the maximum value of the shown stat.
     * @param current the current value of the shown stat.
     */
    public StatBar(Color color, int width, int height, Style style, int max, int current)
    {
        barStyle = style;
        int edge = getEdge(width, height);
        if (current > max) current = max;
        frame = new GreenfootImage(width, height);
        frame.setColor(Color.gray);
        frame.fillOval(0, 0, edge, height);
        frame.fillRect(edge/2, 1, width-edge, height);
        frame.fillOval(width-edge, 0, edge, height);

        fullBar = new GreenfootImage(width, height);
        setColor(color, edge, false);

        setMax(max, true);
        this.value = current;
        target = (int)value;
        speed = 5;

        updateImage();
    }

    /**
     * Changes the color of the stat bar. Should not be used in the updateColor() method due to
     * bad performance.
     *
     * @param color a new color
     */
    public void setColor(Color color)
    {
        setColor(color, true);
    }

    private void setColor(Color color, int edge, boolean update)
    {
        if (fullBar == null || color.equals(this.color))
        {
            return;
        }
        this.color = color;
        int width = fullBar.getWidth();
        int height = fullBar.getHeight();
        fullBar.clear();
        fullBar.setColor(color);
        fullBar.fillOval(0, 0, edge, height);
        fullBar.fillRect(edge/2, 1, width-edge, height);
        fullBar.fillOval(width-edge, 0, edge, height);
        if (update)updateImage();
    }

    /**
     * Changes the color of the stat bar. Use this in the updateColor() method with the update parameter
     * set to false.
     *
     * @param color a new color.
     * @param update a boolean which should only be true if an instant update is needed.
     */
    public void setColor(Color color, boolean update)
    {
        int width;
        int height;
        if (fullBar != null)
        {
            width = fullBar.getWidth();
            height = fullBar.getHeight();
        }
        else
        {
            return;
        }
        setColor(color, getEdge(width, height), update);
    }

    /**
     * updateColor is called everytime the stat bar is updated. It should be implemented in
     * a subclass for changing the color of the stat bar.
     *
     */
    public void updateColor()
    {
        //Used by subclasses to update the color of the bar
    }

    /**
     * Adds a given amount to the value target of the stat bar.
     *
     * @param change the amount which the target should be changed. This value can be negative when
     * subtraction is needed instead of addition.
     */
    public void add(int change)
    {
        target += change;
        if (target > max) target = max;
        if (target < 0) target = 0;
        updateImage();
    }

    /**
     * Sets the target which the stat bar's current value will change to over time.
     *
     * @param target the value target
     */
    public void setTarget(int target)
    {
        this.target = target;
    }

    /**
     * Instantly changes the value and updates the bar with this new value.
     *
     * @param value a new value.
     */
    public void setValue(int value)
    {
        this.value = value;
        updateImage();
    }

    /**
     * Sets the maximum value the shown stat can reach. This does not fix the font size.
     *
     * @param max the maximum value.
     */
    public void setMax(int max)
    {
        setMax(max, false);
    }

    /**
     * Sets the maximum value the shown stat can reach.
     *
     * @param max the maximum value.
     * @param fixFont a boolean which determines wether the font size should be adjusted. If set
     * to true and the new maximum value is too large for the stat bar, the font size will be asjusted.
     */
    public void setMax(int max, boolean fixFont)
    {
        this.max = max;

        if (fixFont)
        {
            int width = frame.getWidth();
            int height = frame.getHeight();
            int digits = getDigits(max);
            fontSize = 1;
            GreenfootImage label = new GreenfootImage("0", fontSize, Color.black, null);
            while (label.getHeight() < height-height/5 && label.getWidth()*(digits*2+1) < width-width/5)
            {
                letterWidth = label.getWidth();
                fontSize++;
                label = new GreenfootImage("0", fontSize, Color.black, null);
            }
            fontSize--;

            label = new GreenfootImage(""+max+"/"+max, fontSize, Color.black, null);
            stringWidth = label.getWidth()/2;
        }

        updateImage();
    }

    /**
     * Sets the update speed of the statbar. This should not be changed due to a higher maximum value
     * since the update works with a percentage of the maximum value.
     *
     * @param speed the update speed. Setting this to 1 will change the current value with getMax()/1000
     * every act till the target is reached. Setting this to 2 will change the curren value with getMax()/500 and so on. Remember that the
     * speed is a double.
     */
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    private void updateImage()
    {
        updateColor();
        GreenfootImage image = new GreenfootImage(frame);
        double ratio = (double)value/(double)max;
        int width = (int)Math.round(ratio*frame.getWidth());
        if (width > 0)
        {
            GreenfootImage part = new GreenfootImage(width, frame.getHeight());
            part.drawImage(fullBar, 0, 0);
            image.drawImage(part, 0, 0);
        }
        GreenfootImage label = new GreenfootImage(""+(int)value+"/"+max, fontSize, Color.black, null);
        int modifier = 0;
        if (label.getHeight()%2 == 0 || (label.getHeight()%2 == 1 && image.getHeight()%2 == 1)) modifier = 1;
        image.drawImage(label,
            image.getWidth()/2 - stringWidth + letterWidth * (getDigits(max) - getDigits((int)value)),
            image.getHeight()/2 - label.getHeight()/2 + modifier);
        //image.getWidth()/2 - letterWidth*(getDigits(max)*2+1)/2 + letterWidth*(getDigits(max)-getDigits((int)value))
        setImage(image);
        temp = value;
    }

    private int getDigits(int value)
    {
        int digits = 0;
        do
        {
            digits++;
            value/=10;
        }
        while (value > 0);
        return digits;
    }

    private int getEdge(int width, int height)
    {   
        int edge;
        switch (barStyle)
        {
            case RECT:
            edge = 0;
            break;

            case ROUND:
            edge = height;
            break;

            case SMOOTH:
            edge = height/2;
            break;

            default:
            edge = 0;
            break;
        }
        return edge;
    }

    /**
     * Returns the maximum value.
     *
     */
    public int getMax()
    {
        return max;
    }

    /**
     * Returns the current value.
     *
     */
    public int getValue()
    {
        return (int)value;
    }
}
