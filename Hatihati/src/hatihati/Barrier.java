
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
public class Barrier extends Lantai{
    private boolean isDestroyed;
    private int x, y ;
    Image barrier; 
    public Barrier(int x, int y)
    {
        super(x,y);
        isDestroyed =false;
         URL api=getClass().getResource("/barrier.png");
        if (api==null)
        {
            System.err.println("ga bisa nabrak");
        }
        else
        {
            barrier = Toolkit.getDefaultToolkit().getImage(api);
        }
      
    }
/**
 * method ini untuk mengembilkan image atau gambar yang sudah diambil dari src
 * @return 
 */
    public Image getBarrier() {
        return barrier;
    }
    
}
