package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure fig;

    public UserInterface(Figure fig) {
        this.fig = fig;
    }
    
    
    
    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        DrawingBoard board = new DrawingBoard(this.fig);
        container.add(board);
        this.frame.addKeyListener(new KeyboardListener(this.frame, this.fig));
    }

    private void addListeners() {
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
