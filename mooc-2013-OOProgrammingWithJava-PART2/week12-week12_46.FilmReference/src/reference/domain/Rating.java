/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author Devon
 */
public enum Rating {
    BAD(-5), 
    MEDIOCRE(-3),
    NOT_WATCHED(0),
    NEUTRAL(1),
    FINE(3),
    GOOD(5);
    //er 3 -3: 0
    //gone -5 3: -2
    //madison 5 -3: 0
    private int rating;
    
    private Rating(int rating){
        this.rating = rating;
    }
    public int getValue(){
        return this.rating;
    }
    
}
