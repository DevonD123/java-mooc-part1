/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Devon
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private int doup;
    private Set<String> list;

    public PersonalDuplicateRemover() {
        this.doup = 0;
        this.list = new HashSet<String>();
    }
    
    @Override
    public void add(String characterString) {
        if(this.list.contains(characterString)){
            this.doup ++;
        }else{
            this.list.add(characterString);    
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.doup;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.list;
    }

    @Override
    public void empty() {
       this.list.clear();
       this.doup = 0;
    }
    
}
