package Mainclassexample;

import Encap.Stdencap;
import Impl.Stdimpl;
import Interf.Stdinterface;

import java.util.Scanner;

public class Stdmain {
    public static void main(String[] args) {
        Stdencap ss =  new Stdencap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        ss.setA(num1);
        ss.setB(num2);
        Stdinterface myobj = new Stdimpl();
        myobj.add(ss);
        System.out.println("Subtraction = "+myobj.subtract(ss));

    }
}
