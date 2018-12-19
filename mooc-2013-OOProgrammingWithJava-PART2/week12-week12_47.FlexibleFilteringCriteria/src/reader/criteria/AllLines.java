/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Devon
 */
public class AllLines implements Criterion{
    private String hasThis;

    public AllLines() {
        this("");
    }

    public AllLines(String hasThis) {
        this.hasThis = hasThis;
    }
    @Override
    public boolean complies(String line) {
        if(line.contains(this.hasThis)){
            return true;
        }
        return false;
    }
    
}
