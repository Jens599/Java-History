package CH11;

import javax.swing.*;

public class ComboBox extends JFrame {
    JComboBox<String> c1;
    public ComboBox() {
        String[] country={"Nepal","USA","India","Japan"};
        c1 = new JComboBox<>(country);
        c1.setBounds(50,10,80,30);

        add(c1);

        setLayout(null);
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}
