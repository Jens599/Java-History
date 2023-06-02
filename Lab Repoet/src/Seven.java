import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
