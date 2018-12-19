
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String str = reader.nextLine();
        System.out.print("Length of the first part: ");
        int numb = Integer.parseInt(reader.nextLine());
        
        String val = str.substring(0, numb);
        System.out.println("Result: "+ val);
    }
}
