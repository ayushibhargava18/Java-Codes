package javafile;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Javafile extends JFrame implements ActionListener {
    
    private JButton redButton, yellowButton, greenButton;
    private JLabel messageLabel;

    public Javafile() {
        setTitle("Traffic Light Simulation");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        redButton = new JButton("Red");
        yellowButton = new JButton("Yellow");
        greenButton = new JButton("Green");

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);

        messageLabel = new JLabel();
        messageLabel.setHorizontalAlignment(JLabel.CENTER);

        add(buttonPanel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "Red":
                showMessage("Stop");
                break;
            case "Yellow":
                showMessage("Ready");
                break;
            case "Green":
                showMessage("Go");
                break;
        }
    }

    private void showMessage(String message) {
        messageLabel.setText(message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Javafile trafficLight = new Javafile();
            trafficLight.setVisible(true);
        });
    }
}
