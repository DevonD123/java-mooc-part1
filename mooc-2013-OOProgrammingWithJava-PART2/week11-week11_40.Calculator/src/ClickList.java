
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class ClickList implements ActionListener{
    private JTextField output;
    private JTextField input;
    private JButton clearBtn;
    private int mode;

    public ClickList(JTextField output, JTextField input, JButton clearBtn,int mode) {
        this.output = output;
        this.input = input;
        this.mode = mode;
        this.clearBtn = clearBtn;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(this.mode){
            case 1:
                this.add();
                break;
            case 2: 
                this.sub();
                break;
            case 3: 
                this.clear();
                break;
        }
        this.checkEnable();
       
    }
    
    private void add(){
        try{
            if(this.input.getText().length() >= 1){
                int add = Integer.parseInt(this.input.getText());
                int out = Integer.parseInt(this.output.getText());
                
                this.output.setText(""+(add+out));
                this.input.setText("");
            }
        }catch(Exception e){
            this.input.setText("");
        }
    }
    private void sub(){
        try{
            if(this.input.getText().length() >= 1){
                int sub = Integer.parseInt(this.input.getText());
                int out = Integer.parseInt(this.output.getText());
                
                this.output.setText(""+(out-sub));
                this.input.setText("");
            }
        }catch(Exception e){
            this.input.setText("");
        }
    }
    private void clear(){
        this.output.setText("0");
        this.input.setText("");
    }
    private void checkEnable(){
        if(!this.output.getText().equals("0")){
            clearBtn.setEnabled(true);
        }else{
            this.clearBtn.setEnabled(false);
        }
    }
}
