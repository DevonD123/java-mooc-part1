import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        PlayerList plist = new PlayerList();
        
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {            
            System.out.print("  Participant name: ");
            String person = reader.nextLine();
            
            if(person.length()<=0){
                System.out.println("");
                System.out.println("The tournament begins!");
                break;
            }
            plist.addPlayer(person);
            //create new skier
        }
        int round = 1;
        while(true){
            System.out.println("");
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String cmd = reader.nextLine();
            System.out.println("");
            
            if(!cmd.equals("jump")){
                System.out.println("Thanks!");
                System.out.println("");
                System.out.println("Tournament results:");
                System.out.println("Position    Name");
                //call results
                plist.getFinal();
                break;
            }
            
            System.out.println("Round "+round);
            System.out.println("");
            System.out.println("Jumping order:");
            plist.getPoints();
            System.out.println("");
            System.out.println("Results of round "+round);
            //loop player results
            plist.roundStart();
            round ++;
        }
        
    }
}
