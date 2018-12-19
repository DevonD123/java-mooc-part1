/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class Ui {
    private Scanner reader;
    private HashMap<String,Plane> map;
    public Ui(Scanner reader) {
        this.reader = reader;
        this.map = new HashMap<String,Plane>();
    }
    
    public void startPlaneInfo(){
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String input = this.reader.nextLine();
            int cmd = -1;
            if(input.equals("x")){
                //call here or in main after break using the later currently
                //this.startFlightService();
                break;
            }else{
                try{
                    cmd = Integer.parseInt(input);
                    this.useCmd(cmd);
                }catch (NumberFormatException ex) {
                   
                } 
            }
        }
    }
    
    public void startFlightService(){
        while(true){
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String input = this.reader.nextLine();
            int cmd;
            if(input.equals("x")){
                break;
            }
            try{
                   cmd = Integer.parseInt(input);
                if(cmd == 1){
                    this.printPlanes();
                }else if(cmd == 2){
                    this.printAll();
                }else if(cmd == 3){
                    this.printPlane();
                }
            }catch (NumberFormatException ex){
               
            }
            
        
        }
    }
    private void printPlanes(){
        for (String key :this.map.keySet()) {
            System.out.println(this.map.get(key));
        }
    }
    private void printPlane(){
        System.out.print("Give plane ID: ");
        String id = this.reader.nextLine().toUpperCase();
        
        if(this.map.containsKey(id)){
            System.out.println(this.map.get(id));
        }else{
            
        }
    }
    private void printAll(){
//        int count = 0;
        for (String key :this.map.keySet()) {
            Plane plane = this.map.get(key);
            ArrayList<Flight> flight = plane.getFLights();
            for (Flight indv : flight) {
                System.out.println(plane + " "+indv);
//                count ++;
            }
        }
//        if(count > 0){
//            System.out.println("No flights to print");
//        }
    }
    private void useCmd(int cmd){
                if(cmd == 1){
                //make new plane
                System.out.print("Give plane ID: ");
                String id = this.reader.nextLine().toUpperCase();
                System.out.print("Give plane capacity: ");
                int cap = Integer.parseInt(this.reader.nextLine());
                if(!this.map.containsKey(id)){
                    Plane fly = new Plane(cap,id);
                    this.map.put(id, fly);
                }else{
//                    System.out.println("Id already in use: "+ id);
                }
            }else if(cmd ==2){
                System.out.print("Give plane ID: ");
                String id = reader.nextLine().toUpperCase();
                if(this.map.containsKey(id)){
                    System.out.print("Give departure airport code: ");
                    String origin = reader.nextLine().toUpperCase();
                    System.out.print("Give destination airport code: ");
                    String dest = reader.nextLine().toUpperCase();
                    Plane plane = this.map.get(id);
                    plane.addFlight(new Flight(dest,origin));
                
                }else{
//                    System.out.println("The ID: "+id+" does not exist.");
                }
            
            }


    }
}
