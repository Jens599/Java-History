import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    // Create all the buttons and text field
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMultiply = new JButton("*");
    JButton buttonDivide = new JButton("/");
    JButton buttonClear = new JButton("Clear");
    JTextField displayField = new JTextField();

    // Create a container to hold the buttons and text field
    Container container = getContentPane();

    // Create a double to store the result of the calculation
    double result;

    // Create a string to store the operator
    String operator = "";

    // Create a boolean to store the status of the decimal point
    boolean pointClicked = false;

    public Calculator() {
        // Set the layout of the container to GridLayout
        container.setLayout(new GridLayout(5, 3));

        // Set the display field to be uneditable
        displayField.setEditable(false);

        // Add all the buttons and text field to the container
        container.add(button7);
        container.add(button8);
        container.add(button9);
        container.add(buttonDivide);
        container.add(button4);
        container.add(button5);
        container.add(button6);
        container.add(buttonMultiply);
        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(buttonMinus);
        container.add(button0);
        container.add(buttonPoint);
        container.add(buttonEqual);
        container.add(buttonPlus);
        container.add(buttonClear);
        container.add(displayField);

        // Add action listeners to all the buttons
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonPoint.addActionListener(this);

        buttonEqual.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonClear.addActionListener(this);

        // Set the size of the frame and make it visible
        setSize(300, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the source of the action
        Object source = e.getSource();

        // If a number button is clicked, append the number to the display field
        if (source == button0) {
            displayField.setText(displayField.getText() + "0");
        } else if (source == button1) {
            displayField.setText(displayField.getText() + "1");
        } else if (source == button2) {
            displayField.setText(displayField.getText() + "2");
        } else if (source == button3) {
            displayField.setText(displayField.getText() + "3");
        } else if (source == button4) {
            displayField.setText(displayField.getText() + "4");
        } else if (source == button5) {
            displayField.setText(displayField.getText() + "5");
        } else if (source == button6) {
            displayField.setText(displayField.getText() + "6");
        } else if (source == button7) {
            displayField.setText(displayField.getText() + "7");
        } else if (source == button8) {
            displayField.setText(displayField.getText() + "8");
        } else if (source == button9) {
            displayField.setText(displayField.getText() + "9");
        }

        // If the decimal point button is clicked, append the decimal point to the display field
        // and set the pointClicked flag to true
        if (source == buttonPoint) {
            if (!pointClicked) {
                displayField.setText(displayField.getText() + ".");
                pointClicked = true;
            }
        }

        // If an operator button is clicked, store the operator and the result
        if (source == buttonPlus) {
            result = Double.parseDouble(displayField.getText());
            operator = "+";
            displayField.setText("");
            pointClicked = false;
        } else if (source == buttonMinus) {
            result = Double.parseDouble(displayField.getText());
            operator = "-";
            displayField.setText("");
            pointClicked = false;
        } else if (source == buttonMultiply) {
            result = Double.parseDouble(displayField.getText());
            operator = "*";
            displayField.setText("");
            pointClicked = false;
        } else if (source == buttonDivide) {
            result = Double.parseDouble(displayField.getText());
            operator = "/";
            displayField.setText("");
            pointClicked = false;
        }

        // If the clear button is clicked, clear the display field and reset the pointClicked flag
        if (source == buttonClear) {
            displayField.setText("");
            pointClicked = false;
        }

        // If the equal button is clicked, perform the calculation and display the result
        if (source == buttonEqual) {
            double secondOperand = Double.parseDouble(displayField.getText());
            if (operator == "+") {
                result += secondOperand;
            } else if (operator == "-") {
                result -= secondOperand;
            } else if (operator == "*") {
                result *= secondOperand;
            } else if (operator == "/") {
                result /= secondOperand;
            }
            displayField.setText(String.valueOf(result));
            pointClicked = false;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setTitle("Calculator");
        calc.setSize(300, 300);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}
