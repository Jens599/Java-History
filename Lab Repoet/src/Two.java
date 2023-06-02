import java.util.Scanner;

public class Two {

    static String Prime_Composite(int num) {
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                count += 1;
        }
        if (count != 1)
            return "Composite";
        else
            return "prime";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.printf(Prime_Composite(num));
    }
}