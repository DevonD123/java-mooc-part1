package greeter.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

    private JFrame frame;

    public UserInterface() {
    }
    
    @Override
    public void run() {
       this.frame = new JFrame("Swing on");
       this.frame.setPreferredSize(new Dimension(400,200));
       
       this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       this.createComponents(this.frame.getContentPane());
       
       this.createComponents(this.frame);
       
       this.frame.pack();
       this.frame.setVisible(true);
       
       
    }

    private void createComponents(Container container) {
        container.add(new JLabel("Hi!"));
        //only shows 1 text (think innerHtml)
    }

    public JFrame getFrame() {
        return frame;
    }
}
