
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yohan
 */
public class Player {
    public int chips;
    public Lantai Lantai;
    private Image tiles;
    private  Point location;
    public int x,y;
    
    public Player(int x,int y )
    {
       
    URL tile=getClass().getResource("/pikachu.png");
        if (tile==null)
        {
            System.err.println("brummmmmm");
        }
        else
        {
            tiles = Toolkit.getDefaultToolkit().getImage(tile);
        }
        chips=0;
        this.x=x;
        this.y=y;
    }

    public Image getPlayer() {
        return tiles;
    }

   

    

    

    
    /**
     * method move untuk bergerak 
     * kalo int 0 kekiri, int 1 kekanan , 2 keatas, 3 kebawah,4 tidak melakukan apa apa
     * @param  sebagai variable
     */
            public void  move (int n)
            {
                if (n == 0)
                {
                    this.y--;
                }
                else if(n==1)
                {
                   this.y++;
                }
                else if(n==2)
                {
                  this.x--;
                }
                else if(n==3)
                {
                    this.x++;
                }     
            }
    
    /**
     * method mati jika player mati terkena rintangan
     */        
            public void mati()
            {
                
            }

    Image getTiles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
     /**
      * method akan dipanggil jika salah satu item diambil 
      */       
            
}
