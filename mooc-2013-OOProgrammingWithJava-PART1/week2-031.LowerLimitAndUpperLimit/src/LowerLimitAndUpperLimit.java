
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int val = Integer.parseInt(reader.nextLine());
        System.out.print("Last ");
        int last = Integer.parseInt(reader.nextLine());
        for (int i = val; i <= last ; i++) {
            System.out.println(i);
        }
    }
}
