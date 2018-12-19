import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //int[] values = {6, 5, 8, 7, 11};
        //System.out.println("smallest: " + smallest(values));
        //System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        
//        int[] values = {-1, 6, 9, 8, 12};
//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

//            int[] values = {3, 2, 5, 4, 8};
//
//            System.out.println( Arrays.toString(values) );
//
//            swap(values, 1, 0);
//            System.out.println( Arrays.toString(values) );
//
//            swap(values, 0, 3);
//            System.out.println( Arrays.toString(values) );



        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    
    public static int smallest(int[] arr){
        int sml = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i ++){
            if(sml > arr[i]){
                sml = arr[i];
            }
        }
        return sml;
    }
    public static int indexOfTheSmallest(int[] arr){
        int index = 0;
        for(int i = 1; i < arr.length; i ++){
            if(arr[index] > arr[i]){
                index = i;
            }
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] arr, int startIndex){
        int index = startIndex;
        for(int i = startIndex + 1; i < arr.length; i ++){
            if(arr[index] > arr[i]){
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int arrVal1 = array[index1];
        array[index1] = array[index2];
        array[index2] = arrVal1;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexVal = indexOfTheSmallestStartingFrom(array, i);
            swap(array,i,indexVal);
            System.out.println(Arrays.toString(array));
        }
    }
}
