package CH11;

import javax.swing.*;
import java.awt.*;

public class Q1 extends JFrame {

    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2;

    public Q1(){

        l1 = new JLabel("ID");
        l1.setBounds(10,10,80,30);
        t1 = new JTextField();
        t1.setBounds(100,10,150,30);

        l2 = new JLabel("Name");
        l2.setBounds(10,60,80,30);
        t2 = new JTextField();
        t2.setBounds(100,60,150,30);

        l3 = new JLabel("Email");
        l3.setBounds(10,110,80,30);
        t3 = new JTextField();
        t3.setBounds(100,110,150,30);

        l4 = new JLabel("Age");
        l4.setBounds(10,160,80,30);
        t4 = new JTextField();
        t4.setBounds(100,160,150,30);

        l5 = new JLabel("Phone");
        l5.setBounds(10,210,80,30);
        t5 = new JTextField();
        t5.setBounds(100,210,150,30);

        b1 = new JButton("Insert");
        b1.setBounds(150,260,70,30);
        b2 = new JButton("Delete");
        b2.setBounds(240,260,70,30);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(b1);
        add(b2);

        setBounds(750,350,350,350);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
    }

}
