package CH11;

import javax.swing.*;

public class OptionPane extends JFrame {
    JOptionPane f;
    public OptionPane() {
        f = new JOptionPane();
        JOptionPane.showMessageDialog(f,"Hello");
    }

    public static void main(String[] args) {
        new OptionPane();
    }
}
