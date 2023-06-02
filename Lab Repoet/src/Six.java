import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] marks = new double[5];
        System.out.print("Enter Name: ");
        String name = scan.next();
        System.out.print("Enter Roll-No: ");
        int roll = scan.nextInt();
        System.out.print("Enter Address: ");
        String address = scan.next();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = scan.nextDouble();
        }

        double total = totalMarks(marks);
        double percentage = total * 0.2;

        System.out.println("Name: " + name);
        System.out.println("Roll-No: " + roll);
        System.out.println("Address: " + address);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.printf("Division: " + division(percentage));
    }

    private static String division(double percentage) {
        String division;
        if (percentage > 59) division = "First Division";
        else if (percentage > 49) division = "Second Division";
        else if (percentage > 39) division = "Third Division";
        else division = "Failed";
        return division;
    }

    private static double totalMarks(double[] marks) {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        return sum;
    }
}
