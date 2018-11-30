import greenfoot.Greenfoot;

public class Level02 extends Level
{
    public void setFields()
    {
        map = new String[] { "                         ",
                             "                         ",
                             "                         ",
                             "         f               ",
                             "                 m       ",
                             "                         ",
                             "                         ",
                             "     wwwwwwwwww    f     ",
                             "                         ",
                             "                         ",
                             "     m   f               ",
                             "                         ",
                             "                         ",
                             "                f        ",
                             "                         ",
                             " d                     k ",
                             " w          c            ",
                             "                         ",
                             "ppppppppppppppppppppppppp" };
    }
    
    public void nextLevel()
    {
        Greenfoot.setWorld(new Level03());
        setBackground("download.jpg");
    }
}