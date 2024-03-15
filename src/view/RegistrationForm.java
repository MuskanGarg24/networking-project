package src.view;

import javax.swing.*;
import src.model.Peer;
import java.awt.event.*;
import java.util.ArrayList;

public class RegistrationForm extends JFrame {
    private JTextField[] usernameFields;
    private JTextField[] ipAddressFields;
    private JTextField[] portNumberFields;
    private JTextField[] fileFields;
    private int numberOfNodes;
    public ArrayList<Peer> peers;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Take input for the number of nodes
        numberOfNodes = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of nodes: "));
        peers = new ArrayList<>(numberOfNodes);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        usernameFields = new JTextField[numberOfNodes];
        ipAddressFields = new JTextField[numberOfNodes];
        portNumberFields = new JTextField[numberOfNodes];
        fileFields = new JTextField[numberOfNodes];

        // Dynamically create input fields for each node
        for (int i = 0; i < numberOfNodes; i++) {
            JLabel usernameLabel = new JLabel("Username for Node " + (i + 1));
            usernameLabel.setBounds(10, 20 + i * 100, 120, 25);
            panel.add(usernameLabel);

            usernameFields[i] = new JTextField(20);
            usernameFields[i].setBounds(140, 20 + i * 100, 165, 25);
            panel.add(usernameFields[i]);

            JLabel ipAddressLabel = new JLabel("IP Address for Node " + (i + 1));
            ipAddressLabel.setBounds(10, 50 + i * 100, 120, 25);
            panel.add(ipAddressLabel);

            ipAddressFields[i] = new JTextField(20);
            ipAddressFields[i].setBounds(140, 50 + i * 100, 165, 25);
            panel.add(ipAddressFields[i]);

            JLabel portNumberLabel = new JLabel("Port Number for Node " + (i + 1));
            portNumberLabel.setBounds(10, 80 + i * 100, 120, 25);
            panel.add(portNumberLabel);

            portNumberFields[i] = new JTextField(20);
            portNumberFields[i].setBounds(140, 80 + i * 100, 165, 25);
            panel.add(portNumberFields[i]);

            JLabel fileLabel = new JLabel("File for Node " + (i + 1));
            fileLabel.setBounds(10, 110 + i * 100, 120, 25);
            panel.add(fileLabel);

            fileFields[i] = new JTextField(20);
            fileFields[i].setBounds(140, 110 + i * 100, 165, 25);
            panel.add(fileFields[i]);
        }

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(10, 140 + (numberOfNodes - 1) * 100, 100, 25);
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Register button clicked");
                // Iterate through input fields for each node and create Peer objects
                for (int i = 0; i < numberOfNodes; i++) {
                    String username = usernameFields[i].getText();
                    String ipAddress = ipAddressFields[i].getText();
                    int portNumber = Integer.parseInt(portNumberFields[i].getText());
                    String file = fileFields[i].getText();

                    // Create a new Peer object for each node
                    Peer peer = new Peer(username, ipAddress, portNumber, file);
                    peers.add(peer);
                }

                // Output the ArrayList of Peer objects
                for (Peer peer : peers) {
                    System.out.println(peer);
                }
                dispose();
            }
        });
        panel.add(registerButton);
    }

    // Getter for the ArrayList of Peer objects
    public ArrayList<Peer> getPeers() {
        return peers;
    }
}
