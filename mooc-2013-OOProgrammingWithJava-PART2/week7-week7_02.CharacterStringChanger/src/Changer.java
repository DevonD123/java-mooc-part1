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
public class Changer {
    private ArrayList<Change> list;
    public Changer() {
        this.list = new ArrayList<Change>();
    }
    public void addChange(Change change){
        this.list.add(change);
    }
    public String change(String charcterString){
        String output = charcterString;
        for (Change chg : list) {
            output = chg.change(output);
        }
        return output;
    }
}
