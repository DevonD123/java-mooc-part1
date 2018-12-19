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
public class BirdList {
    private ArrayList<Bird> list;

    public BirdList() {
        this.list = new ArrayList<Bird>();
    }
    
    public void add(String name, String latin){
        if(!this.exists(name)){
            this.list.add(new Bird(name,latin));
        }
    }
    public void obs(String name){
        for (Bird bird : this.list) {
            if(bird.getName().equals(name)){
                bird.observed();
            }
        }
    }
    public boolean exists(String name){
        for (Bird bird : this.list) {
            if(bird.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    public void print(String name){
        for (Bird bird : this.list) {
            if(bird.getName().equals(name)){
                System.out.println(bird);
            }
        }
    }
    public void print(){
        for (Bird bird : list) {
            System.out.println(bird);
        }
    }
    
    
    
}
