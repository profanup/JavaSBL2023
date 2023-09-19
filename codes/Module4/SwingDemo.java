/*  Problem Statement: Write a Java program to implement Swing components and 
design sample interactive GUI.
*/

import javax.swing.*; // Java API for GUI Control Elements
import java.awt.*;  // Java Abstract Windowing Toolkit API
import java.awt.event.ActionEvent; //
import java.awt.event.ActionListener;

public class SwingDemo {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Demo");

        // Set the layout manager for the frame
        frame.setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Hello, Swing!");

        // Create buttons
        JButton button1 = new JButton("Show Panel");
        JButton button2 = new JButton("Hide Panel");

        // Create checkboxes
        JCheckBox checkBox1 = new JCheckBox("Checkbox 1");
        JCheckBox checkBox2 = new JCheckBox("Checkbox 2");

        // Create a text area within a scroll pane
        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add action listener to button1
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(true);
            }
        });

        // Add action listener to button2
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
            }
        });
        
        // Create a list model with some items
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("India");
        listModel.addElement("China");
        listModel.addElement("Brasil");
        listModel.addElement("Russia");

        // Create a JList with the list model
        JList<String> itemList = new JList<>(listModel);

        // Create a button to display the selected item
        JButton showButton = new JButton("Show Item");
        // Action Listener for JList
        ActionHandler = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = itemList.getSelectedValue();
                if (selectedItem != null) {
                    JOptionPane.showMessageDialog(frame, "Selected Item: " + selectedItem);
                } 
                else {
                    JOptionPane.showMessageDialog(frame, "No item selected.");
                }
            }
        }
        // Attach Listener code to button
        showButton.addActionListener(ActionHandler);

        // Create a panel to hold the JList and the button
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(itemList), BorderLayout.CENTER);
        panel.add(showButton, BorderLayout.SOUTH);
        panel.setVisible(false);
        
        // Add components to the frame
        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(scrollPane);
        frame.add(panel);
        
        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        
    }
}

