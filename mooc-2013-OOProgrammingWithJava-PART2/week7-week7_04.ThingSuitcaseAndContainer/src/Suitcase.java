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
public class Suitcase {
    private int weightLimit;
    private ArrayList<Thing> list;
    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.list = new ArrayList<Thing>();
    }
    public void addThing(Thing newThing){
        if(totalWeight()+ newThing.getWeight() <= this.weightLimit){
            this.list.add(newThing);
        }
    }
    public String toString(){
        String myStr = "";
        int numb = this.list.size();
        if(numb == 0){
            myStr = "empty";
        }else if(numb > 1){
            myStr = numb +" things";
        }else{
            myStr = numb +" thing";
        }
        return myStr+" ("+totalWeight()+" kg)";
    }
    public int totalWeight(){
        int weightT = 0;
        for (Thing thing : list) {
            weightT += thing.getWeight();
        }
        return weightT;
    }
    public void printThings(){
        for (Thing thing : list) {
            System.out.println(thing);
        }
    }
    public Thing heaviestThing(){
        int curHeav = Integer.MIN_VALUE;
        Thing curThing = new Thing();
        for (Thing thing : list) {
            int w = thing.getWeight();
            if( w > curHeav){
                curHeav = w;
                curThing = thing;
            }
        }
        if(curHeav >= 1){
            return curThing;
        }else{
            return null;
        }
        
    }
}
