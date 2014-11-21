
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
 *
 * 
 
 * w= new World();
        JFrame j=new JFrame();
        j.getContentPane().add(w);
        j.pack();
        j.setVisible(true);
    }
    
    public void draw(World x) {
        // variable  a dan b sebagai penyimpan posisi manusia yang sekarang
        int a = 0;
        int b = 0;
        for (int i = 0; i < x.dunia.length; i++) {
            for (int j = 0; j < x.dunia[i].length; j++) {
                if (x.dunia[i][j] instanceof Barrier) {
                    System.out.print("B ");
                } else if (x.dunia[i][j] instanceof Player) {
                    a = i;
                    b = j;
                    System.out.print("0 ");
                } else if (x.dunia[i][j] instanceof Dinding) {
                    System.out.print("D ");

                }
                else if (x.dunia[i][j] instanceof Lantai) {
                    System.out.print("L ");
            }
                else if (x.dunia[i][j] instanceof Cips) {
                    System.out.print("C ");
                }
            

            
        }
System.out.println(" ");
        
        }}

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
    public void play(){
        
    }
}
