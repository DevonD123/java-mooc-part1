/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.ArrayList;
public class Phonebook {
    private ArrayList<Person> list;
    public Phonebook(){
        this.list = new ArrayList<Person>();
    }
    public void add(String name, String number){
        this.list.add(new Person(name,number));
    }
    public void printAll(){
        for (Person person : this.list) {
            System.out.println(person);
        }
    }
    public String searchNumber(String name){
        String numb = "number not known";
        for (Person person : this.list) {
            if(person.getName().equals(name)){
                numb = person.getNumber();
            }
        }
        
        return numb;
    }
    
}
