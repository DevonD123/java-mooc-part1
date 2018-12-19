import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String val = reader.nextLine();
        if(val.length() < 3){
        
        }else{
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1)+". character: " + val.charAt(i));
            }
        }
        
    
    }
}
