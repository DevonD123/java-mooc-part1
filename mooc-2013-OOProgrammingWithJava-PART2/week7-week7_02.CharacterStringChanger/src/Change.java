/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class Change {
    private char fromCharacter;
    private char toCharacter;
    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    public String change(String charString){
        String output = "";
        for (int i = 0; i < charString.length(); i++) {
            char currentChar = charString.charAt(i);
            if(currentChar == this.fromCharacter){
                output += this.toCharacter;
            }else{
                output += currentChar;
            }   
            
        }
        return output;
    }
           
}
