
// Wap to check whether a number is odd or even by using function

package Assignment;

import java.util.Scanner;

public class Q1 {

    String Odd_Even(int number){

        String ans = number % 2 == 0 ? "Even" : "Odd";
        return ans;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("The Number to be Checked: ");
        int number = scan.nextInt();

        Q1 q = new Q1();

        System.out.println("The number " + number + " is " + q.Odd_Even(number));

    }
}
