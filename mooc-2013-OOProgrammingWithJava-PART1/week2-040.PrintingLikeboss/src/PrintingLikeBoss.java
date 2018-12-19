public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String output = "";
        for (int i = 0; i < amount; i++) {
            output += "*";
        }
        System.out.print(output+"\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        String output = "";
        for (int i = 0; i < amount; i++) {
            output += " ";
        }
        System.out.print(output);
    }

    public static void printTriangle(int size) {
        // 40.2
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size-i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int count = 1;
        int base = (height*2); //can remove +1 and -1 everywhere if i do
        for (int i = 0; i < height; i++) {
            printWhitespaces((base - count)/2);
            printStars(count);
            count += 2;
        }
        printWhitespaces((base - 3)/2);
        printStars(3);
        printWhitespaces((base - 3)/2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
