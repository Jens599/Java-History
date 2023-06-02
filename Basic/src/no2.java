import java.util.Scanner;

public class no2 {

    int num1,num2;
    public no2(int  a,int b) {
        num1 = a;
        num2 = b;
    }

    static int scan(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a no: ");
        return scan.nextInt();
    }

    public static void main(String[] args) {

        no2 o = new no2(scan(),scan());
        o.display();

    }

    private void display() {
        System.out.println("sum : " + (num1+num2));
    }
}
