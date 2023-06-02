package MVC_Add_Subtract.Mainclass;

import MVC_Add_Subtract.MainEncapsulation.Encapsulation;
import MVC_Add_Subtract.MainImplimentation.Implementation;
import MVC_Add_Subtract.MainInterface.Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Encapsulation encapsulation = new Encapsulation();

        System.out.println("1st Number: ");
        int num1 = scan.nextInt();
        encapsulation.setNum1(num1);

        System.out.println("2st Number: ");
        int num2 = scan.nextInt();
        encapsulation.setNum2(num2);

        Interface O = new Implementation();
        O.Add(encapsulation);
        O.Subtract(encapsulation);
    }
}
