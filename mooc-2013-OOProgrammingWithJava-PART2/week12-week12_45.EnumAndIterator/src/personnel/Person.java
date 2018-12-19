/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Devon
 */
public class Person {
    private Education edu;
    private String name;

    public Person(String name,Education edu) {
        this.edu = edu;
        this.name = name;
    }
    public Education getEducation(){
        return this.edu;
    }
    
    @Override
    public String toString(){
        return this.name+", "+this.edu;
    }
}
