/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.*;
public class Storehouse {
    private Map<String,Integer> map;
    private Map<String,Integer> stockMap;
    public Storehouse() {
        this.map = new HashMap<String,Integer>();
        this.stockMap = new HashMap<String,Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        if(!this.map.containsKey(product)){
            this.map.put(product, price);
        }
        if(!this.stockMap.containsKey(product)){
            this.stockMap.put(product,stock);
        }
    
    }
    public int price(String product){
        if(this.map.containsKey(product)){
          return this.map.get(product);
        }
        return -99; //if not available
    }
    public int stock(String product){
        if(this.stockMap.containsKey(product)){
          return this.stockMap.get(product);
        }
        return 0; //if not available
    }
    public boolean take(String product){
        if(this.stockMap.containsKey(product) && this.stockMap.get(product) -1 >= 0){
                int stock = this.stockMap.get(product) - 1;
                this.stockMap.put(product, stock);
                return true;
        }
        return false;
    }
    public Set<String> products(){
        return this.map.keySet();
    }
}
