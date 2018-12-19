/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.List;
import java.util.ArrayList;
import wormgame.Direction;

/**
 *
 * @author Devon
 */
public class Worm{
    private ArrayList<Piece> list;
    private int originalX;
    private int originalY;
    private Direction originalDir;
    private boolean shouldGrow;
    //seems like grow is for next move?
    //fix issue
    public Worm(int originalX, int originalY,Direction originalDir) {
        this.originalX = originalX;
        this.originalY = originalY;
        this.originalDir = originalDir;
        this.list = new ArrayList<Piece>();
        this.list.add(new Piece(originalX,originalY));
        this.shouldGrow = false;
    }

    public Worm(int originalX, int originalY) {
        this(originalX,originalY,Direction.DOWN);
    }
   
    
    public Direction getDirection(){
        return this.originalDir;
    }
    public int getLength(){
        try{
            if(this.list.size() >= 1){
                return this.list.size();
            }
            return 0;
        }catch(Exception e){
           return 0;

        }
    }
    public List<Piece> getPieces(){
        try{
            if(this.list.size() >= 1){
                return this.list;
            }
            return new ArrayList<Piece>();
        }catch(Exception e){
           return new ArrayList<Piece>();

        }
    }
    public void setDirection(Direction dir){
        this.originalDir = dir;
    }
    public void move(){
        
        Piece p = this.list.get(this.list.size()-1);
        int dx = p.getX();
        int dy = p.getY();
        if(originalDir == Direction.RIGHT){
            dx ++;
        }else if(originalDir == Direction.LEFT){
            dx --;
        }else if(originalDir == Direction.DOWN){
            dy ++;
        }else if(originalDir == Direction.UP){
            dy --;
        }
        //will not remove
        if (getLength() > 2 && !shouldGrow) {
          this.list.remove(0);  
        }
        if(this.shouldGrow){
            this.shouldGrow = false;
        }
        this.list.add(new Piece(dx, dy));      
        
    }
    public void grow(){
        this.shouldGrow = true;
    }
    public boolean runsIntoItself(){
        Piece p = this.list.get(this.getLength()-1);
        for (int i = 0; i < this.getLength()-2; i++) {
            if(p.getX() == this.list.get(i).getX() && p.getY() == this.list.get(i).getY()){
                return true;
            }
        }
        return false;
    }
    public boolean runsInto(Piece piece) {
        for (int i = 0; i < getLength(); i++) {
            if (this.list.get(i).getX() == piece.getX() && this.list.get(i).getY() == piece.getY()) {
                return true;
            }
        }

        return false;
    }
    
}
