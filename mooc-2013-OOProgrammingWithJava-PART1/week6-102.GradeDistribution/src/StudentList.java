/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devon
 */
import java.util.ArrayList;
public class StudentList {
    private ArrayList<Integer> list;
    private int added;
    public StudentList() {
        this.list = new ArrayList<Integer>();
    }
    public void add(int score){
        this.list.add(score);
    }
   private ArrayList<Integer> getGrades(){
       ArrayList<Integer> newList = new ArrayList<Integer>();
       for (Integer grade : list) {
           int gradeVal = 0;
            if(grade > 0){   
                if(grade >= 50){
                    gradeVal = 5;
                }else if(grade >= 45){
                    gradeVal = 4;
                }else if(grade >= 40){
                    gradeVal = 3;
                }else if(grade >= 35){
                    gradeVal = 2;
                }else if(grade >= 30){
                    gradeVal = 1;
                }
                   newList.add(gradeVal);
            } //to avaid counting the -2
        }
       return newList;
   }
   private double acceptance(){
       ArrayList<Integer> intList = this.getGrades();
       int sum = 0;
       for (Integer score : intList) {
           if(score >= 1){
               sum++;
           }
       }
       return 100*((double)sum/(double)intList.size());
   }
   private void printLine(int numb){
       ArrayList<Integer> intList = this.getGrades();
       String output ="";
       for (Integer val : intList) {
           if(val == numb){
               output += "*";
           }
       }
       System.out.println(numb+": "+output);
   }
   public void report(){
       System.out.println("Grade distribution:");
    for(int i = 5; i >= 0; i--){
        this.printLine(i);
    }
       System.out.println("Acceptance percentage: "+this.acceptance());
   }
    
}
