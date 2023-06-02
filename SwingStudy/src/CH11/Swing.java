package CH11;

import javax.swing.*;
import java.awt.*;

public class Swing extends JFrame {

    JPanel p1, p2;
    JLabel l1, l2;


    public Swing() {

        p1 = new JPanel();
        p1.setBounds(0, 0, 100, 100);
        p1.setBackground(Color.cyan);

        l1 = new JLabel("Cyan Panel");
        setBounds(0, 0, 100, 30);

        p1.add(l1);

        p2 = new JPanel();
        p2.setBounds(100, 0, 100, 100);
        p2.setBackground(Color.red);

        l2 = new JLabel("Red Panel");
        setBounds(0, 0, 100, 30);

        p2.add(l2);

        add(p1);
        add(p2);

        setBounds(750, 350, 350, 350);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Swing();
    }
}
