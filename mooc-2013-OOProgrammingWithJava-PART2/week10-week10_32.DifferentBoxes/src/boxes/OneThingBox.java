/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Devon
 */
public class OneThingBox extends Box{
    private Thing item;

    public OneThingBox() {
        this.item = null;
    }
    
    
    @Override
    public void add(Thing thing) {
        if(this.item == null){
            this.item = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.item != null){
            if(this.item.getName().equals(thing.getName())){
                return true;
            }
        }
        return false;
    }
    
}
