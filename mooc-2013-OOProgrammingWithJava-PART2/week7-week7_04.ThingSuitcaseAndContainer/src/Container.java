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
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> list;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase sCase){
        if(totalWeight() + sCase.totalWeight() <= this.maxWeight){
            this.list.add(sCase);
        } 
    }
    
    public String toString(){
        return this.list.size() + " suitcases ("+totalWeight()+" kg)";
    }
    private int totalWeight(){
        int tWeight = 0;
        for (Suitcase sCase : list) {
            tWeight += sCase.totalWeight();
        }
        return tWeight;
    }
    public void printThings(){
        for (Suitcase suitcase : list) {
            suitcase.printThings();
        }
    }
}
