package MVC;

import MVC.MainEncap.Encap;
import MVC.MainImplimentation.Imp;
import MVC.MainInterface.Interf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1st number: ");
        int n1 = scan.nextInt();
        System.out.print("2st number: ");
        int n2 = scan.nextInt();

        Encap encap = new Encap(n1, n2);
        Interf n = new Imp();
        n.Add(encap);
        n.Subtract(encap);
        n.Multiply(encap);
        n.Divide(encap);
        n.Factorial(encap);
    }
}
