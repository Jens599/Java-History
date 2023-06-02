import javax.swing.*;
import java.sql.*;

public class Form extends JFrame {
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JPasswordField t3;
    JButton b1,b2,b3,b4;
    public Form() {
        l1 = new JLabel("ID");
        l1.setBounds(10,10,80,30);
        t1 = new JTextField();
        t1.setBounds(100,10,150,30);

        l2 = new JLabel("Username");
        l2.setBounds(10,60,80,30);
        t2 = new JTextField();
        t2.setBounds(100,60,150,30);

        l3 = new JLabel("Password");
        l3.setBounds(10,110,80,30);
        t3 = new JPasswordField();
        t3.setBounds(100,110,150,30);

        b1 = new JButton("Insert");
        b1.setBounds(10,170,75,30);
        b2 = new JButton("Delete");
        b2.setBounds(95,170,75,30);

        b3 = new JButton("Update");
        b3.setBounds(10,220,75,30);
        b4 = new JButton("Display");
        b4.setBounds(95,220,75,30);


        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(b1);add(b2);
        add(b3);add(b4);

        b1.addActionListener((e)->{
            int id = Integer.parseInt(t1.getText());
            String username = t2.getText();
            String password = t3.getText();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java","root","");

                Statement st = conn.createStatement();

                st.executeUpdate("INSERT INTO form VALUES (" + id + ",'" + username + "','" + password + "');");

                JOptionPane.showMessageDialog(b1,"Inserted Into database");
                conn.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(b1,"Error: " + ex);
            }
        });

        b2.addActionListener((e) -> {

            int id = Integer.parseInt(t1.getText());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java","root","");

                Statement st = conn.createStatement();

                st.executeUpdate("DELETE FROM form where ID =" + id + ";");

                JOptionPane.showMessageDialog(b1,"Data Deleted");

                conn.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(b1,"Error: " + ex);
            }
        } );

        b3.addActionListener((e)->{
            int id = Integer.parseInt(t1.getText());
            String username = t2.getText();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java","root","");

                Statement st = conn.createStatement();

                st.executeUpdate("UPDATE form set username = '" + username + "' where id = " + id +"; ");

                JOptionPane.showMessageDialog(b1,"Data Updated");

                conn.close();
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(b1,"Error: " + ex);
            }
        });

        b4.addActionListener((e -> {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java","root","");

                Statement st = conn.createStatement();

                ResultSet rs = st.executeQuery("select * from form;");

                System.out.println("Id\tUN\tPass");

                while (rs.next()){
                    System.out.println(rs.getInt("ID") + "\t" + rs.getString("Username") + "\t" + rs.getString("Password"));
                }

                conn.close();
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(b1,"Error: " + ex);
            }
        }));

        setBounds(500,500,420,420);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Form();
    }
}