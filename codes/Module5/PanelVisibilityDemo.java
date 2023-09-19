/* Another Sample Java swing code showing use of various GUI components and 
containers. 

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelVisibilityDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create a JFrame
        JFrame frame = new JFrame("Panel Visibility Demo");

        // Create two panels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        
        
        // Create a text area within a scroll pane
        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        // Create checkboxes
        JCheckBox checkBox1 = new JCheckBox("Checkbox 1");
        JCheckBox checkBox2 = new JCheckBox("Checkbox 2");
        
        // Create a button to toggle visibility
        JButton toggleButton = new JButton("Toggle Visibility");
        toggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Toggle the visibility of panel2
                panel2.setVisible(!panel2.isVisible());
                textArea.append("Panel 2 Visibility Toggled.\n");
            }
        });

           
        // Add components to panel1
        panel1.add(new JLabel("Panel 1"));
        panel1.add(checkBox1);
        panel1.add(checkBox2);
        panel1.add(textArea);
        panel1.add(scrollPane);
        panel1.add(toggleButton);
        
        // Add components to panel2
        panel2.add(new JLabel("Panel 2"));
        panel2.setVisible(false); // Initially, panel2 is not visible

        // Create a container for the panels
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(2, 1));
        contentPane.add(panel1);
        contentPane.add(panel2);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

