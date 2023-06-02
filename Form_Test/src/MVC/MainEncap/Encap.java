package MVC.MainEncap;

import java.util.Scanner;

public class Encap {
    private int num1;

    private int num2;

    public Encap(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    private void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    private void setNum2(int num2) {
        this.num2 = num2;
    }
}