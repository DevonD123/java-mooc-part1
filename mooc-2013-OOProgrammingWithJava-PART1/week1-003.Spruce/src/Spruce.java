public class Spruce {

    public static void main(String[] args) {

        // Write code here
        String output = "";
        String space = "     ";
        for(int i = 1; i<10;i++){
            output += "*";
            if(i%2 ==1){
                space = space.substring(0,space.length()-1);
                System.out.println(space + output);
            }
        }
        System.out.println("    *");
    }
    

}
