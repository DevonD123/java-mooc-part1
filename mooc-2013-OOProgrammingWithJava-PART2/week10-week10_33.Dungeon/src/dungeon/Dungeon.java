/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Devon
 */
public class Dungeon {
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private int vampSteps;
    private boolean vampiresMove;
    private List<Player> list;
    private Random rand;
    private Player player;
    private Scanner reader;
    
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.height = height;
        this.length = length;
        this.moves = moves;
        this.vampires = vampires;
        this.vampiresMove = vampiresMove;
        this.vampSteps = 0;
        this.list = new ArrayList<Player>();
        this.reader = new Scanner(System.in);
        //adds vampires and random possition
        for (int i = 0; i < vampires; i++) {
            this.list.add(vampGen(length,height));
        }
        //add player
        this.player = new Player();
    }
    
    private Player vampGen(int length, int height){
        Random random = new Random();
        return new Player((random.nextInt(length-1)+1),random.nextInt(height),"v");
    }
    //starts game
    public void run(){
        while (true) {            
            boolean isOver = this.newRound();
            if(isOver){
                break;
            }
            this.printCoor();
            this.printBoard();
            
            String cmd = reader.nextLine();
            this.movePlayer(cmd);
            if(this.vampiresMove){
                this.moveVamps();
            }
            this.moves --;
        }
    }
    //move the vampires randomly the same amount of steps
    private void moveVamps(){
        if(this.vampSteps >= 1){
            
            char[] cmdArr = new char[]{'w','d','s','a'};        
            //in reverse order so no issues
            for (int j = this.list.size() -1; j >= 0; j--) {
                Player vamp = this.list.get(j);
                for (int i = 0; i < this.vampSteps; i++) {
                    //cant use field instance of random number get a null pointer exception
                    char cmd = cmdArr[new Random().nextInt(4)];
                    //moves the vampire
                    this.cmdReader(cmd,vamp);
                    //if the player is in that spot then true
                    if(this.checkPlayer(vamp.getX(), vamp.getY())){
                        this.list.remove(j); 
                        break; //break out of current loop and goes back to looping over list
                    }
                }
            }
        }
        
        this.vampSteps = 0;
    }
    
    
    //print player @ vamp coordinates
    private void printCoor(){
        System.out.println("");
        System.out.println(this.player);
        for (Player vamp : list) {
            System.out.println(vamp);
        }
    }
    
    //prints board with vampires and user 
    //must check if collided first and remove from arr
    //off board checks must be made in the player
    private void printBoard(){
        System.out.println("");
        for (int y = 0; y < this.height; y++) {
            String line ="";
            for (int x =0; x<this.length;x++) {
                if(checkVamp(x, y)){
                   line += "v";
                }else if(checkPlayer(x,y)){
                    line += "@";
                }else{
                    line += ".";
                }
              
            }   
            System.out.println(line);
        }
        System.out.println("");
        
    }
    //moves player and sets vamp moves checking each move if vamp there
    private void movePlayer(String cmd){
        if (cmd.isEmpty()){throw new IllegalArgumentException("can't do nothing");}
        cmd = cmd.toLowerCase();
        int len = cmd.length();
        this.vampSteps = len;
        for (int i = 0; i < len; i++) {
            this.cmdReader(cmd.charAt(i),this.player);
            this.remVamp(this.player.getX(), this.player.getY());
        }
    }
    
    //switch for moves
    private void cmdReader(char cmd, Player player){
        switch(cmd){
            case 's': 
                    player.incY(1, this.height);
                break;
            case 'w':
                    player.incY(-1, this.height);
                break;
            case 'd':
                    player.incX(1, this.length);
                break;
            case 'a':
                    player.incX(-1, this.length);
                break;
            default: //do nothing
        }
    }
    
    //prints the round number & checks if win or lose
    //true for finished
    private boolean newRound(){
        if(this.list.isEmpty()){
            System.out.println("YOU WIN");
            return true;
        }
        if(this.moves == 0){
            System.out.println("YOU LOSE");
            return true;
        }
        System.out.println(this.moves);
        return false;
    }
    
    // find vampire with coordinates and remove them from the array
    private void remVamp(int x, int y){
        int index = -1;
        for (int i = 0; i < this.list.size(); i++) {
            Player vampInst = this.list.get(i);
            if(vampInst.getX() == x && vampInst.getY() == y){
                index = i;
            }
        }
        if(index >= 0){
            this.list.remove(index);
        }
    }
    
    //loops for each dot so slow but won't really need speed
    private boolean checkVamp(int x, int y){
        for (Player vamp : list) {
    // if(!vamp.getDestroyed()){ => can use destroyed or remove from array
                if(vamp.getX()==x && vamp.getY()==y){
                    return true;
                }
    //      }
        }
        return false;
    }
   
    private boolean checkPlayer(int x, int y){
       return this.player.getX() == x && this.player.getY() == y;
    }
    
}
