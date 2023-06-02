//Wap to solve the issue of instance variable hiding.
package Assignment;

public class Q13 {
    static int num1 = 12;
    static int num2 = 7;
    public static void sub(){
        System.out.println("Sub: " + (num1 - num2));
    }

    public static void main(String[] args) {
        sub();
        System.out.println(num1);
        System.out.println(num2);
    }

}

