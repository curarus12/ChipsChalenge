



import com.sun.org.apache.xerces.internal.util.FeatureState;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
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
        }
        //x.move(0);
    
    /**
     private void formKeyPressed(java.awt.event.KeyEvent evt) {                                

        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            x.move(3);
        } else if(evt.getKeyCode()==KeyEvent.VK_UP){
            world.move(2);
        } else if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
            world.move(1);
        } else if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            world.move(0);
        }
        else 
        {
            
        }
// TODO add your handling code here:
    }                               


    /**
     * @param args the command line arguments
     */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   

    /**
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        
    }
}**/
}