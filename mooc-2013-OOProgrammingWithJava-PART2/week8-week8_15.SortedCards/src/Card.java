public class Card implements Comparable<Card>{

    /*
     * These are static constant variables. These variables can be used inside and outside
     * of this class like, for example, Card.CLUBS
     */
    public static final int SPADES = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS = 3;
    /*
     * To make printing easier, Card-class also has string arrays for suits and values.
     * SUITS[suit] is a string representation of the suit (Clubs, Diamonds, Hearts, Spades)
     * VALUES[value] is an abbreviation of the card's value (A, J, Q, K, [2..10]).
     */
    public static final String[] SUITS = {"Spades", "Diamonds", "Hearts", "Clubs"};
    public static final String[] VALUES = {"-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private int value;
    private int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return VALUES[value] + " of " + SUITS[suit];
    }
    @Override
    public int compareTo(Card c){
        //deal with  - (assuming jacks)
        //get values - check if is a int
        //if val same check suit
        //get suit value
        
        //to avoid multiple function calls 
        int valueC = c.getValue();
        //if a jack return 0?
        if(this.value >= 1 && valueC >= 1){
            if(valueC == this.value){
                //check suit
                return this.suit - c.getSuit();
            }
            return this.value - valueC;
        }
        return 0;
    
    }

    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

}