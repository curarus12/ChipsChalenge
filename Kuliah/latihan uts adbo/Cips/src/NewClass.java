

import com.sun.org.apache.xerces.internal.util.FeatureState;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yohan
 */
public class NewClass extends JPanel {

    public static void main(String[] args) {
        JFrame j= new JFrame();
        NewClass c = new NewClass();
        World x = new World();
        j.getContentPane().add(x);
        j.pack();
        j.setVisible(true);
        j.pack();
        
        x.move(0);
    }
}
