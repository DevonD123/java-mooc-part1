/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Devon
 */
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private Collection<Cow> herd;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.herd = new ArrayList<Cow>();
    }
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
    public void addCow(Cow cow){
        this.herd.add(cow);
    }
    public String getOwner(){
        return this.owner;
    }
    public void manageCows() throws Exception{
        if(this.barn.robot() == null){
            throw new IllegalAccessException("milking robot not installed");
        }
        this.barn.takeCareOf(this.herd);
    }
    @Override
    public void liveHour() {
        for (Cow cow : herd) {
            cow.liveHour();
        }
    }
    @Override
    public String toString(){
        String animals = "";
        if(this.herd == null || this.herd.size() <= 1){
            animals = "No cows.";
        }else{
            String newString = "Animals:\n";
            for (Cow cow : herd) {
                newString += "        "+cow.toString()+"\n";
            }
            animals = newString;
        }
        
        return "Farm ownser: "+this.owner+"\n"+this.barn+"\n"+animals;
    }
    
}
