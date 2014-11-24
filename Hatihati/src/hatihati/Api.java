
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
public class Api extends Lantai {
    public boolean isKilling;
    private Image apis;
    public Api(int x, int y)
    {
        super(x,y);
        isKilling = false;
        URL api=getClass().getResource("/apin.jpg");
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
    public Image getApis() {
        return apis;
    }
   
    
}
 