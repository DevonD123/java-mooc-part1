
import java.util.ArrayList;

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
public class Person  implements Comparable<Person>{
    private String name;
    private ArrayList<String> numbers;
    private Address address;

    public Person(String name, String numb) {
        this.name = name;
        this.numbers = new ArrayList<String>();
        this.numbers.add(numb);
        this.address = new Address();
    }
    public Person(String name, String street, String city){
        this.name = name;
        this.numbers = new ArrayList<String>();
        this.address = new Address(street,city);
    }
    public void addAddress(String street, String city){
        this.address.addAddress(street, city);
    }
    public void addNumb(String numb){
        if(!this.numbers.contains(numb)){
            this.numbers.add(numb);
        }
    }
    public boolean containsWord(String word){
        if(this.address.toString().contains(word)){
            return true;
        }
        if(this.name.contains(word)){
            return true;
        }
        if(this.numbers.contains(word)){
            return true;
        }  
        return false;
    }
    public ArrayList<String> getNumbers(){
        return this.numbers;
    }
    public Address getAddress(){
        return this.address;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public int compareTo(Person p){
        return this.name.compareTo(p.name);
    }
}
