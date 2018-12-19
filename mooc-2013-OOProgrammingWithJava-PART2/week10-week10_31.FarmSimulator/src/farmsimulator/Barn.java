/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Devon
 */
public class Barn {
    private BulkTank barnTank;
    private MilkingRobot robot;
    public Barn(BulkTank barnTank) {
        this.barnTank = barnTank;
        this.robot = new MilkingRobot();
    }
    public BulkTank getBulkTank(){
        return this.barnTank;
    }
    public MilkingRobot robot(){
        return this.robot;
    }
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        this.robot.setBulkTank(this.barnTank);
    }
    public void takeCareOf(Cow cow){
        if(this.robot == null){ 
            throw new IllegalArgumentException("milking robot not installed");
        }

            this.robot.milk(cow);

    }
    public void takeCareOf(Collection<Cow> cows){
        if(this.robot == null){ 
            throw new IllegalArgumentException("milking robot not installed");
        }
        for (Cow cow : cows) {
            this.robot.milk(cow);
        }
    }
    @Override
    public String toString(){
        return "Barn: "+this.barnTank;
    }
}
