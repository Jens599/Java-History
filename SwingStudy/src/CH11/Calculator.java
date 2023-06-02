package CH11;


import javax.swing.*;
import java.util.ArrayList;


public class Calculator extends JFrame {

    JButton bOn, bOff, bAdd, bSub, bMul, bDiv, bEq, bClr, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    JTextField t;
    JLabel l;
    String Num = null;
    ArrayList<Character> signs = new ArrayList<>(50);
    ArrayList<String> numbers = new ArrayList<>(50);

    Calculator() {

        l = new JLabel("My Calculator");
        l.setBounds(10, 5, 80, 30);

        t = new JTextField();
        t.setEditable(false);
        t.setBounds(170, 40, 150, 30);

        bOn = new JButton("ON");
        bOn.setBounds(10, 40, 70, 30);
        bOn.setFocusable(false);
        bOff = new JButton("OFF");
        bOff.setBounds(90, 40, 70, 30);
        bOff.setFocusable(false);

        b1 = new JButton("1");
        b1.setBounds(10, 80, 70, 30);
        b1.setFocusable(false);
        b2 = new JButton("2");
        b2.setBounds(90, 80, 70, 30);
        b2.setFocusable(false);
        b3 = new JButton("3");
        b3.setBounds(170, 80, 70, 30);
        b3.setFocusable(false);
        bClr = new JButton("Clear");
        bClr.setBounds(250, 80, 70, 30);
        bClr.setFocusable(false);

        b4 = new JButton("4");
        b4.setBounds(10, 120, 70, 30);
        b4.setFocusable(false);
        b5 = new JButton("5");
        b5.setBounds(90, 120, 70, 30);
        b5.setFocusable(false);
        b6 = new JButton("6");
        b6.setBounds(170, 120, 70, 30);
        b6.setFocusable(false);
        bAdd = new JButton("+");
        bAdd.setBounds(250, 120, 70, 30);
        bAdd.setFocusable(false);

        b7 = new JButton("7");
        b7.setBounds(10, 160, 70, 30);
        b7.setFocusable(false);
        b8 = new JButton("8");
        b8.setBounds(90, 160, 70, 30);
        b8.setFocusable(false);
        b9 = new JButton("9");
        b9.setBounds(170, 160, 70, 30);
        b9.setFocusable(false);
        bSub = new JButton("-");
        bSub.setBounds(250, 160, 70, 30);
        bSub.setFocusable(false);

        bMul = new JButton("*");
        bMul.setBounds(10, 200, 70, 30);
        bMul.setFocusable(false);
        b0 = new JButton("0");
        b0.setBounds(90, 200, 70, 30);
        b0.setFocusable(false);
        bDiv = new JButton("/");
        bDiv.setBounds(170, 200, 70, 30);
        bDiv.setFocusable(false);
        bEq = new JButton("=");
        bEq.setBounds(250, 200, 70, 30);
        bEq.setFocusable(false);


        add(l);
        add(t);
        add(bOn);
        add(bOff);
        add(b1);
        add(b2);
        add(b3);
        add(bClr);
        add(b4);
        add(b5);
        add(b6);
        add(bAdd);
        add(b7);
        add(b8);
        add(b9);
        add(bSub);
        add(bMul);
        add(b0);
        add(bDiv);
        add(bEq);

        setBounds(750, 350, 350, 280);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void operations() {

        bOn.addActionListener((e) -> t.setText(null));

        b1.addActionListener((e) -> t.setText(t.getText() + "1"));

        b2.addActionListener((e) -> t.setText(t.getText() + "2"));

        b3.addActionListener((e) -> t.setText(t.getText() + "3"));

        bAdd.addActionListener((e) -> t.setText(t.getText() + "+"));

        bEq.addActionListener((e) -> {
            String text = t.getText();
            for (int i = 0; i < text.length(); i++) {
                char n = text.charAt(i);
                if (n == '+' || n == '-' || n == '*' || n == '/') {
                    numbers.add(Num);
                    signs.add(n);
                } else {
                    Num = Num + n;
                }
            }
        });
    }

    public static void main(String[] args) {
        Calculator s = new Calculator();
        s.operations();
    }

}
