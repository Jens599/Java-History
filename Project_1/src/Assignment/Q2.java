
//Wap to determine whether the number is prime or composite by using function.

package Assignment;

import java.util.Scanner;

public class Q2 {

    static String PrimeComposite(int number){

        int T = 0;
        String ans;
        if (number == 0 || number == 1)
            ans = "neither prime or composite";
        else {
            for (int i = number - 1; i > 1; i--) {
                if (number % i == 0)
                    T++;
            }
            ans = T != 0 ? "Composite" : "Prime";
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("The Number to be Checked: ");
        int number = scan.nextInt();

        System.out.println(number + " is " + PrimeComposite(number));
    }
}
