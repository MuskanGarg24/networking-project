package src.view;

import src.model.Peer;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JTextField ipAddressField;
    private JTextField portNumberField;
    private ArrayList<Peer> peers;

    public LoginForm(ArrayList<Peer> peers) {
        this.peers = peers;
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

        JLabel ipAddressLabel = new JLabel("IP Address");
        ipAddressLabel.setBounds(10, 20, 80, 25);
        panel.add(ipAddressLabel);

        ipAddressField = new JTextField(20);
        ipAddressField.setBounds(100, 20, 165, 25);
        panel.add(ipAddressField);

        JLabel portNumberLabel = new JLabel("Port Number");
        portNumberLabel.setBounds(10, 20, 80, 25);
        panel.add(portNumberLabel);

        portNumberField = new JTextField(20);
        portNumberField.setBounds(100, 20, 165, 25);
        panel.add(portNumberField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String ipAddress = ipAddressField.getText();
                int portNumber = Integer.parseInt(portNumberField.getText());
                System.out.println(username + " " + ipAddress + " " + portNumber);
                // check if the provided credentials are valid
                boolean isLoggedIn = false;
                for (Peer peer : peers) {
                    if (peer.getUsername().equals(username) && peer.getIpAddress().equals(ipAddress)
                            && peer.getPortNumber() == portNumber) {
                        isLoggedIn = true;
                        break;
                    }
                }
                if (isLoggedIn) {
                    JOptionPane.showMessageDialog(null, "Login successful");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            }
        });
        panel.add(loginButton);
    }
}
