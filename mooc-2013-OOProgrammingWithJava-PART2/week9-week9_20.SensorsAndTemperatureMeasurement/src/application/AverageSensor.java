/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Devon
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensorList;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensorList = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
    
    private boolean allOn(){
        for (Sensor sensor : sensorList) {
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    
    }
    public void addSensor(Sensor additional){
        this.sensorList.add(additional);
    }
    @Override
    public boolean isOn() {
        return this.allOn();
    }

    @Override
    public void on() {
        for (Sensor sensor : sensorList) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensorList) {
            sensor.off();
        }
    }
    

    @Override
    public int measure() {
        //could optimize but no need
        if(this.sensorList.size() <= 0 || !this.allOn()){
            throw new IllegalStateException();
        }
        int sum = 0;
        for (Sensor sensor : sensorList) {
            sum += sensor.measure();
        }
        int avg = sum/sensorList.size();
        this.readings.add(avg);
        return avg;
    }

    
}
