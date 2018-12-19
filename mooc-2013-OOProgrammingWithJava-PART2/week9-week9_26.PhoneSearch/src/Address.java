/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class Address {
    private String street;
    private String city;

    public Address(String Street, String city) {
        this.street = Street;
        this.city = city;
    }
    public Address(){}
    public void addAddress(String street,String city){
        this.street = street;
        this.city = city;
    }
    public void addStreet(String street){
        this.street = street;
    }
    public void addCity(String city){
        this.city = city;
    }
    @Override
    public String toString(){
        return this.street +" " + this.city;
    }
    
    
}
