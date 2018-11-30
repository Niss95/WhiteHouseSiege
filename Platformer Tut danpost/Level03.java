import greenfoot.Greenfoot;

public class Level03 extends Level
{
    public void setFields()
    {    
        map = new String[] { "                         ",
                             "                         ",
                             "                         ",
                             "      bbbb               ",
                             "                         ",
                             "    m                    ",
                             "                         ",
                             "              gggggg     ",
                             "                         ",
                             "                         ",
                             "   gggggggb          m   ",
                             "                         ",
                             "                         ",
                             "      bbb       gggggggg ",
                             "                         ",
                             "                         ",
                             "   ggggpp   c            ",
                             "  k                 d    ",
                             "bbbbbbbbbbbbbbbbbbbbbbbbb" };
                     
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new Level04());
    }
}