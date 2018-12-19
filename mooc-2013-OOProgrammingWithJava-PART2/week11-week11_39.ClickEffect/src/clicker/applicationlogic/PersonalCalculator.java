/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.applicationlogic;

/**
 *
 * @author Devon
 */
public class PersonalCalculator implements Calculator{
    private int val;

    public PersonalCalculator() {
        this.val = 0;
    }
    
    
    @Override
    public int giveValue() {
        return val;
    }

    @Override
    public void increase() {
        this.val++;
    }
    
}
