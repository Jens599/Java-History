package Impl;
import Encap.Stdencap;
import Interf.*;
public class Stdimpl implements Stdinterface{

    @Override
    public void add(Stdencap e1) {
        int sum;
        sum = e1.getA()+e1.getB();
        System.out.println("Addition = "+sum);
    }

    @Override
    public int subtract(Stdencap e1) {
        int diff;
        diff = e1.getA()-e1.getB();
        return diff;
    }
}
