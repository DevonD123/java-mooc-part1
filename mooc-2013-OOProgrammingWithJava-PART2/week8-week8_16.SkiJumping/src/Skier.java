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
import java.util.Random;
public class Skier implements Comparable<Skier>{
    private String name;
    private ArrayList<Jump> jumps;
    private Random rand;
    public Skier(String name) {
        this.name = name;
        this.jumps = new ArrayList<Jump>();
        this.rand = new Random();
    }
    public String getName(){
        return this.name;
    }
    //adds, creats and prints results
    public void addJump(){
        int distance = this.distance();
        ArrayList<Integer> scores = this.judge();
        Jump jmp = new Jump(scores,distance);
        this.jumps.add(jmp);
        System.out.println("  "+this.name);
        jmp.printJump();
        
    }
    private ArrayList<Integer> judge(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(this.rand.nextInt(10)+10);
        }
        return list;
    }
    private int distance(){
        return this.rand.nextInt(60)+60;
    }
    public void lastDist(){
        this.jumps.get(this.jumps.size()-1).getDistance();
    }
    public int getTotal(){
        int sum = 0;
        for (Jump jump : jumps) {
            sum += jump.getScore();
        }
        return sum;
    }
    public String getDists(){
        String jumpsString = "";
        for (int i = 0; i < this.jumps.size();i++) {
            jumpsString += String.valueOf(this.jumps.get(i).getDistance());
            jumpsString += " m";
            if(i < this.jumps.size()-1){
                jumpsString += ",";
            }
            jumpsString +=" ";
        }
        return jumpsString;
    }
    @Override
    public String toString(){
        return this.name+" ("+this.getTotal()+" points)";
    }
    @Override
    public int compareTo(Skier skier){
        return this.getTotal() - skier.getTotal();
    }
    
}
