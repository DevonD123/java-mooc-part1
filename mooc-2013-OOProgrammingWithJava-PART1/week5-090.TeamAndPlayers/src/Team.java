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
public class Team {
    private String name;
    private ArrayList<Player> list;
    private int maxSize;
    public Team(String name) {
        this.name= name;
        this.list = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName(){
        return this.name;
    }
    public void addPlayer(Player player){
        if(this.list.size() < this.maxSize){
            this.list.add(player);
        } 
    }

    public void printPlayers(){
        for (Player player : this.list) {
            System.out.println(player);
        }
    }
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    public int size(){
        return this.list.size();
    }
    public int goals(){
        int sum = 0;
        for (Player player : list) {
            sum += player.goals();
        }
        return sum;
    }
}
