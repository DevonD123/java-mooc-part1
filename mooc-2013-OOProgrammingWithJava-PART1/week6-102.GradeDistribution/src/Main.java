import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes: ");
        StudentList list = new StudentList();
        while(true){
            int score = Integer.parseInt(reader.nextLine());
            if(score == -1){
                //method call
                list.report();
                break;
            }
            if(score >= 1 && score <= 60){
                list.add(score);
            }
        }
    }
}

/*
"Type exam scores, -1 completes: "
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
*/