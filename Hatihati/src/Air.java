/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author Yohan
 */
public class Air extends Lantai{
     private Image airs;
     /**
      * x dan y adalah untuk koordinat di lantai
      * @param x
      * @param y 
      */
    public Air(int x, int y)
    {
        super(x,y);
        URL air=getClass().getResource("/water.jpg");
        if (air==null)
        {
            System.err.println("panas");
        }
        else
        {
            airs = Toolkit.getDefaultToolkit().getImage(air);
        }
      
    }
/**
 * method ini untuk mengembilkan image atau gambar yang sudah diambil dari src
 * @return 
 */
    public Image getAirs() {
        return airs;
    }
   
    
}

