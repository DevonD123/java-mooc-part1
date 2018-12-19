/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.Map;
import java.util.HashMap;
public class ShoppingBasket {
    private Map<String,Purchase> map;

    public ShoppingBasket() {
        this.map = new HashMap<String,Purchase>();
    }
    public void add(String product, int price){
        if(!this.map.containsKey(product)){
            this.map.put(product, new Purchase(product, price));
        }else{
            this.map.get(product).increaseAmount();
        }
    }
    public int price(){
        int sum = 0;
        for (Purchase value : this.map.values()) {
            sum += value.price();
        }
        return sum;
    }
    public void print(){
        for (Purchase p : this.map.values()) {
            System.out.println(p);
        }
    }
}
