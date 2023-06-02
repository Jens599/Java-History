package MVC.Main;

import MVC.Encapsulation.Encapsulation;
import MVC.Implementation.Implementation;
import MVC.Interface.Interfaces;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Second Number: ");
        int num2 = scanner.nextInt();

        Encapsulation encapsulation = new Encapsulation(num1, num2);

        Interfaces e = new Implementation();

        System.out.println("Sum: " + e.add(encapsulation));
        e.sub(encapsulation);

    }
}
