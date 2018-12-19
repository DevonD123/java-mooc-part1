/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Devon
 */
public class Cow implements Milkable, Alive{
    private double udderCap;
    private double cur;
    private String name;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(String name) {
        this.name = name;
        Random rand = new Random();
        this.udderCap = (double)(15 + (rand.nextDouble()*25));
        this.cur = 0;
    }
    public Cow(){
        this(Cow.NAMES[new Random().nextInt(31)]);
    }
    
    public String getName(){
        return this.name;
    }
    public double getCapacity(){
        return this.udderCap;
    }
    public double getAmount(){
        return this.cur;
    }
    @Override
    public String toString(){
        return this.name +" "+Math.ceil(this.cur)+"/"+Math.ceil(this.udderCap);
    }

    @Override
    public double milk() {
        double milk = this.cur;
        this.cur = 0;
       return milk;
    }

    @Override
    public void liveHour() {
        //TODO recheck math
        double val = .7 + (new Random().nextDouble() *.6);
        if(this.cur + val <= this.udderCap){
            this.cur += val;
        }else{
            this.cur = this.udderCap;
        }
    }
    
}
