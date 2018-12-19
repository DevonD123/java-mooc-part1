
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        float a = Float.parseFloat(reader.nextLine());
        System.out.print("Type another number: ");
        float b = Float.parseFloat(reader.nextLine());
        System.out.println("Division: "+a+" / "+b+" = "+(a/b));
        // Implement your program here. Remember to ask the input from user.
    }
}
