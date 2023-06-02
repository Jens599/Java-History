package Mainimpl;

import MainEncap.Encap;
import MainInterf.Inter;

public class impl implements Inter {

    @Override
    public void add(Encap encap) {
        System.out.println("Sum: " + (encap.getNum1() + encap.getNum2()));
    }

    @Override
    public int sub(Encap encap) {
        int diff = encap.getNum1() - encap.getNum2();
        return diff;
    }
}
