
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string:");
        if(clockTime(reader.nextLine())){
            System.out.println("The form is fine.");
        }else{
            System.out.println("The form is wrong.");
        }
    }
    public static boolean isAWeekDay(String string){
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }
        return false;
    }
    public static boolean allVowels(String string){
        if(string.matches("(a|e|i|o|u|y|ä|ö)+")){
            return true;
        }
        return false;
    }
    public static boolean clockTime(String string){
        if(string.matches("[0-2][0-9]:[0-5][0-9]:[0-5][0-9]")){
            String[] broken = string.split(":");
            if(
                    (Integer.parseInt(broken[0]) == 24 &&
                    Integer.parseInt(broken[1]) == 00 && 
                    Integer.parseInt(broken[2]) == 00) ||
                    Integer.parseInt(broken[0]) < 24
                ){
                return true;
            }
            
        }
        return false;
    }
}
