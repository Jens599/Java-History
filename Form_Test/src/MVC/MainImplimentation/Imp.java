package MVC.MainImplimentation;

import MVC.MainEncap.Encap;
import MVC.MainInterface.Interf;

public class Imp implements Interf {

    @Override
    public void Add(Encap e) {
        System.out.println("Sum: " + (e.getNum1() + e.getNum2()));
    }

    @Override
    public void Subtract(Encap e) {
        System.out.println("Difference: " + (e.getNum1() - e.getNum2()));
    }

    @Override
    public void Multiply(Encap e) {
        System.out.println("Product: " + (e.getNum1() * e.getNum2()));
    }

    @Override
    public void Divide(Encap e) {
        /*double q = (double)(e.getNum1() / e.getNum2());
        System.out.println("Quotient: " + q );*/
        int x = e.getNum1();
        int y = e.getNum2();
        System.out.println("Main: " + (double) x/y);
    }

    @Override
    public void Factorial(Encap e) {
        System.out.println("Factorial of 1st number: " + calcFactorial(e.getNum1()));
        System.out.println("Factorial of 2ns number: " + calcFactorial(e.getNum2()));
    }
    public int calcFactorial(int a){
        if (!( a == 1 || a == 0))
            return a * calcFactorial(a - 1);
        else
            return 1;
    }

}
