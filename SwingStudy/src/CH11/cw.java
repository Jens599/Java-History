package CH11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cw extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField t1, t2, t3, t4, t5, t6;
    JButton b1;

    public cw() {
        l1 = new JLabel("Number 1:");
        l1.setBounds(10, 10, 80, 30);
        t1 = new JTextField();
        t1.setBounds(100, 10, 150, 30);

        l2 = new JLabel("Number 2:");
        l2.setBounds(10, 60, 80, 30);
        t2 = new JTextField();
        t2.setBounds(100, 60, 150, 30);

        l3 = new JLabel("Sum:");
        l3.setBounds(10, 110, 80, 30);
        t3 = new JTextField();
        t3.setBounds(100, 110, 150, 30);
        t3.setEditable(false);

        l4 = new JLabel("Difference:");
        l4.setBounds(10, 160, 80, 30);
        t4 = new JTextField();
        t4.setBounds(100, 160, 150, 30);
        t4.setEditable(false);

        l5 = new JLabel("Product:");
        l5.setBounds(10, 210, 80, 30);
        t5 = new JTextField();
        t5.setBounds(100, 210, 150, 30);
        t5.setEditable(false);

        l6 = new JLabel("Quotient:");
        l6.setBounds(10, 260, 80, 30);
        t6 = new JTextField();
        t6.setBounds(100, 260, 150, 30);
        t6.setEditable(false);

        b1 = new JButton("Operate");
        b1.setBounds(100, 310, 150, 30);
        b1.setFocusable(false);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(t6);
        add(b1);

        setBounds(750, 350, 350, 400);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    void operations() {

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Double num1 = Double.parseDouble(t1.getText());
                    Double num2 = Double.parseDouble(t2.getText());

                    String sum = String.valueOf(num1 + num2);
                    String difference = String.valueOf(num1 - num2);
                    String product = String.valueOf(num1 * num2);
                    String quotient = String.valueOf(num1 / num2);



                    t3.setText(sum);
                    t4.setText(difference);
                    t5.setText(product);
                    t6.setText(quotient);

                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "Please Enter Number In Text Fields.", "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Something went wrong. ", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        cw cw = new cw();
        cw.operations();
    }
}
