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
public class Box implements ToBeStored{
    private ArrayList<ToBeStored> list;
    private double maxWeight;

    public Box( double maxWeight) {
        this.list = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    public void add(ToBeStored item){
        double tWeight = this.totalWeight();
        if(tWeight + item.weight() <= this.maxWeight){
            this.list.add(item);
        }
    }
    //so this can also be stored using the interface
    public double weight(){
        return this.totalWeight();
    }
    @Override
    public String toString(){
        double tWeight = this.totalWeight();
        int items = this.list.size();
        return "Box: "+items+" things, total weight "+tWeight+" kg";
    }
    private double totalWeight(){
        double tWeight = 0.0;
        for (ToBeStored toBeStored : list) {
            tWeight += toBeStored.weight();
        }
        return tWeight;
    }
    
}
