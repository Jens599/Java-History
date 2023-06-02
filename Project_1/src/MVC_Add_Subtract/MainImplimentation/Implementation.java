package MVC_Add_Subtract.MainImplimentation;

import MVC_Add_Subtract.MainEncapsulation.Encapsulation;
import MVC_Add_Subtract.MainInterface.Interface;

public class Implementation implements Interface {

    @Override
    public void Add(Encapsulation encapsulation) {
        System.out.println("Addition: " + (encapsulation.getNum1() + encapsulation.getNum2()));
    }

    @Override
    public void Subtract(Encapsulation encapsulation) {
        System.out.println("Subtraction: " + (encapsulation.getNum1() - encapsulation.getNum2()));
    }
}
