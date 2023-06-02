package Sync;

public class Account {
    private int balance;
    public Account(int b) {
        this.balance = b;
    }

    public boolean isSufficientBalance(int withdraw){
        if (balance > withdraw)
            return true;
        else
            return false;
    }

    public void withdraw(int amount){
        balance = balance - amount;
        System.out.println("Withdrawn amount: " + amount);
        System.out.println("Balance: " + balance);
    }
}
