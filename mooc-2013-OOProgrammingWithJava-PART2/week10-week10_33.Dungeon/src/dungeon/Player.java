/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Devon
 */
public class Player{
    private int x;
    private int y;
    private String symbol;
    private boolean isDestroyed;

    public Player(int x, int y, String symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
        this.isDestroyed = false;
    }

    public Player() {
        this(0,0,"@");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getSymbol() {
        return symbol;
    }

    public void incX(int x,int boardX) {
        //make sure players stay in board
        if(this.x + x < boardX && this.x + x >= 0){
            this.x += x;
        }
    }

    public void incY(int y, int boardY) {
        //so player stays on board
        if(this.y + y < boardY && this.y + y >= 0){
            this.y += y;
        }
    }
    public void destroy(){
        this.isDestroyed = true;
    }
    public boolean getDestroyed(){
        return this.isDestroyed;
    }
    @Override
    public String toString(){
        return this.symbol +" "+this.x+" "+this.y;
    }
    
    
}
