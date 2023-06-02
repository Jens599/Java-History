package CH11;

import javax.swing.*;
import java.awt.*;

public class Flow extends JFrame {
    JButton b1,b2,b3,b4,b5;

    public Flow(){

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

        setLayout(new FlowLayout(FlowLayout.LEADING));
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Flow();
    }
}
