/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.Scanner;
public class TextUserInterface {
    private Dictionary dict;
    private Scanner reader;
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.dict = dictionary;
        this.reader = reader;
    }
    public void start(){
        while(true){
            System.out.println("");
            System.out.print("Statment: ");
            String cmd = this.reader.nextLine();
            cmd = cmd.toLowerCase();
            if(cmd.equals("quit")){
                System.out.println("Cheers!");
                break;
            }else if(cmd.equals("add")){
                this.add();
            }else if(cmd.equals("translate")){
                this.translate();
            }else{
                System.out.println("Unknown statment");
            }
        }
        
    }
    public void add(){
        System.out.print("In Finnish: ");
        String fn = this.reader.nextLine();
        System.out.print("Translation: ");
        String en = this.reader.nextLine();
        this.dict.add(fn, en);
    }
    public void translate(){
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();
                
        System.out.println("Translation: "+ this.dict.translate(word));
    }
}
