
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
    int cips;
    int x, y;
    Key key;
    Lantai lantai;
    Dinding[] d;
    Api[] a;
    Barrier[] b;
    Cips cipss;
    boolean blocking;
    Graphics g;

    public World() {
        dunia = new Object[10][10];
        player = new Player(2, 2);
        dunia[2][2]= player;
                
        //d = new Dinding[5];
        //a = new Api[2];
        //b = new Barrier[1];
        this.cips= 3;
        assign();
        
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
                } else if(i==2 && j==2){
                    dunia[i][j]= player;
                }
                 else {
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

    public boolean verifyMove(int n) {
        boolean res=false;
        int x,y;
        if(n==0){
            x=player.getLocation().x;
            y=player.getLocation().y--;
            if(dunia [x][y] instanceof Lantai){
                res= true;
            } else if(dunia [x][y] instanceof Barrier){
                res=false;
            }
        } else if(n==1){
            x=player.getLocation().x;
            y=player.getLocation().y++;
            if(dunia [x][y] instanceof Lantai){
                res=true;
            } else if(dunia [x][y] instanceof Barrier){
                res=false;
            }
        } else if(n==2){
            x=player.getLocation().x--;
            y=player.getLocation().y;
            if(dunia [x][y] instanceof Lantai){
                res= true;
            } else if(dunia [x][y] instanceof Barrier){
                res= false;
            }
        } else {
            x=player.getLocation().x++;
            y=player.getLocation().y;
            if(dunia [x][y] instanceof Lantai){
                res=true;
            } else if(dunia [x][y] instanceof Barrier){
                res= false;
            }
        }
        return res;
    }

    public void move(int n) {
        if(verifyMove(n)){
            player.move(n);
        }
        System.out.println(player.getLocation().x+ ", "+ player.getLocation().y);
    }
}
