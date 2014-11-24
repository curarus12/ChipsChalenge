
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
public class SepatuAir extends Lantai{
 
    private int x, y;
    Image sepatuAir;

    public SepatuAir(int x, int y) {
        super(x, y);
        URL sepatu = getClass().getResource("/SepatuAir.png");
        if (sepatu == null) {
            System.err.println();
        } else {
            sepatuAir = Toolkit.getDefaultToolkit().getImage(sepatu);
        }

    }
/**
 * method ini untuk mengembilkan image atau gambar yang sudah diambil dari src
 * @return 
 */
    public Image getSepatuAir() {
        return sepatuAir;
    }

}

