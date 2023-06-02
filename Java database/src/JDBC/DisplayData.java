package JDBC;

import javax.swing.*;
public class DisplayData extends JFrame {
    public DisplayData() {
        String[][] data ={{"101","Amit","670000"},{"102","Jai","780000"},{"101","Sachin","700000"}};
        String[] column ={"Roll","Name","Email","Age","Phone"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);

        JScrollPane sp = new JScrollPane(jt);
        add(sp);
        setBounds(500,500,600,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DisplayData();
    }
}
