
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int grade = Integer.parseInt(reader.nextLine());
        int gradeVal = 0;
        boolean didFail = false;
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
        }else{
            didFail = true;
        }
        if(didFail){
            System.out.println("Failed");
        }else{
            System.out.println("Grade: "+gradeVal);
        }
    }
}
