/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class Bird {
    private String name;
    private String latin;
    private int observed;

    public Bird(String name,String latin) {
        this.name= name;
        this.latin = latin;
        this.observed = 0;
    }
    
    public String getName(){
        return this.name;
    }
    public String getLatin(){
        return this.latin;
    }
    public int getObs(){
        return this.observed;
    }
    
    public void observed(){
        this.observed ++;
    }
    public String toString(){
        return this.name + " ("+this.latin+"): "+this.observed+" observations";
    }
}
