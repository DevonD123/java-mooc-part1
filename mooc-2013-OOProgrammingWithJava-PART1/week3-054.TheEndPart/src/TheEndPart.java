import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String str = reader.nextLine();
        System.out.print("Length of the end part: ");
        int numb = Integer.parseInt(reader.nextLine());
        
        String val = str.substring(str.length()-numb);
        //NOTE ===> dont add a second arg
        System.out.println("Result: "+ val);
    }
}
