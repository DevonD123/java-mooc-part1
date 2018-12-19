/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class Flight {
    private String dest;
    private String origin;

    //constructor
    public Flight(String dest, String origin) {
        this.dest = dest;
        this.origin = origin;
    }
    
    
    //getter
       public String getDest(){
           return this.dest;
       }
       public String getOrigin(){
           return this.origin;
       }
    //setter
       public void setOrigin(String origin){
           this.origin = origin;
       }
       public void setDest(String dest){
           this.dest = dest;
       }
    //default print
    public String toString(){
        return "("+this.origin+"-"+this.dest+")";
    }
}
