import greenfoot.*;

 
public class TESLA extends Actor{

    
    public TESLA()
    {
        //getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
        GreenfootImage image = getImage();
        image.scale(image.getWidth() -800 , image.getHeight() - 500);
        setImage(image);
    }

}