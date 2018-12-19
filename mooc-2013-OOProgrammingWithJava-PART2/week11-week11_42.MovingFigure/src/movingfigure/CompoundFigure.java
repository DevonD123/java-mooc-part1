/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Devon
 */
public class CompoundFigure extends Figure{
    private ArrayList<Figure> list;

    public CompoundFigure() {
        super(0, 0); //doesn't matter but required for inheritence
        this.list = new ArrayList<Figure>();
    }
    
    public void add(Figure fig){
        this.list.add(fig);
    }
    
    @Override
    public void move(int x, int y){
        for (Figure figure : list) {
            figure.move(x, y);
        }
    }
    
    @Override
    public void draw(Graphics graphics) {
        for (Figure figure : list) {
            figure.draw(graphics);
        }
    }
    
}
