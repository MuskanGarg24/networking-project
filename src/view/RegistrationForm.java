package src.view;

import javax.swing.*;
import src.model.Peer;
import java.awt.event.*;
import java.util.ArrayList;

public class RegistrationForm extends JFrame {
    private JTextField usernameField;
    private JTextField ipAddressField;
    private JTextField portNumberField;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(300, 200);
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

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(10, 110, 80, 25);
        registerButton.addActionListener(new ActionListener() {
            ArrayList<Peer> peers = new ArrayList<>();

            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String ipAddress = ipAddressField.getText();
                int portNumber = Integer.parseInt(portNumberField.getText());

                // Create a new Peer object
                Peer peer = new Peer(username, ipAddress, portNumber);
                peers.add(peer);
                dispose();
            }
        });
        panel.add(registerButton);
    }
}
