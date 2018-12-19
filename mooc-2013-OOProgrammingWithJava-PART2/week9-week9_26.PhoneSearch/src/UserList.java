
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

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
public class UserList {
    private HashMap<String,Person> map;
    private Scanner reader;
    public UserList(Scanner reader) {
        this.reader = reader;
        this.map = new HashMap<String,Person>();
    }
    
    
    public void addNumber(String name, String numb){
        if(this.map.containsKey(name)){
           this.map.get(name).addNumb(numb);
        }else{
           this.map.put(name, new Person(name,numb));
        }
    }
    
//    public void addAddress(String name, String street, String city){
//        if(this.map.containsKey(name)){
//            //this.map.get(name).addAddress(String street, String city);
//        }else{
//            //this.map.put(name, new Address())
//        }
//    }
    public void addNumber(){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String numb = reader.nextLine();
        
        if(!this.map.containsKey(name)){
            this.map.put(name, new Person(name,numb));
        }else{
            this.map.get(name).addNumb(numb);
        }
    }
    public void searchByNameGetPerson(){
        System.out.print("whose number: ");
        String name = reader.nextLine();
        if (this.map.containsKey(name)) {
            ArrayList<String> numbs = this.map.get(name).getNumbers();
            for (String numb : numbs) {
                System.out.println(" "+numb);
            }
        }else{
            System.out.println("  not found");
        }
        
    }
    
    public void searchByNumberGetName(){
        System.out.print("number: ");
        String numb = reader.nextLine();
        String nameRet = " not found";
        for (String key : this.map.keySet()) {
            ArrayList<String> numberList = this.map.get(key).getNumbers();
            if(numberList.contains(numb)){
                nameRet = " "+key;
                
            }
        }
        System.out.println(nameRet); 
    }
    public void addAddress(){
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print("street: ");
        String street = reader.nextLine();
        System.out.print("city: ");
        String city = reader.nextLine();
        if(this.map.containsKey(name)){
            this.map.get(name).addAddress(street, city);
        }else{
            this.map.put(name, new Person(name,street,city));
        }
    }
    public void searchByNameGetAll(){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        if (this.map.containsKey(name)) {
            String addOut = this.map.get(name).getAddress().toString();
            if(addOut.contains("null")){
                addOut = "  address unknown";
            }
            System.out.println("  address: "+addOut);
            if(this.map.get(name).getNumbers().size() > 0){
                System.out.println("  phone numbers:");
                ArrayList<String> numbs = this.map.get(name).getNumbers();
                for (String numb : numbs) {
                    System.out.println("   "+numb);
                }
            
            }else{
                System.out.println("  phone number not found");
            }
            
        }else{
            System.out.println("  not found");
        }  
    }
    public void removeInfo(){
        System.out.print("whose information: ");
        String name = reader.nextLine();
        if(this.map.containsKey(name)){
            this.map.remove(name);
        }
    }
    
    public void getFiltered(){
        System.out.print("keyword (if empty, all listed): ");
        String word = reader.nextLine();
        ArrayList<Person> list = new ArrayList<Person>();
        for (String item : this.map.keySet()) {
            if(this.map.get(item).containsWord(word)){
                list.add(this.map.get(item));
            }
        }
        if(list.isEmpty()){
            System.out.println(" keyword not found");
        }else{
            Collections.sort(list);
            for (Person person : list) {
                System.out.println("");
                System.out.println(" "+person.getName());
                String addr = person.getAddress().toString();
                if(addr.contains("null")){
                   addr = "  address unknown";
                }
                System.out.println("  address: "+addr);
                if(person.getNumbers().size() <= 0){
                    System.out.println("  phone number not found");
                }else{
                    System.out.println("  phone numbers:");
                    for (String number : person.getNumbers()) {
                        System.out.println("   "+number);
                    }
                }
            }
        }
    }
    
}
