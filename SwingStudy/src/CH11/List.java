package CH11;

import javax.swing.*;

public class List extends JFrame {


    JList <String> l1;
    public List() {

        DefaultListModel <String> d = new DefaultListModel<>();

        d.addElement("1");
        d.addElement("2");
        d.addElement("3");
        d.addElement("4");
        d.addElement("5");
        d.addElement("6");
        d.addElement("7");
        d.addElement("8");
        d.addElement("9");
        d.addElement("10");

        l1 = new JList<>(d);
        l1.setBounds(10,10,80,180);

        add(l1);

        setLayout(null);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new List();
    }
}
