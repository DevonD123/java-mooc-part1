/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Devon
 */
public class MilkingRobot {
    private BulkTank tank;

    public MilkingRobot() {
        this.tank = null;
    }
    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }
    public BulkTank getBulkTank(){
        return this.tank;
    }
    public void milk(Milkable milkme){
        if(this.tank == null){
            throw new IllegalStateException();
        }
        double milkVol = milkme.milk();
        this.tank.addToTank(milkVol);
    }
    
}
