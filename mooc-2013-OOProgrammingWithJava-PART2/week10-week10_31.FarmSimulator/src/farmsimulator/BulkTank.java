/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Devon
 */
public class BulkTank {
    private double capacity;
    private double volume;
    
    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0.0;
    }

    public BulkTank() {
        this(2000.0);
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    public double getVolume(){
        return this.volume;
    }
    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }
    public void addToTank(double amount) {
        if(this.volume + amount < this.capacity){
            this.volume = this.volume + amount;
        }else{
            this.volume = this.capacity;
        }
    }
    public double getFromTank(double amount){
        if(this.volume < amount){
            double milk = this.volume;
            this.volume = 0.0;
            return milk;
        }
        this.volume -= amount;
        return amount;
        
    }
    @Override
    public String toString(){
        return Math.ceil(this.volume)+"/"+Math.ceil(this.capacity);
    }
    
}
