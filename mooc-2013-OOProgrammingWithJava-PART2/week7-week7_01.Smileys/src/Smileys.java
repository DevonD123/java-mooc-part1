
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("\\:D/");
printWithSmileys("87.");
    }
    private static void printWithSmileys(String characterString){
        String smile = ":)";
        int length = (characterString.length()/2)+3;
        if(characterString.length() % 2 == 1){
            length ++;
            characterString += " ";
        }
        String output = "";
        for(int i = 0; i < length; i++){
            output += smile;
        }
        System.out.println(output);
        System.out.println(smile+" "+characterString+" "+smile);
        System.out.println(output);
    }
}
