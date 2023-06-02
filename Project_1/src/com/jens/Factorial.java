package com.jens;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input = ");
        int a = scan.nextInt();
        System.out.println(factorial(a));

    }
    static int factorial(int a) {

        if (a == 1)
            return 1;
        else
            return (a * factorial(a - 1));

    }

}