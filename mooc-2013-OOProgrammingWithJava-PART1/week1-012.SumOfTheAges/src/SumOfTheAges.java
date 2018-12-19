
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String aN = reader.nextLine();
        System.out.print("Type your age: ");
        int aA = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String bN = reader.nextLine();
        System.out.print("Type your age: ");
        int bA = Integer.parseInt(reader.nextLine());
        
        System.out.println(aN+" and "+bN+" are "+(aA+bA)+" years old in total.");
        // Implement your program here
    }
}
