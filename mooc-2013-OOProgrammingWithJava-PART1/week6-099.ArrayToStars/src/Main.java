
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int val : array) {
            String output = "";
            for(int i = 0; i<val; i++){
                output += "*";
            }
            System.out.println(output);
        }
    }
}
