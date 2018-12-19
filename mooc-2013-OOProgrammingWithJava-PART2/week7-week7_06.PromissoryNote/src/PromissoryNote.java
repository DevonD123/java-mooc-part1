/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.HashMap;
public class PromissoryNote {
    private HashMap<String, Double> myHash;
    public PromissoryNote() {
        this.myHash = new HashMap<String,Double>();
    }
    public void setLoan(String toWhome, double value){
        this.myHash.put(toWhome,value);
    }
    public double howMuchIsTheDebt(String whose){
        if(this.myHash.containsKey(whose)){
            return this.myHash.get(whose);
        }
        return 0.0;
    }
}
