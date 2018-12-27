import greenfoot.*;
 
public class HolzPalisade extends Actor
{
    public HolzPalisade()
    {
        //getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
        GreenfootImage image = getImage();
        image.scale(image.getWidth() -600 , image.getHeight() - 800);
        setImage(image);
    }
 
    //  rest of class
}