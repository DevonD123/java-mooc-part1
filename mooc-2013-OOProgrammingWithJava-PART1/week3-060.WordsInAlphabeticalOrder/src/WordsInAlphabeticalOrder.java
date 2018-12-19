
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> arr = new ArrayList<String>();
        while (true) {            
            System.out.print("Type a word:");
            String word = reader.nextLine();
            if(word.isEmpty()){
                Collections.sort(arr);
                for (String val : arr) {
                    System.out.println(val);
                }
                break;
            }
            arr.add(word);
        }
        
        System.out.println("You typed the following words:");
    }
}
