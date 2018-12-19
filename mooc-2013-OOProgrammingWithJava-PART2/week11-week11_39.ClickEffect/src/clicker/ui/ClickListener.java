/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Devon
 */
public class ClickListener implements ActionListener{
    private JLabel lbl;
    private Calculator calc;

    public ClickListener(Calculator calc,JLabel lbl) {
        this.lbl = lbl;
        this.calc = calc;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.calc.increase();
        this.lbl.setText(""+this.calc.giveValue());
    }
    
}
