
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        Ui ui = new Ui(reader);
        
        System.out.println("Airport panel");
        System.out.println("----------------------");
        System.out.println("");
      
     
         ui.startPlaneInfo();
        
        System.out.println("Flight service");
        System.out.println("----------------------");
        System.out.println("");
        
        ui.startFlightService();
    }
}
