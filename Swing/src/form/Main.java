package form;


import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        JLabel l = new JLabel();
        ImageIcon i = new ImageIcon("icon.png");


        JPanel p1 = new JPanel();
        p1.setBackground(Color.red);
        p1.setBounds(0,0,250,250);


        JPanel p2 = new JPanel();
        p2.setBackground(Color.blue);
        p2.setBounds(250,0,250,250);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.green);
        p3.setBounds(0,250,500,250);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(750,750);
        f.setVisible(true);
        
        l.setText("Hi");
        l.setBounds(0,250,250,250);
        l.setIcon(i);

        p3.add(l);

        f.add(p1);
        f.add(p2);
        f.add(p3);

    }

}
