
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000.00;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        double lunch = 2.50;
        if(cashGiven - lunch >= 0){
            this.economicalSold ++;
            this.cashInRegister += lunch;
            return cashGiven - lunch;
        }        
        return cashGiven;
    }
    public boolean payEconomical(LyyraCard card){
        boolean suc = card.pay(2.50);
        if(suc){
            this.economicalSold ++;
        }
        return suc;
    }

    public double payGourmet(double cashGiven) {
        double lunch = 4.00;
        if(cashGiven - lunch >= 0){
            this.gourmetSold ++;
            this.cashInRegister += lunch;
            return cashGiven - lunch;
        }
        return cashGiven;
    }
    public boolean payGourmet(LyyraCard card){
        boolean suc = card.pay(4.00);
        if(suc){
            this.gourmetSold ++;
        }
        return suc;
    }
    public void loadMoneyToCard(LyyraCard card, double amount){
        if(amount > 0.0){
            card.loadMoney(amount);
            this.cashInRegister += amount;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
