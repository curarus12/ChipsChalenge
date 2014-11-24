
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
    
    public Player(int x,int y )
    {
        location= new Point(x,y);
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
    }
        /**
 * method ini untuk mengembilkan image atau gambar yang sudah diambil dari src
 * @return 
 */

    public Image getPlayer() {
        return tiles;
    }
/**
 * untuk mendapatkan lokasi player di tiles
 * @return 
 */
    public Point getLocation() {
        return location;
    }
/**
 * untuk mengeset posisi player di lantai
 * @param x
 * @param y 
 */
    public void setLocation(int x, int y) {
        this.location = new Point(x,y);
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
                    setLocation(this.getLocation().x, this.getLocation().y-1);
                }
                else if(n==1)
                {
                    setLocation(this.getLocation().x, this.getLocation().y+1);
                }
                else if(n==2)
                {
                  setLocation(this.getLocation().x-1, this.getLocation().y);
                }
                else if(n==3)
                {
                    setLocation(this.getLocation().x+1, this.getLocation().y);
                }     
            }
    
    /**
     * method mati jika player mati terkena rintangan
     */        
                

    Image getTiles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
     /**
      * method akan dipanggil jika salah satu item diambil 
      */       
            
}
