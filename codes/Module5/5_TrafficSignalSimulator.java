/* Problem Statement: Write a Java Program to simulate traffic signal light
using AWT and Swing Components.

*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficSignalSimulator {
    private JFrame frame;
    private JPanel signalPanel;
    private JButton startButton;
    private int currentSignal = 0; // 0: Red, 1: Yellow, 2: Green

    public TrafficSignalSimulator() {
        frame = new JFrame("Traffic Signal Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 400);

        signalPanel = new JPanel();
        signalPanel.setLayout(new GridLayout(3, 1));
        signalPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startTrafficSignal();
            }
        });

        signalPanel.add(createLight(Color.RED));
        signalPanel.add(createLight(Color.YELLOW));
        signalPanel.add(createLight(Color.GREEN));

        frame.add(signalPanel, BorderLayout.CENTER);
        frame.add(startButton, BorderLayout.SOUTH);
    }

    private JLabel createLight(Color color) {
        JLabel light = new JLabel();
        light.setOpaque(true);
        light.setBackground(color);
        light.setPreferredSize(new Dimension(100, 100));
        light.setBorder(BorderFactory.createLineBorder(Color.black));
        return light;
    }

    private void startTrafficSignal() {
        Timer timer = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchSignal();
            }
        });
        timer.setInitialDelay(0);
        timer.start();
    }

    private void switchSignal() {
        switch (currentSignal) {
            case 0:
                signalPanel.getComponent(0).setBackground(Color.BLACK);
                signalPanel.getComponent(2).setBackground(Color.BLACK);
                signalPanel.getComponent(1).setBackground(Color.YELLOW);
                currentSignal = 1;
                break;
            case 1:
                signalPanel.getComponent(0).setBackground(Color.RED);
                signalPanel.getComponent(1).setBackground(Color.BLACK);
                signalPanel.getComponent(2).setBackground(Color.GREEN);
                currentSignal = 2;
                break;
            case 2:
                signalPanel.getComponent(1).setBackground(Color.YELLOW);
                signalPanel.getComponent(2).setBackground(Color.BLACK);
                signalPanel.getComponent(0).setBackground(Color.RED);
                currentSignal = 0;
                break;
        }
    }

    public void display() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TrafficSignalSimulator simulator = new TrafficSignalSimulator();
                simulator.display();
            }
        });
    }
}


