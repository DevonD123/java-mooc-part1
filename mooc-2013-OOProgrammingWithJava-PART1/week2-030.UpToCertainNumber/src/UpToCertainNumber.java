
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int val = Integer.parseInt(reader.nextLine());
        for (int i = 1; i <= val ; i++) {
            System.out.println(i);
        }
        // Write your code here
        
    }
}
