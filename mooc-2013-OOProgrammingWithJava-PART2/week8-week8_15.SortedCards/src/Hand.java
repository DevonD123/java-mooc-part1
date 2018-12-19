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
import java.util.Collections;
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    public void print(){
        for (Card card : hand) {
            System.out.println(card);
        }
    }
    public void sort(){
       Collections.sort(this.hand);
        for (Card card : this.hand) {
            System.out.println(card);
        }
    }
    public int total(){
        int sum = 0;
        for (Card card : this.hand) {
            sum += card.getValue();
        }
        return sum;
    }
    public void sortAgainstSuit(){
        Collections.sort(this.hand, new SortAgainstSuit() );
    }
    public void SortAgainstSuitAndValue(){
        Collections.sort(this.hand, new SortAgainstSuit() );
    }
    @Override
    public int compareTo(Hand comp){
        return this.total() - comp.total();
    }
    
}
