/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
public class Calculator {
    private Reader reader;
    private int count;
    public Calculator() {
        this.count = 0;
        this.reader = new Reader();
    }
     public void start() {
        while (true) {
            System.out.print("command: ");
            String command = this.reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
     private void sum(){
         System.out.print("value1: ");
         int val1 = this.reader.readInteger();
         System.out.print("value2: ");
         int val2 = this.reader.readInteger();
         this.count ++;
         System.out.println("sum of the values "+(val1+val2));
     }
     private void difference(){
         System.out.print("value1: ");
         int val1 = this.reader.readInteger();
         System.out.print("value2: ");
         int val2 = this.reader.readInteger();
         this.count ++;
         System.out.println("difference of the values "+(val1-val2));
     }
     private void product(){
         System.out.print("value1: ");
         int val1 = this.reader.readInteger();
         System.out.print("value2: ");
         int val2 = this.reader.readInteger();
         this.count ++;
         System.out.println("product of the values "+(val1*val2));
     }
     private void statistics(){
         System.out.println("Calculations done "+ this.count);
     }
}
