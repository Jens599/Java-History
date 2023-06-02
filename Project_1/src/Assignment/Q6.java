
//Wap to take input of marks obtained by a student of five subjects and calculate total marks, percentage and display result of student with division, roll number ,name, address.
package Assignment;

import javax.naming.Name;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        final int TOTAL = 500;
        final int PERCENT = 100;

        Scanner scan = new Scanner(System.in);

        String name;
        String address;
        int rollNo = 0;
        double[] marks = new double[5];
        double totalMarks = 0;
        double percentage = 0;

        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Address: ");
        address = scan.nextLine();
        System.out.print("Roll no: ");
        rollNo = scan.nextInt();

        for (int i=0; i<5; i++){
            System.out.print("Marks: ");
            marks[i] = scan.nextDouble();

        }

        for (double i: marks){
            totalMarks += i;
        }

        percentage = totalMarks / TOTAL * PERCENT;

        System.out.println("Result");
        System.out.println("------");

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Roll Number: " + rollNo);
        for (int i=0; i<5; i++) {
            System.out.println("Marks : " + marks[i]);
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);

        if (percentage < 60)
            System.out.println("Fail");
        else if (percentage < 70 && percentage >= 60)
            System.out.println("Third Division");
        else if (percentage < 80 && percentage >= 70)
            System.out.println("Second Division");
        else if (percentage < 90 && percentage >= 80)
            System.out.println("First Division");
        else if (percentage <= 100 && percentage >= 90)
            System.out.println("Distinction");
        else
            System.out.println("ERROR");

    }

}