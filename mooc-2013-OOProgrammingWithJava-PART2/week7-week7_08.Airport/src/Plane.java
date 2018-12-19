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
public class Plane {
    private int cap;
    private String id;
    private ArrayList<Flight> list;
    //constructors
    public Plane(int cap,String id,ArrayList<Flight> flights) {
        this.cap = cap;
        this.list = flights;
        this.id = id;
    }
    public Plane(int cap, String id) {
        this.cap = cap;
        this.id = id;
        this.list = new ArrayList<Flight>();
    }
    
    //getters
    public String getId(){
        return this.id;
    }
    public int getCap(){
        return this.cap;
    }
    public ArrayList<Flight> getFLights(){
        return this.list;
    }
    
    //setters
    public void addFlight(Flight flight){
        this.list.add(flight);
    }
    
    //auto print
    public String toString(){
        return this.id + " ("+this.cap+" ppl)";
    }
    
}
