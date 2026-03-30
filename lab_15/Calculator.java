package lab_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private String operator;
    private double num1, num2, result;

    public Calculator() {
        setTitle("Калькулятор");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        getContentPane().setBackground(Color.LIGHT_GRAY);
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 35));
        display.setBackground(Color.WHITE);
        display.setBorder(BorderFactory.createLineBorder(Color.GRAY, 10));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5, 1, 1));
        panel.setBackground(Color.LIGHT_GRAY);


        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        for (String text : buttons) {
            RoundedButton button = new RoundedButton(text);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class RoundedButton extends JButton {
        private int radius = 0;

        public RoundedButton(String text) {
            super(text);
            setFont(new Font("Arial", Font.PLAIN, 18));
            setFocusPainted(false);
            setContentAreaFilled(false);
            setBorderPainted(false);
            addActionListener(Calculator.this);
        }

        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
            super.paintComponent(g);
        }

        @Override
        protected void paintBorder(Graphics g) {
            g.setColor(Color.GRAY);
            g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, radius, radius);
        }
    }

    private boolean allowNegativeInput = true;
    private boolean isResultDisplayed = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "=":
                if (num1 == 0 && display.getText().isEmpty()) {
                    return;
                }
                if (isResultDisplayed) {
                    return;
                }
                try {
                    if (!display.getText().isEmpty()) {
                        num2 = Double.parseDouble(display.getText());
                    }
                    calculate();
                    if (Double.isNaN(result)) {
                        display.setText("Ошибка");
                        Timer timer = new Timer(1000, evt -> display.setText(""));
                        timer.setRepeats(false);
                        timer.start();
                    } else {
                        if (result % 1 == 0) {
                            BigDecimal result_double = BigDecimal.valueOf(result);
                            BigInteger result_int = result_double.toBigInteger();
                            display.setText(String.valueOf(result_int));
                        } else {
                            display.setText(String.valueOf(result));
                        }
                        num1 = result;
                        isResultDisplayed = true;
                    }
                } catch (NumberFormatException ex) {
                    display.setText("Ошибка");
                    Timer timer = new Timer(1000, evt -> display.setText(""));
                    timer.setRepeats(false);
                    timer.start();
                }
                break;
            case "C":
                display.setText("");
                num1 = num2 = result = 0;
                allowNegativeInput = true;
                isResultDisplayed = false;
                break;
            default:
                handleInput(command);
                break;
        }
    }

    private void handleInput(String command) {
        String currentText = display.getText();

        if (currentText.length() >= 5 && !"+-*/".contains(command)) {
            return;
        }

        if (command.equals(".")) {
            if (currentText.contains(".")) {
                return;
            }
        }

        if (command.equals("-") && allowNegativeInput) {
            if (currentText.isEmpty()) {
                display.setText("-");
                allowNegativeInput = false;
                return;
            } else if ("+-*/".contains(currentText.substring(currentText.length() - 1))) {
                display.setText(currentText + command);
                return;
            }
        }

        if ("+-*/".contains(command)) {
            if (currentText.isEmpty()) {
                return;
            } else if ("+-*/".contains(currentText.substring(currentText.length() - 1))) {
                return;
            }
            num1 = Double.parseDouble(currentText);
            operator = command;
            display.setText("");
            allowNegativeInput = true;
            isResultDisplayed = false;
        } else {
            if (isResultDisplayed) {
                display.setText("");
                isResultDisplayed = false;
            }
            display.setText(currentText + command);
        }
    }

    private void calculate() {
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    result = Double.NaN;
                }
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }
}
