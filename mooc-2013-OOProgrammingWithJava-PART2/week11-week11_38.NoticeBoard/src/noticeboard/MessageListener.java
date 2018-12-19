/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Devon
 */
public class MessageListener implements ActionListener{
    private JTextField input;
    private JLabel output;

    public MessageListener(JTextField input, JLabel output) {
        this.input = input;
        this.output = output;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.output.setText(this.input.getText());
        this.input.setText("");
    }
    
}
