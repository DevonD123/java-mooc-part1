/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

/**
 *
 * @author Devon
 */
public class PersonComparator implements Comparator<Person>{
    private Map<Person,Integer> list;

    public PersonComparator(Map<Person, Integer> list) {
        this.list = list;
    }


    @Override
    public int compare(Person o1, Person o2) {
        return this.list.get(o2)-this.list.get(o1);
    }
    
}
