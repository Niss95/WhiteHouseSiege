import greenfoot.*;
 
public class WhiteHouse extends Actor
{
    public WhiteHouse()
    {
        //getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
        GreenfootImage image = getImage();
        image.scale(image.getWidth() -400 , image.getHeight() - 300);
        setImage(image);
    }
 
    //  rest of class
}