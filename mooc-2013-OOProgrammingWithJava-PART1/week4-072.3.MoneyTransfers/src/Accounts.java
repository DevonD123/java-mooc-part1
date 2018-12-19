
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account A = new Account("A",100.0);
        Account B = new Account("B",0.0);
        Account C = new Account("C",0.0);
        
        double trans1 = 50.0;
        double trans2 = 25.0;
        
        transfer(A,B,trans1);
        transfer(B,C,trans2);
    }
    public static void transfer(Account from, Account to,double amount ){
        from.withdrawal(amount);
        to.deposit(amount);
    }

}
