import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private final Random random = new Random();
    private final int length;
    private final int lowerAscii;
    private final int upperAscii;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.lowerAscii = 97; //a lowercase (random is inclusive for lower)
        this.upperAscii = 122; //z lowercase (add 1 for random bc exclusive)
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pass = "";
        for (int i = 0; i < this.length; i++) {
            int ascii = this.random.nextInt(26)+97;
            pass += (char)ascii;
        }
        return pass;
    }
}
