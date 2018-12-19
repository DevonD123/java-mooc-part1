/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.Random;
public class NightSky {
    //fields
    private double density;
    private int height;
    private int width;
    private int starsPrinted;
    //constructors
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.height = height;
        this.width = width;
        this.starsPrinted = 0;
    }
    public NightSky(int width, int height){
        this(.1,width,height);
    }
    public NightSky(double density){
        this(density,20,10);
    } 
    //methods
    public void printLine(){
        //get evaluation value
        int percent = (int)(this.density * 100.0);
        //output string
        Random rand = new Random();
        String output ="";
        for (int i = 1; i <= this.width; i++) {
            //get random val 0-100
            int val = rand.nextInt(101);
            if(val <= percent){
                output += "*";
                this.starsPrinted ++;
            }else{
                output += " ";
            }
        }
        System.out.println(output);
    }
    public void print(){
        this.starsPrinted = 0;
        for(int i = 0; i < this.height; i++){
            this.printLine();
        }
    }
    public int starsInLastPrint(){
        return this.starsPrinted;
    }
    
}
