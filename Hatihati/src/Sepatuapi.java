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
public class Sepatuapi extends Lantai {

    private int x, y;
    Image sepatuApi;

    public Sepatuapi(int x, int y) {
        super(x, y);
        URL sepatu = getClass().getResource("/sepatuApi.jpg");
        if (sepatu == null) {
            System.err.println();
        } else {
            sepatuApi = Toolkit.getDefaultToolkit().getImage(sepatu);
        }

    }
/**
 * method ini untuk mengembilkan image atau gambar yang sudah diambil dari src
 * @return 
 */
    public Image getSepatuApi() {
        return sepatuApi;
    }

}
