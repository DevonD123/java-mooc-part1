
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true){
            System.out.print("Type a Number ['no' to quit]: ");
            String str = reader.nextLine();
            if(str.toLowerCase().equals("no")){
                break;
            }
            double number = Double.parseDouble(str);
            if(number >= -30.0 && number <= 40.0){
                Graph.addNumber(number);
            }
        }
        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
