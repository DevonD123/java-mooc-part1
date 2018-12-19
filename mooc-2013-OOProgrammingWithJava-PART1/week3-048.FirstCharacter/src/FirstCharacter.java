import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        char val = firstCharacter(reader.nextLine());
        System.out.println("First characteer: "+val);
    }
    public static char firstCharacter(String text){
        return text.charAt(0);
    }
}
