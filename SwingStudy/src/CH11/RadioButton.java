package CH11;

import javax.swing.*;

public class RadioButton extends JFrame {

   JRadioButton c1,c2;

    public RadioButton() {

        c1 = new JRadioButton("Male",true);
        c1.setBounds(50,10,80,30);
        c2 = new JRadioButton("Female");
        c2.setBounds(50,30,80,30);

        ButtonGroup b = new ButtonGroup();

        b.add(c1);
        b.add(c2);

        add(c1);
        add(c2);

        setLayout(null);
        setSize(250,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButton();
    }
}
