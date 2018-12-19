/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Devon
 */
import java.util.Random;
public class Thermometer implements Sensor {
    private Random rand;
    private boolean on;
    public Thermometer() {
        this.on = false;
        this.rand = new Random();
    }
    
    public int measure() {
        if(!this.on){
            throw new IllegalStateException();
        }
        int val = this.rand.nextInt(31);
        if(rand.nextBoolean() && val > 0){
            val *= -1;
        }
        return val;
    }
    public boolean isOn(){
        return this.on;
    }
    public void on(){
        this.on = true;
    }
    public void off() {
        this.on = false;
    }
    
    
    
}
