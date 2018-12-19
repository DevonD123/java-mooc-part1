import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int val = Integer.parseInt(reader.nextLine());
        int sum = 1;
        for (int i = 2; i <= val; i++) {
            sum *= i;
        }
        System.out.println("Factorial is "+sum);
    }
}
