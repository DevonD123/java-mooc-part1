/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;

/**
 *
 * @author Devon
 */
public class Group implements Movable{
   private ArrayList<Movable> moveList; 

    public Group() {
        this.moveList = new ArrayList<Movable>();
    }
    public void addToGroup(Movable m){
        this.moveList.add(m);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable m : moveList) {
            m.move(dx, dy);
        }
    }
    @Override
    public String toString(){
        String output ="";
        for (Movable item : moveList) {
            output += item.toString() +"\n";
        }
        return output;
    }
    
}
