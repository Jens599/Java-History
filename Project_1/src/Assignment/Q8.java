//Write a program in java to input 5 numbers from keyboard and find their sum and average.
package Assignment;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum  = 0;

        int[] numbers = new int[5];


        for (int i = 0; i < 5; i++)
            numbers[i] = scan.nextInt();


        for (int i = 0; i < 5; i++) {
            sum = sum + numbers[i];
        }


        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/5);


    }

}
