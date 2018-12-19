
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        
        System.out.print("Type your name: ");
        String val = reader.nextLine();
        int len = calculateCharacters(val);
        System.out.println("Number of characters: "+ len);
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String val){
        return val.length();
    }
}
