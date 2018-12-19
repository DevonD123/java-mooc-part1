
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        boolean keepLoop = true;
        while(keepLoop){
            System.out.print("Type the password: ");
            String input = reader.nextLine();
            if(input.equals(password)){
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                keepLoop = false;
            }else{
                System.out.println("Wrong!");
            }
        }
    }
}
