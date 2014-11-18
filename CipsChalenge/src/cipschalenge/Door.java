package cipschalenge;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Yohan
 */
public class Door extends Lantai {
    public int x,y,color;
    
    public Door(int x, int y )
    {
        super (x,y);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
  
            
            
}
   