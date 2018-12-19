/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Devon
 */
public class Packer {
   private int boxVol;

    public Packer(int boxVol) {
        this.boxVol = boxVol;
    }
   public List<Box> packThings(List<Thing> things){
       List<Box> boxes = new ArrayList<Box>();
       for (int i = 0; i < 2; i++) {
           Box b = new Box(boxVol);
           boxes.add(b);
       }
       for (Thing thing : things) {
           addToBox(boxes,thing);
       }
       return boxes;
   }
   private void addToBox(List<Box> list, Thing thing){
       for (int j = 0; j < list.size(); j++) {
           if(list.get(j).addThing(thing)){
               break;
           }
        }
   }
   
}
