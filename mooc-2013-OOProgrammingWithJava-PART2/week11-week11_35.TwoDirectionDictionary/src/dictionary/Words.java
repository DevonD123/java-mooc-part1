/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Devon
 */
public class Words {
    private final String english;
    private final String finnish;

    public Words(String english, String finnish) {
        this.english = english;
        this.finnish = finnish;
    }
    public String translate(String input){
        if(this.english.equals(input)){
            return this.finnish;
        }
        if(this.finnish.equals(input)){
            return this.english;
        }
        return null;
    }
    @Override
    public String toString(){
        return this.finnish+":"+this.english;
    }
    
}
