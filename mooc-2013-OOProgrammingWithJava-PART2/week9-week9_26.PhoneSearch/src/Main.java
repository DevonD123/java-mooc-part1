import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        UserList ul = new UserList(reader);
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.print(" 1 add a number\n" +
                            " 2 search for a number\n" +
                            " 3 search for a person by phone number\n" +
                            " 4 add an address\n" +
                            " 5 search for personal information\n" +
                            " 6 delete personal information\n" +
                            " 7 filtered listing\n" +
                            " x quit\n");
        
        while(true){
            System.out.println("");
            System.out.print("command: ");
            String cmd = reader.nextLine();
            if(cmd.equals("x")){
                break;
            }
            try{
                switch(Integer.parseInt(cmd)){
                    case 1 :
                        ul.addNumber();
                        break;
                    case 2 : 
                        ul.searchByNameGetPerson();
                        break;
                    case 3:
                        ul.searchByNumberGetName();
                        break;
                    case 4:
                        ul.addAddress();
                        break;
                    case 5:
                        ul.searchByNameGetAll();
                        break;
                    case 6:
                        ul.removeInfo();
                        break;
                    case 7:
                        ul.getFiltered();
                        break;
                    default: 
                }
            }catch(Exception ex){
            
            }
        
        }
    }
}
