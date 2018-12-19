/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Scanner;

/**
 *
 * @author Devon
 */
public class Ui {
    private Scanner reader;
    private int moves;
    
    public Ui(Scanner reader) {
        this.reader = reader;
        this.moves = 14;
    }
    
    public int pMoves(){
        return this.moves;
    }
    
    public void readCmd(String cmd){
        cmd = cmd.toLowerCase();
       if(cmd.equals("w")){
       //go up
       }else if(cmd.equals("s")){
       //go down
       }else if(cmd.equals("a")){
       //go left
       }else if(cmd.equals("d")){
       //go right
       }else{
       //unknown cmd
       }
    }
    public boolean didLose(){
        if(this.moves == 0){
            return true;
        }
        return false;
    }
    
}
