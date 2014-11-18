package cipschalenge;


import com.sun.org.apache.xpath.internal.operations.Equals;
import java.awt.Graphics;
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
public class World extends JPanel {

    Object[][] dunia;
    Player player;
    int x, y;
    Key key;
    Lantai lantai;
    Dinding[] d;
    Api[] a;
    Barrier[] b;
    Cips cips;
    boolean blocking;
    Graphics g;

    public World() {
        dunia = new Object[10][10];
        //d = new Dinding[5];
        //a = new Api[2];
        //b = new Barrier[1];
        assign();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(dunia[i][j]);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Api p=new Api(0,0);
        Barrier b= new Barrier(0,0);
        Cips c= new Cips(0,0);
        Dinding d= new Dinding(0,0);
        Lantai l= new Lantai(0,0);
        Player s = new Player(2,2);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (dunia[i][j] instanceof Api) {
                    g.drawImage(p.getApis(), i*60, j*60, this);
                }
                else if (dunia[i][j] instanceof Player) {
                    g.drawImage(s.getPlayer(), i*60, j*60, this);
                } else if (dunia[i][j] instanceof Barrier) {
                    g.drawImage(b.getBarrier(), i*60, j*60, this);
                } else if(dunia [i][j] instanceof Cips){
                    g.drawImage(c.getCips(), i*60, j*60, this);
                }
                else if(dunia [i][j] instanceof Dinding){
                    g.drawImage(d.getDinding(), i*60, j*60, this);
                } else if(dunia [i][j] instanceof Lantai){
                    g.drawImage(l.getTiles(), i*60, j*60, this);
                }
            }
        }

    }

    public void assign() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if((i==4 && j==4) || (i==4 && j==3) || (i==4 && j==2)){
                    dunia[i][j]=new Dinding(i,j);
                } else if((i==2 && j==3) || (i==1 && j==1)){
                    dunia [i][j]= new Api(i,j);
                } else if((i==9 && j==4) || (i==9 &&  j==5) || (i==9 && j==6)){
                    dunia[i][j]=new Cips(i,j);
                } else if(i==9 && j==8){
                    dunia[i][j]=new Barrier(i,j);
                }
                else if(i==2 && j==2){
                    dunia[i][j]=new Player(i,j);
                } else {
                    dunia[i][j]= new Lantai(i,j);
                }
            }
        }
        /**
        this.d[0] = new Dinding(4, 4);
        this.d[1] = new Dinding(4, 3);
        this.d[2] = new Dinding(4, 2);
        this.d[3] = new Dinding(1, 2);
        this.d[4] = new Dinding(2, 2);
        dunia[4][4] = this.d[0];
        dunia[4][3] = this.d[1];
        dunia[4][2] = this.d[2];
        dunia[1][2] = this.d[3];
        dunia[2][2] = this.d[4];
        
        this.a[0] = new Api(2, 3);
        this.a[1] = new Api(1, 1);
        dunia[2][3] = a[0];
        dunia[1][1] = a[1];
        
        dunia[9][4] = new Cips(9, 4);
        dunia[9][5] = new Cips(9, 5);
        dunia[9][6] = new Cips(9, 6);
        this.b[0] = new Barrier(9, 8);
        dunia[9][8] = this.b;

        dunia[3][3] = new Door(3, 3);
        ((Door) dunia[3][3]).setColor(0);
        dunia[3][2] = new Door(3, 2);
        ((Door) dunia[3][2]).setColor(2);
        **/
    }

    public void verifyMove() {

    }

    public void move(int n) {
        if (n == 0) {
            System.out.println(player.chips);
            if (dunia[player.x][player.y - 1] instanceof Dinding) {
            } else if (dunia[player.x][player.y - 1] instanceof Api) {
            } else if (dunia[player.x][player.y - 1] instanceof Door) {
            } else if (dunia[player.x][player.y - 1] instanceof Cips) {
                System.out.println(dunia[player.x][player.y] instanceof Cips);
                int a = player.x;
                int b = player.y;
                player.move(n);
                dunia[player.x][player.y] = player;
                dunia[a][b] = lantai;
                player.chips++;
            } else if (dunia[player.x][player.y] instanceof Barrier) {
                if (player.chips == 3) {
                    int a = player.x;
                    int b = player.y;
                    player.move(n);
                    dunia[player.x][player.y] = player;
                    dunia[a][b] = lantai;
                } else {
                }
            } else {
                int a = player.x;
                int b = player.y;
                player.move(n);
                dunia[player.x][player.y] = player;
                dunia[a][b] = lantai;
            }

        } else if (n == 2) {
            System.out.println(player.chips);
            if (dunia[player.x - 1][player.y] instanceof Dinding) {
            } else if (dunia[player.x - 1][player.y] instanceof Api) {
            } else if (dunia[player.x - 1][player.y] instanceof Cips) {
                int a = player.x;
                int b = player.y;
                player.move(n);
                dunia[player.x][player.y] = player;
                dunia[a][b] = lantai;
                player.chips++;
            } else if (dunia[player.x - 1][player.y] instanceof Barrier) {
                if (player.chips == 3) {
                    int a = player.x;
                    int b = player.y;
                    player.move(n);
                    dunia[player.x][player.y] = player;
                    dunia[a][b] = lantai;
                } else {
                }

            } else {
                int a = player.x;
                int b = player.y;
                player.move(n);
                dunia[player.x][player.y] = player;
                dunia[a][b] = lantai;
            }
        } else if (n == 3) {
            System.out.println(player.chips);
            if (dunia[player.x + 1][player.y] instanceof Dinding) {
            } else if (dunia[player.x + 1][player.y] instanceof Api) {
            } else if (dunia[player.x + 1][player.y] instanceof Cips) {
                int a = player.x;
                int b = player.y;
                player.move(n);
                dunia[player.x][player.y] = player;
                dunia[a][b] = lantai;
                player.chips++;
            } else if (dunia[player.x + 1][player.y] instanceof Barrier) {
                if (player.chips == 3) {
                    int a = player.x;
                    int b = player.y;
                    player.move(n);
                    dunia[player.x][player.y] = player;
                    dunia[a][b] = lantai;
                } else {
                }

            } else {
                int a = player.x;
                int b = player.y;
                player.move(n);
                dunia[player.x][player.y] = player;
                dunia[a][b] = lantai;
            }

        } else if (n == 1) {
            System.out.println(player.chips);
            if (dunia[player.x][player.y + 1] instanceof Dinding) {
            } else if (dunia[player.x][player.y + 1] instanceof Api) {
            } else if (dunia[player.x][player.y + 1] instanceof Cips) {
                int a = player.x;
                int b = player.y;
                player.move(n);
                dunia[player.x][player.y] = player;
                dunia[a][b] = new Lantai(a, b);
                player.chips++;
            } else if (dunia[player.x][player.y + 1] instanceof Barrier) {
                if (player.chips == 3) {
                    int a = player.x;
                    int b = player.y;
                    player.move(n);
                    dunia[player.x][player.y] = player;
                    dunia[a][b] = lantai;
                } else {
                }

            } else {
                System.out.println(player.chips);
                int a = player.x;
                int b = player.y;
                player.move(n);
                dunia[player.x][player.y] = player;
                dunia[a][b] = lantai;
            }

        }
    }
}
