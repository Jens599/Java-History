package CH11;

import javax.swing.*;

public class Test{

    JFrame f;
    JLabel l1,l2;
    JButton b;
    JPasswordField p;
    JTextField t;


    public Test() {


        l1 = new JLabel("ID");
        l1.setBounds(10,50,80,30);
        t = new JTextField();
        t.setBounds(100,50,150,30);

        l2 = new JLabel("Password");
        l2.setBounds(10,100,80,30);
        p = new JPasswordField();
        p.setBounds(100,100,150,30);

        b = new JButton("Login");
        b.setBounds(125,150,70,30);

        f = new JFrame("Login");

        f.add(l1);
        f.add(t);
        f.add(l2);
        f.add(p);
        f.add(b);

        f.setBounds(750,400,350,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        Test test = new Test();

    }

}
