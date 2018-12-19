/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.Comparator;
public class RevComp implements Comparator<Skier>{

    @Override
    public int compare(Skier o1, Skier o2) {
        return o2.getTotal() - o1.getTotal();
    }
    
}
