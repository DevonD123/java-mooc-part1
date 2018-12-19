/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class LyyraCard {
    private double ballance;
    public LyyraCard(double initBal){
        this.ballance = initBal;
    }
    
    public String toString(){
        return "The card has "+this.ballance + " euros";
    }
    public void payEconomical(){
        double price = 2.50;
        if(this.ballance >= price){
            this.ballance -= price;
        }
    }
    public void payGourmet(){
        double price = 4.00;
        if(this.ballance >= price){
            this.ballance -= price;
        }
    }
    public void loadMoney(double addAmount){
        if(addAmount > 0.0){
            if(this.ballance + addAmount > 150.00){
                this.ballance = 150.00;
            }else{
                this.ballance += addAmount;
            }
        }
    }
}
