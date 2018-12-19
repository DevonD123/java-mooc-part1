/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Devon
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String,Set<String>> set;

    public PersonalMultipleEntryDictionary() {
        this.set = new HashMap<String,Set<String>>();
    }
    
    @Override
    public void add(String word, String entry) {
        if(!this.set.containsKey(word)){
            this.set.put(word, new HashSet<String>());
        }
        this.set.get(word).add(entry);
        
    }

    @Override
    public Set<String> translate(String word) {
        return this.set.get(word);
    }

    @Override
    public void remove(String word) {
        if(this.set.containsKey(word)){
            this.set.remove(word);
        }
    }
    
}
