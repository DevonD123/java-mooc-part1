/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Devon
 */
import java.util.ArrayList;
public class Box implements Thing{
    private int maxCapacity;
    private ArrayList<Thing> list;

    public Box(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.list = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if(this.totalCap() + thing.getVolume() <= this.maxCapacity){
            this.list.add(thing);
            return true;
        }
        return false;
    }
    private int totalCap(){
        int sum = 0;
        for (Thing thing : list) {
            sum += thing.getVolume();
        }
        return sum;
    }
    public int getVolume(){
        return this.totalCap();
    }
}
