package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.worm = new Worm(width/2,height/2,Direction.DOWN);
        this.apple = this.buidApple();
        
        while(this.worm.runsInto(this.apple)){
             this.apple = this.buidApple();
        }
        addActionListener(this);
        setInitialDelay(2000);
    }

    private Apple buidApple(){
        Random rand = new Random();
        //maybe +1 on w and h bu then they would be on the very edge
        return new Apple(rand.nextInt(this.width),rand.nextInt(this.height));
    }
    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    //worm
    public Worm getWorm(){
        return this.worm;
    }
    public void setWorm(Worm worm){
        //doesnt make sense
        this.worm = worm;
    }
    public Apple getApple(){
        return this.apple;
    }
    public void setApple(Apple apple){
        //doesnt make sense
        this.apple = apple;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!this.continues) {
            return;
        }
        List<Piece> list = this.worm.getPieces();
        this.worm.move();
        if(this.worm.runsInto(this.apple)){
            System.out.println("hit apple");
            //did hit apple
            this.worm.grow();
            while (worm.runsInto(apple)) {
                this.apple = this.buidApple();
            }
        }
        if(!this.runsIntoAnything()){
            this.continues = false;
            System.out.println("game over");
        }
        this.updatable.update();
        setDelay(1000 / this.worm.getLength());
    }
    private boolean runsIntoAnything(){
        if(this.worm.runsIntoItself()){
            System.out.println("ran into self");
            return false;
        }
        if(this.worm.getPieces().get(this.getWorm().getLength()-1).getX() == 0 
                ||
            this.worm.getPieces().get(this.getWorm().getLength()-1).getX() >= this.width 
        ){
            return false;
        }
        if(this.worm.getPieces().get(this.getWorm().getLength()-1).getY() == 0 
                ||
            this.worm.getPieces().get(this.getWorm().getLength()-1).getY() >= this.height
        ){
            return false;
        }
        return true;
    }

}
