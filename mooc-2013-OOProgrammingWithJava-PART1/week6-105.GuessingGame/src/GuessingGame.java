import java.util.Scanner;

public class GuessingGame {
    private int lowerLimit;
    private int upperLimit;
    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        this.instructions(lowerLimit, upperLimit);
        this.upperLimit = upperLimit;
        this.lowerLimit =lowerLimit;
        while(true){
            if(this.upperLimit - this.lowerLimit == 0){
                System.out.println("The number you're thinking of is "+(this.upperLimit)+".");
                break;
            }
            int avg = this.average(this.upperLimit, this.lowerLimit);
            if(this.isGreaterThan(avg)){
                this.lowerLimit = avg +1;
            }else{
                this.upperLimit = avg;
            }
            
            //ask if greater then avrg
                //y => lower limit = oldavg
                //n => upper limit = old avg
        }
        

    }
    public void printBounds(){
        System.out.println("==== limits ====");
        System.out.println("upper "+this.upperLimit);
        System.out.println("lower "+ this.lowerLimit);
        System.out.println("================");
    }
    // implement here the methods isGreaterThan and average
    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than "+value+"? (y/n)");
        return this.reader.nextLine().toLowerCase().equals("y");
           
    }
    public int average(int firstNumber, int secondNumber){
        return (firstNumber+secondNumber)/2;
        //rounds down by default (good)
    }
    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
