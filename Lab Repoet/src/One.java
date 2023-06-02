import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.println(
                (num %2 == 0 ? "The number is Even" : "The number is odd")
        );
    }
}