package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        int bH = 50; 
        graphics.setColor(Color.BLACK);
        graphics.fillRect(100,50,bH,bH);
        graphics.fillRect(250,50,bH,bH);
        graphics.fillRect(50,200,bH,bH);
        graphics.fillRect(300,200,bH,bH);
        graphics.fillRect(100,250,200,bH);

    }
}
