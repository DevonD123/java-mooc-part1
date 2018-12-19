/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.ArrayList;
import java.util.Collections;
public class PlayerList {
    private ArrayList<Skier> list;

    public PlayerList() {
        this.list = new ArrayList<Skier>();
    }
    
    
    public void addPlayer(String name){
        //make new ski and add
            this.list.add(new Skier(name));
    }
    public void getPoints(){
        Collections.sort(this.list);
        for (int i = 0; i<this.list.size(); i++) {
             System.out.println("  "+(i+1) +". "+this.list.get(i));
        }
    }
    public void roundStart(){
        for (Skier skier : this.list) {
            skier.addJump();
        }
    }
    public void getFinal(){
        Collections.sort(this.list,new RevComp());
        for (int i = 0; i<this.list.size(); i++) {
            System.out.println((i+1)+"           "+this.list.get(i));
            System.out.println("            jump lengths: "+this.list.get(i).getDists());
        }
    }

}
