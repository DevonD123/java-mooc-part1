
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    public BoundedCounter(int upperLimit, int initial) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = initial;
    }

    public void next() {
        // write code here
        if(this.value >= this.upperLimit){
            //set to 0
            this.value = 0;
        }else{
            this.value ++;
        }
    }
    public String toString() {
        // write code here
        if(this.value <= 9){
            return "0"+this.value;
        }
        return ""+this.value;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        if(value >= 0 && value <= this.upperLimit){
            this.value = value;
        }
    }

}
