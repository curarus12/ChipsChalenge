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
    public Air(int x, int y)
    {
        super(x,y);
        URL air=getClass().getResource("/water.png");
        if (air==null)
        {
            System.err.println("panas");
        }
        else
        {
            airs = Toolkit.getDefaultToolkit().getImage(air);
        }
      
    }

    public Image getAirs() {
        return airs;
    }
   
    
}

