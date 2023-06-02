package CH11;

import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {
    JButton b1,b2,b3,b4,b5;

    public Border(){
        b1 = new JButton("East");
        b1.setBackground(Color.BLACK);
        b2 = new JButton("South");
        b3 = new JButton("West");
        b4 = new JButton("North");
        b5 = new JButton("Center");

        add(b1,BorderLayout.EAST);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.WEST);
        add(b4,BorderLayout.NORTH);
        add(b5,BorderLayout.CENTER);

        setSize(420,420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Border();
    }
}
