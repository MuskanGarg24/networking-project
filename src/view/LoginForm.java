package src.view;

import javax.swing.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JTextField portNumberField;

    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(10, 20, 80, 25);
        panel.add(usernameLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(100, 20, 165, 25);
        panel.add(usernameField);

        JLabel portNumberLabel = new JLabel("Port Number");
        portNumberLabel.setBounds(10, 50, 80, 25);
        panel.add(portNumberLabel);

        portNumberField = new JTextField(20);
        portNumberField.setBounds(100, 50, 165, 25);
        panel.add(portNumberField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                int portNumber = Integer.parseInt(portNumberField.getText());
                boolean loggedIn = login(username, portNumber);
                if (loggedIn) {
                    JOptionPane.showMessageDialog(null, "Login successful");
                } else {
                    JOptionPane.showMessageDialog(null, "Login failed");
                }
            }
        });
        panel.add(loginButton);
    }

    private boolean login(String username, int portNumber) {
        return true;
    }
}
