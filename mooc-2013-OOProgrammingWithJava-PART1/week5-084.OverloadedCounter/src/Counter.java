/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class Counter {
    private boolean checkOn;
    private int count;
    
    //constructors
    public Counter(int count, boolean checkOn){
        this.checkOn = checkOn;
        this.count = count;
    }
    public Counter(int count){
        this(count,false); //runs constructor
    }
    public Counter(boolean checkOn){
        this(0,checkOn);
    }
    public Counter(){
        this(0,false);
    }
    
    //methods
    public int value(){
        return this.count;
    }
    public void increase(int val){
        if(val >= 1){
            this.count += val;
        }
    }
    public void increase(){
        this.count ++; //could call the other function but this should be faster by .0001 ms 
    }
    public void decrease(int val){
        if(val >= 1){
            if(this.checkOn){
                if(this.count - val >= 0){
                    this.count -= val;
                }else{
                //set to 0 if it would go into negative
                    this.count = 0;
                }
            }else{
                this.count -= val;
            }
        }
    }
    public void decrease(){
        this.decrease(1);
    }
}
