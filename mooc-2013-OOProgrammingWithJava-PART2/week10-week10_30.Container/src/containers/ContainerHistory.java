/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Devon
 */
public class ContainerHistory{
    private List<Double> list;
    public ContainerHistory() {
        this.list = new ArrayList<Double>();
    }  
    public void add(double val){
        this.list.add(val);
    }
    public void reset(){
        this.list.clear();
    }
    public double maxValue(){
        double max = 0;
        for (Double val : list) {
             if(val > max){
                 max = val;
             }
        }
        return max;
    }
    public double minValue(){
        double min = Double.MAX_VALUE;
        for (Double val : list) {
             if(val < min){
                 min = val;
             }
        }
        if(min == Double.MAX_VALUE){
            min = 0;
        }
        return min;
    }
    public double average(){
        double sum = 0;
        if(this.list.size() >= 1){
                for (Double val : list) {
                sum += val;
            }
            sum = sum/this.list.size();
        }
        return sum;
    }
    public double greatestFluctuation() {
        if(this.list.size() <= 1){
            return 0;
        }
        double fluctuation = 0;
        for (int i = 0; i < this.list.size()-1; i++) {
            double curFluc = Math.abs(this.list.get(i)-this.list.get(i+1));
            if(curFluc > fluctuation){
                fluctuation = curFluc;
            }
        }
        return fluctuation;
    }
    public double variance(){
        //unsure of sample variance calc
        if(this.list.size() <= 1){
            return 0;
        }
        double sum = 0.0;
        for (Double val : list) {
            sum += val;
        }
        double avg = sum/(double)this.list.size();
        double t1 = 0.0;
        
        for (Double v2 : list) {
            double vals = v2 - avg;
            t1 += vals * vals;
        }
        return t1/((double)this.list.size() -1);
        
    }
    
    @Override
    public String toString(){
        return this.list.toString();
    }
    
}
