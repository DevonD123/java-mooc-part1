public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            }else if(beginning == end){
                return false;
            }
            if(array[middle] > searchedValue){
                //end
                end = middle;
            }else if(array[middle] < searchedValue){
                //beg
                beginning = middle +1;
            }
            // restrict the search area 
        }
        return false;
    }
}
