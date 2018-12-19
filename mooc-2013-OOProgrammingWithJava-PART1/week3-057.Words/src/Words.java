import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            System.out.print("Type a word: ");
            String word  = reader.nextLine();
            if(word.isEmpty()){
                System.out.println("You typed the gollowing words:");
                for(String val : words){
                    System.out.println(val);
                }
                
                break;
            }
            
            words.add(word);
        }
        
    }
}
