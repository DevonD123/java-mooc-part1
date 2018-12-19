/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Devon
 */
public class MindfulDictionary {
    private ArrayList<Words> list;
    private String file;

    public MindfulDictionary() {
        this.list = new ArrayList<Words>();
    }
    public MindfulDictionary(String file){
        this();
        this.file = file;
    }
    public boolean load(){
        try{
            File f = new File(this.file);
            Scanner reader = new Scanner(f);
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] arr = line.split(":");
                this.add(arr[0],arr[1]);
            }
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public void add(String word, String translation){
        this.list.add(new Words(word,translation));
    }
    
    public String translate(String word){
        for (Words words : list) {
            if(words.translate(word) != null && !(words.translate(word).isEmpty())){
                return words.translate(word);
            }
        }
        return null;
    }
    public void remove(String word){
        for (int i = 0; i < this.list.size(); i++) {
           String wordBack = this.list.get(i).translate(word);
           if(wordBack != null && wordBack.length() >= 1){
               this.list.remove(i);
           }
        }
    }
    public boolean save(){
        try{
            FileWriter  f = new FileWriter(this.file);
            for (Words words : list) {
                f.write(words.toString()+"\n");
            }
            f.close();
            return true;
        }catch(Exception e){
            return false;
        }
                
    }
    
}
