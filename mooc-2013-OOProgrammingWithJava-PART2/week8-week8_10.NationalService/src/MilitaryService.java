/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class MilitaryService implements NationalService{
    private int days;

    public MilitaryService(int days) {
        this.days = days;
    }
    public void work(){
        if(this.days >= 1){
            this.days --;
        }
    }
    public int getDaysLeft(){
        return this.days;
    }
    
}
