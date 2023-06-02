package CH11;

import javax.swing.*;

public class Box extends JFrame {

    JCheckBox c1,c2;

    public Box() {

        c1 = new JCheckBox("java",true);
        c1.setBounds(50,10,80,30);
        c2 = new JCheckBox("C ++");
        c2.setBounds(50,30,80,30);

        add(c1);
        add(c2);

        setLayout(null);
        setSize(250,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Box();
    }
}
