//Wap to determine whether a number is divided by 3 or 7.

package Assignment;

import java.util.Scanner;

public class Q3 {

    static String Check(int number){

        if (number % 3 != 0 && number % 7 != 0)
            return "is not divisible by 3 & 7";
        else if (number % 3 == 0 && number % 7 == 0)
            return "is divisible by 3 & 7";
        else{
            if (number % 3 == 0)
                return "is divisible by 3";
            else
                return "is divisible by 7";
        }
    }

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("The Number to be Checked: ");
        int number = scan.nextInt();

        System.out.println(number + " " +Check(number));
    }

}
