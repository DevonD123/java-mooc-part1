import java.util.ArrayList;

//varriance -> how spread (from mean)
/*
mean is the middle sample sum / numb samples
deviation is data - mean = deviation

sum deviations from set / data point numb (avraged the mean deviation)

*/
public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer val : list) {
            sum += val;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double)sum(list)/(double)list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        double devSum = 0.0;
        for (Integer val : list) {
            double addTo = ((double)val - avg);
            devSum += addTo * addTo;
        }
        return devSum / ((double)list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        //list.add(2);
        //list.add(7);
       // list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
