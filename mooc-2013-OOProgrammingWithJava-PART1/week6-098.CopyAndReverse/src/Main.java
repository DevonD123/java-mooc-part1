
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));

    }
    public static int[] copy(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static int[] reverseCopy(int[] arr){
        int[] newArr = new int[arr.length];
        int forwards = 0;
        for (int i = arr.length -1; i >= 0; i--) {
            newArr[forwards] = arr[i];
            forwards ++;
        }
        return newArr;
    }
}
