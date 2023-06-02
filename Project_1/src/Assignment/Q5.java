
//Wap to make a calculator as follows: 1. Add 2. Subtraction 3. Multiply 4. Division User should get display like above and if user press any of them then respective operation should be calculated until user press y or Y.

package Assignment;

import java.util.Scanner;

public class Q5 {

    static String Calc(int choice, int num1, int num2) {

        switch (choice){
            case 1: return String.valueOf(num1 + num2);
            case 2: return String.valueOf(num1 - num2);
            case 3: return String.valueOf(num1 * num2);
            case 4: return String.valueOf(num1 / num2);
            default:return "invalid input";
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String exit;
        int num1 , num2;

        do {
            System.out.print("The 1st Number: ");
            num1 = scan.nextInt();
            System.out.print("The 2st Number: ");
            num2 = scan.nextInt();
            System.out.println("OPTIONS");
            System.out.println("-------");
            System.out.println("1.Add\n2.Subtraction\n3.Multiply\n4.Division");
            System.out.print(": ");
            int choice = scan.nextInt();

            System.out.println("Answer: " + Calc(choice,num1,num2));

            System.out.print("EXIT (Y/N): ");
            exit = String.valueOf(scan.next().charAt(0));

        }while (exit.toLowerCase() == "y");


    }

}
