package MainClass;

import MainEncap.Encap;
import MainInterf.Inter;
import Mainimpl.impl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Encap en = new Encap();

        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();
        en.setNum1(num1);

        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();
        en.setNum2(num2);

        Inter ob = new impl();

        ob.add(en);
        System.out.println("Difference: " + ob.sub(en));

    }
}
