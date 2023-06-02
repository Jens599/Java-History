/*Write a java program that takes the user to provide a single character from the alphabet. Print Vowel of Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), print an error message.*/
package Assignment;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("The alphabet to be Checked: ");
        String  ch = String.valueOf(scan.next().charAt(0));

        switch (ch.toLowerCase()){
            case "a","e","i","o","u":
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }

}
