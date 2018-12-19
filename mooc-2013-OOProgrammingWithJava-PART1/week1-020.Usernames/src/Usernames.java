
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username ");
        String uName = reader.nextLine();
        System.out.print("Type your password ");
        String uPass = reader.nextLine();
        if(uName.equals("alex") && uPass.equals("mightyducks") || uName.equals("emily") && uPass.equals("cat")){
            System.out.println("You are now logged into the system!");
        }else{
            System.out.println("Your username or password was invalid!");
        }
    }
}
