/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Devon
 */
public class Employees {
    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<Person>();
    }
    
    public void add(Person p){
        this.list.add(p);
    }
    public void add(List<Person> p){
        for (Person person : p) {
            this.list.add(person);            
        }
    }
    //required to use an itterator
    public void print(){
        Iterator<Person> ppl = this.list.iterator();
        while(ppl.hasNext()){
            System.out.println(ppl.next());
        }
    }
    public void print(Education education){
        Iterator<Person> ppl = this.list.iterator();
        while(ppl.hasNext()){
            Person p = ppl.next();
            if(p.getEducation().equals(education)){
                System.out.println(p);
            }
        }      
    }
    public void fire(Education education){
        Iterator<Person> ppl = this.list.iterator();
        while(ppl.hasNext()){
            Person p = ppl.next();
            if(p.getEducation().equals(education)){
                ppl.remove();
            }
        }
    }
    
}
