/* Write a Java Program to create a color palette.
Declare a grid of Buttons to set the color names.
Change the foreground color for field by clicking on the color
button.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorPalette {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create a JFrame
        JFrame frame = new JFrame("Color Palette");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JPanel to hold color buttons
        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new GridLayout(3, 3)); // 3x3 grid

        // Create a text field for displaying the results
        JTextField resultField = new JTextField("Check My Color");
        resultField.setHorizontalAlignment(JTextField.CENTER); //Right-align text
        Font fo = new Font("Serif", Font.BOLD, 32);
        resultField.setFont(fo);
        colorPanel.add(resultField);        
        
        // Array of color names and their corresponding Color objects
        String[] colorNames = {"Red", "Green", "Blue", "Yellow", "Orange", "Pink", "Cyan", "Magenta", "Gray"};
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.PINK, Color.CYAN, Color.MAGENTA, Color.GRAY};

        // Create color buttons and add action listeners
        for (int i = 0; i < colorNames.length; i++) {
            JButton colorButton = new JButton(colorNames[i]);
            colorButton.setBackground(colors[i]);
            colorButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Get the background color of the clicked button
                    Color bgColor = colorButton.getBackground();
                    resultField.setForeground(bgColor);
                    // Set the background color of the frame to the selected color
                    //frame.getContentPane().setBackground(bgColor);
                    
                }
            });
            colorPanel.add(colorButton);
        }

        // Add color panel to the frame
        frame.add(colorPanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}


