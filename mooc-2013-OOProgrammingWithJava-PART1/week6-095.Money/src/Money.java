
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    public Money plus(Money added){
        return new Money((this.euros+added.euros),(this.cents+added.cents));
    }
    public boolean less(Money compare){
        if(this.euros == compare.euros){
            return this.cents < compare.cents;
        }else if(this.euros > compare.euros){
            return false;
        }else{
            return true;
        }
    
    }
    public Money minus(Money minus){
        int bank = this.euros - minus.euros;
        int change = this.cents - minus.cents;
        if(bank >= 1){
            if(change < 0){
                return new Money(bank -1,100-Math.abs(change));
            }else{
                return new Money(bank,change);
            }
        }else if(bank < 0){
            return new Money(0,0);
        }else{ //euros-esuro == 0
            if(change > 0){
                return new Money(bank,change);
            }else{
                return new Money(0,0);
            }
        }
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
