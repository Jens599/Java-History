package Sync;

import java.util.Scanner;

public class Customer implements Runnable{
    private Account account;
    private String name;

    public Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + " Enter amount to withdraw: ");
        int amt = scanner.nextInt();
        synchronized (account){
            if (account.isSufficientBalance(amt)){
                System.out.println(name);
                account.withdraw(amt);
            }
            else
                System.out.println("Insufficient Balance");
        }
    }
}
