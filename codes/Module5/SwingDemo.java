/* Problem Statement: Write a Java program to implement Swing components namely Buttons, JLabels, 
Checkboxes, JScrollPane, JList, Scroll pane to design interactive GUI (Graphical 
User Interface).

*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Create checkboxes
        JCheckBox checkBox1 = new JCheckBox("Checkbox 1");
        JCheckBox checkBox2 = new JCheckBox("Checkbox 2");

        // Create a text area within a scroll pane
        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add action listener to button1
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("Button 1 clicked\n");
            }
        });

        // Add action listener to button2
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("Button 2 clicked\n");
            }
        });
        
        // Create a list model with some items
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");
        listModel.addElement("Item 4");

        // Create a JList with the list model
        JList<String> itemList = new JList<>(listModel);

        // Create a button to display the selected item
        JButton showButton = new JButton("Show Selected Item");
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = itemList.getSelectedValue();
                if (selectedItems != null) {
                    JOptionPane.showMessageDialog(frame, "Selected Item: " + selectedItem);
                } else {
                    JOptionPane.showMessageDialog(frame, "No item selected.");
                }
            }
        });
        

        // Add components to the frame
        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(scrollPane);
        frame.add(itemList);
        frame.add(showButton);
        
        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

