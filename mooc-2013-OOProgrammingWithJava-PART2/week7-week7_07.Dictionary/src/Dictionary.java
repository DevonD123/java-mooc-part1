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
import java.util.ArrayList;
public class Dictionary {
    private HashMap<String,String> map;

    public Dictionary() {
        this.map = new HashMap<String,String>();
    }
    public void add(String fn,String en){
        this.map.put(fn,en);
    }
    public String translate(String word){
//        if(this.map.containsKey(word)){
            return this.map.get(word);
//        }
//        return null;
    }
    public int amountOfWords(){
        return this.map.size();
    }
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        for(String key :this.map.keySet()){
            list.add(key+" = "+this.map.get(key));
        }
        return list;
    }
    
    
    
}
