
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
public class Dinding extends Lantai{
    public int x , y ;
    public int [][]koor ;
    private Image dinding;
    public boolean isBlocking;
    private Image apis;
    public Dinding(int x, int y)
    {
        super(x,y);
        this.koor= new int[x][y];
        isBlocking = false;
        URL api=getClass().getResource("/wall.jpg");
        if (api==null)
        {
            System.err.println("bawel banget temen gua berisik");
        }
        else
        {
            dinding = Toolkit.getDefaultToolkit().getImage(api);
        }
      
    }

/**
 * method ini untuk mengembilkan image atau gambar yang sudah diambil dari src
 * @return 
 */
    public Image getDinding() {
        return dinding;
    }
    
}
