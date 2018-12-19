
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Calculator");
        this.frame.setPreferredSize(new Dimension(400,200));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        this.createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        this.frame.setVisible(true);
    
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField output = new JTextField("0");
        JTextField input = new JTextField();
        JButton btnP = new JButton("+");
        JButton btnM = new JButton("-");
        JButton btnS = new JButton("Z");
        
        output.setEnabled(false);
        
        btnP.addActionListener(new ClickList(output,input,btnS,1));
        btnM.addActionListener(new ClickList(output,input,btnS,2));
        btnS.addActionListener(new ClickList(output,input,btnS,3));


        
        GridLayout btnLayout = new GridLayout(1, 3);
        JPanel panel = new JPanel(btnLayout);
        panel.add(btnP);
        panel.add(btnM);
        panel.add(btnS);
        
        container.add(output);
        container.add(input);
        container.add(panel);
        
        btnS.setEnabled(false);
//        try{
//            int outputVal = Integer.parseInt(output.getText());
//            if(outputVal != 0){
//                btnS.setEnabled(true);
//            }else{
//                btnS.setEnabled(false);
//            }
//        }catch(Exception e){
//            btnS.setText("0");
//        }
    
    }

    public JFrame getFrame() {
        return frame;
    }
}
