
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        String upLetter = letter.toUpperCase();
        if(!this.guessedLetters.contains(upLetter)){
            if(!this.word.contains(upLetter)){
                this.numberOfFaults ++;
            }
            this.guessedLetters += upLetter;
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String guessWord ="";
        for (int i = 0; i < this.word.length(); i++) {
            int indexPos = this.guessedLetters.indexOf(this.word.charAt(i));
            if(indexPos >= 0){
                guessWord += this.word.charAt(i);
            }else{
                guessWord += "_";
            }
        }
        return guessWord;
    }
}
