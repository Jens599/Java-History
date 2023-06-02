package Sync;

public class Test {
    public static void main(String[] args) {
        Account a1 = new Account(10_000);
        Customer c1 = new Customer(a1,"A");
        Customer c2 = new Customer(a1,"B");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
