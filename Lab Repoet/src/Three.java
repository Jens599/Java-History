import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println(num + " is divisible by " + isDevisible(num));
    }

    private static String isDevisible(int num) {
        String result = "";
        if (num % 3 != 0 && num % 7 != 0) {
            result = "neither 3 or 7";
        } else if (num % 3 == 0 && num % 7 == 0) {
            result = "both 3 & 7";
        } else {
            if (num % 7 == 0) {
                result = "7";
            }
            if (num % 3 == 0) {
                result = "3";
            }
        }
        return result;
    }
}
