
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class SortAgainstSuitAndValue implements Comparator<Card>{
    
    @Override
    public int compare(Card crd1,Card crd2){
        int suitVal = crd1.getSuit()-crd2.getSuit();
        if( suitVal == 0){
           return crd1.getValue() - crd2.getValue();
         
        }
        return suitVal;
    }
}
