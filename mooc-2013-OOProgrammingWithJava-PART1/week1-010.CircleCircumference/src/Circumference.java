
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius: ");
        float a = Float.parseFloat(reader.nextLine()); 
        System.out.println("Circumference of the circle: "+(2*Math.PI*a) );
// Program your solution here 
    }
}
