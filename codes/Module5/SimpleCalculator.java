/* Problem Statement: Write a Java program to create a simple calculator 
using java AWT elements. Use a grid layout to arrange buttons for 
the digits and basic operation +, -, /, *. Add a text field to display 
the results.
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create a JFrame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

        // Create a JPanel with a GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5)); // 5 rows, 4 columns, 
        //with horizontal andvertical gaps of 5 units 

        // Create a text field for displaying the results
        JTextField resultField = new JTextField();
        resultField.setHorizontalAlignment(JTextField.RIGHT); //Right-align text
        Font fo = new Font("Serif", Font.BOLD, 32);
        resultField.setFont(fo);
        resultField.setEditable(false); // Make it non-editable
        
        // Create Clear Button
        JButton CLR_button = new JButton("CLR");
        CLR_button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if(command.equals("CLR")) resultField.setText("");
         }});
         panel.add(CLR_button);
             
        // Create buttons for digits and operations
        // Labels to be used for buttons
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
            
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    if (command.equals("=")) {
                        // Calculate the result and display it
                        try {
                            String expression = resultField.getText();
                            double result = evaluateExpression(expression);
                            resultField.setText(Double.toString(result));
                        } catch (Exception ex) {
                            resultField.setText("Error");
                        }
                    } else {
                        // Append the button's label to the text field
                        resultField.setText(resultField.getText() + command);
                    }
                }
            });
            panel.add(button);
                
        }

        // Add components to the frame
        frame.add(resultField, BorderLayout.NORTH);
        frame.add(panel);

        // Set frame properties
        frame.setVisible(true);
    }

    private static double evaluateExpression(String expression) {
        return new Calculator().evaluate(expression);
    }
}

class Calculator {
    public double evaluate(String expression) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean isDigit(int charToCheck) {
                return Character.isDigit(charToCheck);
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < expression.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (ch == '+') {
                        nextChar();
                        x += parseTerm();
                    } else if (ch == '-') {
                        nextChar();
                        x -= parseTerm();
                    } else {
                        return x;
                    }
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (ch == '*') {
                        nextChar();
                        x *= parseFactor();
                    } else if (ch == '/') {
                        nextChar();
                        x /= parseFactor();
                    } else {
                        return x;
                    }
                }
            }

            double parseFactor() {
                if (ch == '+') {
                    nextChar();
                    return parseFactor();
                }
                if (ch == '-') {
                    nextChar();
                    return -parseFactor();
                }
                double x;
                int startPos = this.pos;
                if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(expression.substring(startPos, this.pos));
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }
                return x;
            }
        }.parse();
    }
}

