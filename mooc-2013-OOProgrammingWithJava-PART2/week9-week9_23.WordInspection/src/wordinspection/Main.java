package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here
        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        WordInspection w = new WordInspection(file);
        try{
        System.out.println(w.palindromes());
        }catch (Exception e){
            System.out.println("ex");    
        }
    }
}
