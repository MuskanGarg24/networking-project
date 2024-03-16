package src.view;

import src.model.Peer;
import src.controller.PeerController;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LoginForm extends JFrame {

    // Instance variables for the input fields and the list of peers
    private JTextField usernameField;
    private JTextField ipAddressField;
    private JTextField portNumberField;
    private ArrayList<Peer> peers;
    private PeerController peerController;

    // Constructor to initialize the login form
    public LoginForm(ArrayList<Peer> peers) {
        this.peers = peers;
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
    }

    // Method to set the PeerController
    public void setPeerController(PeerController peerController) {
        this.peerController = peerController;
    }

    // Method to place the components in the login form
    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(10, 20, 80, 25);
        panel.add(usernameLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(100, 20, 165, 25);
        panel.add(usernameField);

        JLabel ipAddressLabel = new JLabel("IP Address");
        ipAddressLabel.setBounds(10, 50, 80, 25);
        panel.add(ipAddressLabel);

        ipAddressField = new JTextField(20);
        ipAddressField.setBounds(100, 50, 165, 25);
        panel.add(ipAddressField);

        JLabel portNumberLabel = new JLabel("Port Number");
        portNumberLabel.setBounds(10, 80, 80, 25);
        panel.add(portNumberLabel);

        portNumberField = new JTextField(20);
        portNumberField.setBounds(100, 80, 165, 25);
        panel.add(portNumberField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 110, 80, 25);

        // Add an action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String ipAddress = ipAddressField.getText();
                int portNumber = Integer.parseInt(portNumberField.getText());
                System.out.println("Logging in with username: " + username + ", IP address: " + ipAddress
                        + ", and port number: " + portNumber);
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
                    peerController.showSearchScreen();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            }
        });
        panel.add(loginButton);
    }
}
