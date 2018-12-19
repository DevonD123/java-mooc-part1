import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String val = reader.nextLine();
        String val2 = "";
            for (int i = val.length()-1; i >= 0; i--) {
                val2 += val.charAt(i);
                System.out.println(val.charAt(i));
            }
            System.out.println("In reverse order: "+val2);
        
    }
}
