/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Devon
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private List<Thing> list;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<Thing>();
    }
    public void add(Thing item){
        if(this.totalWeight()+item.getWeight() <= this.maxWeight){
            this.list.add(item);
        }
    }
    private int totalWeight(){
        int sum = 0;
        for (Thing thing : list) {
            sum += thing.getWeight();
        }
        return sum;
    }
    public boolean isInTheBox(Thing item){
        return this.list.contains(item);
    }
}
