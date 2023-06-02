package form;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(){
        this.setTitle("DRIVE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);

        ImageIcon i = new ImageIcon("icon.png");
        this.setIconImage(i.getImage());
        this.getContentPane().setBackground(new Color(0xffffff));
    }
}
