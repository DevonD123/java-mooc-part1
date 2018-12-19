/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.ArrayList;

/**
 *
 * @author Devon
 */
public class AtLeastOne implements Criterion{
    private ArrayList<Criterion> list;

    public AtLeastOne(Criterion... cs) {
        this.list = new ArrayList<Criterion>();
        for (Criterion c : cs) {
            this.list.add(c);
        }
    }
    @Override
    public boolean complies(String line) {
        for (Criterion c : list) {
            if(c.complies(line)){
                return true;
            }
        }
        return false;
    }
    
}
