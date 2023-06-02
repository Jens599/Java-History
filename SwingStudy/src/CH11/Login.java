package CH11;

import javax.swing.*;

public class Login extends JFrame{

    JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1;

    public Login() {

        l1 = new JLabel("Username:");
        l1.setBounds(10,10,80,30);
        t1 = new JTextField();
        t1.setBounds(100,10,150,30);

        l2 = new JLabel("Password:");
        l2.setBounds(10,50,80,30);
        p1 = new JPasswordField();
        p1.setBounds(100,50,150,30);

        b1 = new JButton("Login");
        b1.setBounds(120,110,80,30);


        add(l1);
        add(t1);
        add(l2);
        add(p1);
        add(b1);

        setLayout(null);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
