package form;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel{

    public MyLabel() {

        ImageIcon i = new ImageIcon("icon.png");
        JFrame f = new JFrame();
        JLabel label = new JLabel();

        Border b = BorderFactory.createLineBorder(Color.YELLOW);

        f.setVisible(true);
        f.setSize(1500,1000);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(new Color(0x777777));

        label.setText("Hello World");
        label.setIcon(i);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xffffff));
        label.setFont(new Font("MV Boli",Font.BOLD,200));
        label.setIconTextGap(5);
        label.setBackground(new Color(0x548695));
        label.setOpaque(true);
        label.setBorder(b);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(400,100,800,800);


        f.add(label);

    }
}
