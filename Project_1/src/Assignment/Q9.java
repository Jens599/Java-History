//Wap in java to overload the function.
package Assignment;

public class Q9 {

    static String example(){return "method 1";}
    static String example(int a){return "method 2";}


    public static void main(String[] args) {

        System.out.println(example());
        System.out.println(example(5));

    }

}
