import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        String cont;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Options: ");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiply");
            System.out.println("4.Division");
            System.out.print("Operation: ");
            int operation = scan.nextInt();
            System.out.print("Enter 1st number: ");
            int a = scan.nextInt();
            System.out.print("Enter 1st number: ");
            int b = scan.nextInt();
            switch (operation) {
                case 1 -> System.out.printf("Sum: " + (a + b));
                case 2 -> System.out.print("Difference: " + (a - b));
                case 3 -> System.out.print("Product: " + (a * b));
                case 4 -> System.out.print("Quotient: " + ((double) a / (double) b));
                default -> System.out.print("ERROR");
            }
            System.out.print("\n Continue(Y/N): ");
            cont = scan.next();
        } while (cont.toLowerCase() == "y");
    }
}
