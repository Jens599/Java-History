//Wap in java to overload the constructor.
package Assignment;

public class Q10 {

    String S;

   Q10(){
        S = "Constructor 1";
    }

    Q10(int a){
        S = "constructor 2";
    }

    void Display(){ System.out.println(S); }

    public static void main(String[] args) {

        Q10 a = new Q10();
        Q10 b = new Q10(5);

        a.Display();
        b.Display();

    }

}
