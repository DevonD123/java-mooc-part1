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
public class ConstantSensor implements Sensor{
    private boolean on;
    private final int val;

    public ConstantSensor(int val) {
        this.val = val;
        this.on = true;
    }
    
    
    public int measure() {
        return this.val;
    }
    public boolean isOn(){
        return this.on;
    }
    public void on(){
        this.on = true;
    }
    public void off() {
        //this.on = false;
    }
    public int getValue(){
        return this.val;
    }
    
}
