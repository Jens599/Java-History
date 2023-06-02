import java.util.Scanner;

public class no1 {
    static int a;
    static int b;

    static int scan(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a no: ");
        return scan.nextInt();
    }

    public static void main(String[] args) {

        a = scan();
        b = scan();
        System.out.println("sum : " + (a+b));
    }
}