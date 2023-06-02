//Write a program to read three numbers X, Y and Z and evaluate R given by R = Z/ (X –Y). Use exception handling to throw an exception in case division by zero is attempted.
package Assignment;


import java.util.Scanner;

public class Q18 {

    public static void main(String[] args) {
        double R;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = scan.nextInt();
        System.out.print("Input y: ");
        int y = scan.nextInt();
        System.out.print("Input z: ");
        int z = scan.nextInt();

        if ((x-y) == 0)
            throw new ArithmeticException("Cannot divide be zero");

        R = (double) z/(x-y);
        System.out.println(R);
    }


}
