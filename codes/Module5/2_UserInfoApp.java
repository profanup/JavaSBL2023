/* Problem Statement: Write a program to create a window with four text
fields for the name, street, city and pincode with suitable labels. 
Also windows contains a button MyInfo. When the user types the name, 
his street, city and pincode and then clicks the button, the types details 
must appear in Arial Font with Size 32, Italic on new frame 

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInfoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create a JFrame
        JFrame frame = new JFrame("User Information");

        // Set layout to GridLayout
        frame.setLayout(new GridLayout(5, 2));

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel streetLabel = new JLabel("Street:");
        JTextField streetField = new JTextField();
        JLabel cityLabel = new JLabel("City:");
        JTextField cityField = new JTextField();
        JLabel pincodeLabel = new JLabel("Pincode:");
        JTextField pincodeField = new JTextField();

        // Create a button
        JButton myInfoButton = new JButton("MyInfo");

        // Add action listener to the button
        myInfoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get user-entered information
                String name = nameField.getText();
                String street = streetField.getText();
                String city = cityField.getText();
                String pincode = pincodeField.getText();

                // Create a new JLabel to display the information
                JLabel infoLabel = new JLabel("<html><font face='Arial' size='32' style='font-style:italic;'>" +
                        "Name: " + name + "<br>" +
                        "Street: " + street + "<br>" +
                        "City: " + city + "<br>" +
                        "Pincode: " + pincode + "</font></html>");

                // Create a new JFrame to display the information
                JFrame infoFrame = new JFrame("My Info");
                infoFrame.add(infoLabel);
                infoFrame.setSize(400, 200);
                infoFrame.setVisible(true);
            }
        });

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(streetLabel);
        frame.add(streetField);
        frame.add(cityLabel);
        frame.add(cityField);
        frame.add(pincodeLabel);
        frame.add(pincodeField);
        frame.add(myInfoButton);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}

