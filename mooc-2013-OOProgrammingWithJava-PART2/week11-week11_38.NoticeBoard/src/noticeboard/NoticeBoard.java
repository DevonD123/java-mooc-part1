package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("");
        this.frame.setPreferredSize(new Dimension(500,300));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        this.createComponents(this.frame.getContentPane());
        
        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JButton btn = new JButton("Copy!");
        JTextField input = new JTextField();
        JLabel output = new JLabel("");
        btn.addActionListener(new MessageListener(input,output));
        container.add(input);
        container.add(btn);
        container.add(output);
        
        
    }
}
