import java.util.Scanner;
public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        BirdList list = new BirdList();
        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.print("? ");
            String cmd = reader.nextLine().toLowerCase();
            if(cmd.equals("quit")){
                break;
            }
            
            if(cmd.equals("add")){
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latin = reader.nextLine();
                list.add(name, latin);
            }else if(cmd.equals("observation")){
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                if(list.exists(name)){
                 list.obs(name);
                }else{
                    System.out.println("Is not a bird!");
                }   
            }else if(cmd.equals("show")){
                System.out.print("What? ");
                String name = reader.nextLine();
                if(list.exists(name)){
                    list.print(name);
                }else{
                    System.out.println("Is not a bird!");
                }
            }else if(cmd.equals("statistics")){
                list.print();
            }
            
            
        
        }
        
    }

}
