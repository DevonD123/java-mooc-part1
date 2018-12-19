/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Devon
 */
public class Circle extends Figure{
    private int d;

    public Circle(int x, int y, int d) {
        super(x,y);
        this.d = d;
    }
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillOval(super.getX(), super.getY(), this.d, this.d);
    }
    
    

    
}
