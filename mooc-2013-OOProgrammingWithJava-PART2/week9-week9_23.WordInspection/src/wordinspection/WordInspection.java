/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Devon
 */
public class WordInspection {
    private File file;

    public WordInspection(File file) {
        this.file = file;
    }
    
    public int wordCount() throws Exception{
    //only 1 word per row
        Scanner reader = new Scanner(this.file,"UTF-8");
        int wordCount = 0;
        while(reader.hasNext()){
            reader.nextLine();
            wordCount ++;
        }
        return wordCount;
    }
    public List<String> wordsContainingZ() throws Exception{
        Scanner reader = new Scanner(this.file,"UTF-8");
        ArrayList<String> words = new ArrayList<String>();
        while(reader.hasNext()){
            String word = reader.nextLine();
            if(word.contains("z")){
                words.add(word);
            }
            
        }
        return words;
    
    }
    public List<String> wordsEndingInL() throws Exception{
         Scanner reader = new Scanner(this.file,"UTF-8");
        ArrayList<String> words = new ArrayList<String>();
        while(reader.hasNext()){
            String word = reader.nextLine();
            if(word.charAt(word.length()-1) == 'l' ){
                words.add(word);
            }
            
        }
        return words;
    }
    public List<String> palindromes() throws Exception{
        Scanner reader = new Scanner(this.file,"UTF-8");
        ArrayList<String> words = new ArrayList<String>();
        while(reader.hasNext()){
            String word = reader.nextLine();
            String compWord = "";
            for (int i = word.length()-1; i >= 0; i--) {
                compWord += word.charAt(i);
            }
            if(word.equals(compWord)){
                words.add(word);
            }
            
        }
        return words;
    }
    public List<String> wordsWhichContainAllVowels() throws Exception{
        Scanner reader = new Scanner(this.file,"UTF-8");
        ArrayList<String> words = new ArrayList<String>();
        while(reader.hasNext()){
            String word = reader.nextLine();
            boolean doesContain = true;
            char[] vowels = new char[]{'a','e','i','o','u','y','ä','ö'};
            for (char vowel : vowels) {
                if(word.indexOf(vowel) == -1){
                    doesContain = false;
                }
            }
            if(doesContain){
                words.add(word);
            }
            
        }
        return words;
    }
}
