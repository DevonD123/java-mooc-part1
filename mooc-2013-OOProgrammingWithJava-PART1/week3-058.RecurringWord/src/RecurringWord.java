
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
         ArrayList<String> values = new ArrayList<String>();
         while (true) {            
             System.out.print("Type a word: ");
             String read = reader.nextLine();
             if(values.contains(read)){
                 System.out.println("You gave twice the word "+read);
                 break;
             }else{
                 values.add(read);
             }
        }
    }
}
