package JDBC;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class login extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    public login() {

        l1 = new JLabel("Roll No: ");
        t1 = new JTextField();

        l2 = new JLabel("Name: ");
        t2 = new JTextField();

        l3 = new JLabel("E-mail: ");
        t3 = new JTextField();

        l4 = new JLabel("Age: ");
        t4 = new JTextField();

        l5 = new JLabel("Phone: ");
        t5 = new JTextField();

        b1 = new JButton("Insert");
        b1.setSize(50,30);
        b2 = new JButton("Delete");
        b2.setSize(50,30);
        b3 = new JButton("Display");
        b3.setSize(50,30);

        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(l4);add(t4);
        add(l5);add(t5);
        add(b1);add(b2);
        add(b3);

        b1.addActionListener((e -> {
            int roll = Integer.parseInt(t1.getText());
            String name = t2.getText();
            String email = t3.getText();
            int age = Integer.parseInt(t4.getText());
            long phone = Integer.parseInt(t5.getText());
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");

                Statement st= conn.createStatement();

                st.executeUpdate("Insert into info values (" + roll + ",'" + name + "','" + email + "'," + age + "," + phone + ")");

                JOptionPane.showMessageDialog(b1,"Data Inserted");

                conn.close();
            }
            catch (Exception ex) {

                JOptionPane.showMessageDialog(b1,"Error: " + ex);

            }

        }));

        b2.addActionListener((e -> {
            int roll = Integer.parseInt(t1.getText());
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");

                Statement st= conn.createStatement();

                st.executeUpdate("Delete from info where RollNo = " + roll);

                JOptionPane.showMessageDialog(b2,"Data Deleted");

                conn.close();
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(b2,"Error: " + ex);
            }

        }));

        b3.addActionListener(e -> {
            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");

                Statement st= conn.createStatement();

                ResultSet rs = st.executeQuery("Select * from info");

                while (rs.next()){
                    int roll = rs.getInt("RollNo");
                    String name = rs.getString("Name");
                    String email = rs.getString("Email");
                    int age = rs.getInt("Age");
                    long  phone = rs.getLong("Phone");
                    System.out.println(roll + "\t" +  name + "\t" + email + "\t" + age + "\t" + phone);
                }


                conn.close();
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(b1,"Error: " + ex);
            }

        });

        setLayout(new GridLayout(7,3,10,10));
        setBounds(500,500,600,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new login();
    }
}
