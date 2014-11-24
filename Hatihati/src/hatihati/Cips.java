
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
public class Cips{
    int jumlahCips, x,y ;
     public Lantai Lantai;
    private Image apis;

    

    public Cips(int x, int y)
    {
        URL api=getClass().getResource("/Cips.jpg");
        if (api==null)
        {
            System.err.println("panas");
        }
        else
        {
            apis = Toolkit.getDefaultToolkit().getImage(api);
        }
      
    }
/**
 * method ini untuk mengembilkan image atau gambar yang sudah diambil dari src
 * @return 
 */
    public Image getCips() {
        return apis;
    }

   
    
    
    
}
