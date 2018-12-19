/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

/**
 *
 * @author Devon
 */
public class DrawingBoard extends JPanel implements  Updatable{
    private WormGame game;
    private int pieceLength;
    public DrawingBoard(WormGame game,int pieceLength) {
        this.game = game;
        this.pieceLength = pieceLength;
    }
    //piece length = piece height 
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        List<Piece> pieces = this.game.getWorm().getPieces();
       //loops over each piece in the worm and prints it block by block
        System.out.println(pieces); 
       for (int i = 0; i < this.game.getWorm().getLength(); i++) {
         g.fill3DRect((pieces.get(i).getX()*this.pieceLength),(pieces.get(i).getY()* this.pieceLength),this.pieceLength,this.pieceLength, true);   
        }
        g.setColor(Color.RED);
        g.fillOval((this.game.getApple().getX()* this.pieceLength), (this.game.getApple().getY()*this.pieceLength), this.pieceLength, this.pieceLength);
    
    }

    //double check if it has the correct component
    @Override
    public void update() {
        this.repaint();
    }
    
}
