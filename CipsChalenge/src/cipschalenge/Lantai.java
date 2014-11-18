package cipschalenge;


import java.awt.Image;
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
public class Lantai {
   
    // x dan y = koordinat
    public int x, y ;  
    private Image tiles;
   
    public Lantai(int x, int y)
    {
        this.x=x;
        this.y=y;
      URL tile=getClass().getResource("/tile.jpg");
        if (tile==null)
        {
            System.err.println("ga bisa napak");
        }
        else
        {
            tiles = Toolkit.getDefaultToolkit().getImage(tile);
        }
         
    }

    public Image getTiles() {
        return tiles;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   
}
