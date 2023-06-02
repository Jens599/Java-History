package com.jens;

import java.util.Scanner;

public class Console {

    private static Scanner scan = new Scanner(System.in);

    public static double getInput(String prompt){
        return scan.nextDouble();
    }
    public static double getInput(String prompt, int min, int max) {

        double input;
        while (true) {
            System.out.print(prompt + ": ");
            input = scan.nextDouble();
            if (input >= min && input <= max)
                break;
            System.out.println("Please enter a value between " + min + " and " + max + " for " + prompt);
        }
        return input;
    }
}
