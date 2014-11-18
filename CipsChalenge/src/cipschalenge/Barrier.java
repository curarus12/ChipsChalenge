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

    public Image getBarrier() {
        return barrier;
    }
    
    public void destroyed(int playerChips,int worldChips)
    {
        if(playerChips == worldChips)
        {
            
        }
        else 
        {
            
        }
    }
}
