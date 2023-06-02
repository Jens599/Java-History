package MVC.Implementation;


import MVC.Encapsulation.Encapsulation;
import MVC.Interface.Interfaces;

public class Implementation implements Interfaces {
    @Override
    public int add(Encapsulation encapsulation) {

        int sum = encapsulation.getNum1() + encapsulation.getNum2();
        return sum;
    }

    @Override
    public void sub(Encapsulation encapsulation) {

        System.out.println("Difference: " + (encapsulation.getNum1() - encapsulation.getNum2()));

    }
}
