//Wap to find the multiplication table of input number
package Assignment;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Number: ");
        int in = scan.nextInt();
        for (int i = 1; i<=10;i++ ){
            System.out.println(in + " x " + i + " = " + (i*in));
        }
    }
}
