//write a program add until uses presses y
package com.jens;

import java.util.Scanner;

public class cw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String con;
        do {

            System.out.print("Input 1st Number: ");
            int a = scanner.nextInt();

            System.out.print("Input 2nd Number: ");
            int b = scanner.nextInt();

            System.out.println("sum: " + (a+b));

            System.out.print("Press y to Continue: ");
            con = scanner.next();
        }while (con.equalsIgnoreCase("y"));
    }
}
