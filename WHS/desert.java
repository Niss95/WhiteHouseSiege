import greenfoot.*;

/**
 * Write a description of class desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class desert extends World
{
    int Max_Mexicans= 11;
    int Act_Mexicans;
    long begintime=System.currentTimeMillis();
    int score; 
    int time=3000;
   
    
    
    /**
     * Constructor for objects of class desert.
     * 
     */
   
    
    public desert()
    {    
        super(1000, 600, 1);
        Mexican alejo=new Mexican("right");
        addObject(alejo, getRandomNumber(0, 600),getRandomNumber(0, 400));
        Act_Mexicans= Act_Mexicans+1;
       
            
        }
        public void act(){
             
            showText("Score: "+ score, 920, 20);
            show_time();
            time--;
            if(time==0){
                Greenfoot.stop();
                Greenfoot.setWorld(new Base());     
            }
               
            long interval=getRandomTime(150, 500);
            if((System.currentTimeMillis()-begintime)/1000 >= interval){
                addRandommexicans();
                begintime= System.currentTimeMillis();
            }
            /*try {
                Thread.sleep(3000);
                addRandommexicans();
                //Thread.sleep(getRandomTime(0, 30));
            }
            catch(InterruptedException ie) {}*/
            
            
        }
        
            
    
    public int getRandomNumber(int start, int end){
        int number=Greenfoot.getRandomNumber(end-start+1);
        return number+start;
    }
    public long getRandomTime(long start, long end){
         long number=Greenfoot.getRandomNumber((int)(end-start));
        return number+start;
    }
    public void addRandommexicans (){
        //for(int i=0;i<=Max_Mexicans;i++)
        if(Act_Mexicans<= Max_Mexicans){
            addObject(new Mexican ("left"), getRandomNumber(0, 1000),getRandomNumber(0, 600));
            Act_Mexicans= Act_Mexicans+1;
           
        }
        
        
    }
    public void show_time(){
             showText("Time: "+time, 65, 20);
             
            }
}
    /*        
     * public void addRandommexicans (){
        for(int i=0;i<=Max_Mexicans;i++){
            int interval=getRandomNumber(150, 1500);
            addObject(new mexican (), getRandomNumber(0, 600),getRandomNumber(0, 400));
            begintime= System.currentTimeMillis();
              
            Act_Mexicans= Act_Mexicans+1;
        } 
        public void act(){
           int interval=getRandomNumber(150, 1500);  // Immer neu aktuelle aktualisieren
            if((System.currentTimeMillis()-begintime)/1000>= interval){
                 addRandommexicans ();
                 begintime= System.currentTimeMillis();
        }
        }
            try {
                Thread.sleep(30);
                //Thread.sleep(getRandomTime(0, 30));
            }
            catch(InterruptedException ie) {
                addObject(alejo, getRandomNumber(0, 600),getRandomNumber(0, 400));
            }
            mexicans=mexicans+1;
            */
        


