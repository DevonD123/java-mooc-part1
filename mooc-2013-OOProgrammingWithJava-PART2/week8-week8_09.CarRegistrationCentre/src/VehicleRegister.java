/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegister {
    private HashMap<RegistrationPlate,String> map;
    public VehicleRegister() {
        this.map = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if(this.map.get(plate) == null){
            this.map.put(plate, owner);
            return true;
        }
        return false;
    }
    public String get(RegistrationPlate plate){
        return this.map.get(plate);
    }
    public boolean delete(RegistrationPlate plate){
        if(this.map.get(plate) != null){
            this.map.remove(plate);
            return true;
        }
        return false;
    }
    public void printRegistrationPlates(){
        for (RegistrationPlate registrationPlate : this.map.keySet()) {
            System.out.println(registrationPlate);
        }
    }
    public void printOwners(){
        ArrayList<String> vals = new ArrayList<String>();
        for (String value : this.map.values()) {
            if(!vals.contains(value)){
                vals.add(value);
                System.out.println(value);
            }
        }
    }
}
