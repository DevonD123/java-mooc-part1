/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Devon
 */
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory hist;
    public ProductContainerRecorder(String productName, double tilavuus, double initialVolume) {
        super(productName, tilavuus);
        this.hist = new ContainerHistory();
        this.hist.add(initialVolume);
        super.addVol(initialVolume);
    }
    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+this.hist.toString());
        System.out.println("Greatest product amount: "+this.hist.maxValue());
        System.out.println("Smallest product amount: "+this.hist.minValue());
        System.out.println("Average: "+this.hist.average());
        System.out.println("Greatest change: "+this.hist.greatestFluctuation());
        System.out.println("Variance: "+this.hist.variance());
    }
    public String history(){
        return this.hist.toString();
    }
    @Override
    public double takeFromTheContainer(double amount) {
        double vol = super.getVolume();
        if(vol < amount){
            return vol;
        }
        double minus = super.takeFromTheContainer(amount);
        double vol2 = super.getVolume();
        this.addVol(vol2);
        this.hist.add(vol2);
        return vol2;
    }
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        double tV = super.getVolume();
        System.out.println("volume added: "+tV);
        this.hist.add(tV);
    }
//    @Override
//    public String toString(){
//        return super.getName() +": volume = "+ initialVolume+", free space "initial;
//    }
}
