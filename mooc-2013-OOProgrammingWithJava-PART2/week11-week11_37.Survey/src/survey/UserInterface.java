package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Survey");
        this.frame.setPreferredSize(new Dimension(200,300));
        
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //if just the frame is passed in causes an error
        this.createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        this.frame.setVisible(true);
        
    }
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container,BoxLayout.Y_AXIS); 
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        JCheckBox b1 = new JCheckBox("Yes!");
        JCheckBox b2 = new JCheckBox("No!");
        container.add(b1);
        container.add(b2);
        container.add(new JLabel("Why?"));
        ButtonGroup radios = new ButtonGroup();
        JRadioButton no = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        radios.add(no);
        radios.add(fun);
        container.add(no);
        container.add(fun);
        container.add(new JButton("Done!"));
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
