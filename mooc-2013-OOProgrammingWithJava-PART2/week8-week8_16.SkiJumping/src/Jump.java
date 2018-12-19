
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.Collections;
public class Jump{
    private ArrayList<Integer> scores;
    private int dist;

    public Jump(ArrayList<Integer> scores, Integer dist) {
        this.scores = scores;
        this.dist = dist;
    }
    
    public int getDistance(){
        return this.dist;
    }
    public void printJump(){
        System.out.println("    length: "+this.dist);
        System.out.println("    judge votes: "+this.scores);
    }
    public int getScore(){
        int score = this.dist;
        Collections.sort(this.scores);
        for (int i = 1; i < this.scores.size() -1; i++) {
            score += this.scores.get(i);
        }
        return score;
    }
    public int points(){
        int points = this.dist;
        //this.scores.sort(c);
        //then for loop starting at 1 and ending < length add to points
        return points;
    }
}
