package src.view;

import javax.swing.*;

public class SearchInformationScreen extends JFrame {
    public void displaySearchInformation(String fileName, String peerName, String algorithm, long searchTime) {
        setTitle("Search Information");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel, fileName, peerName, algorithm, searchTime);
        setVisible(true);
    }

    private void placeComponents(JPanel panel, String fileName, String peerName, String algorithm, long searchTime) {
        panel.setLayout(null);

        JLabel fileNameLabel = new JLabel("File Name");
        fileNameLabel.setBounds(10, 20, 80, 25);
        panel.add(fileNameLabel);

        JLabel fileNameValue = new JLabel(fileName);
        fileNameValue.setBounds(100, 20, 165, 25);
        panel.add(fileNameValue);

        JLabel peerNameLabel = new JLabel("Peer Name");
        peerNameLabel.setBounds(10, 50, 80, 25);
        panel.add(peerNameLabel);

        JLabel peerNameValue = new JLabel(peerName);
        peerNameValue.setBounds(100, 50, 165, 25);
        panel.add(peerNameValue);

        JLabel algorithmLabel = new JLabel("Algorithm");
        algorithmLabel.setBounds(10, 80, 80, 25);
        panel.add(algorithmLabel);

        JLabel algorithmValue = new JLabel(algorithm);
        algorithmValue.setBounds(100, 80, 165, 25);
        panel.add(algorithmValue);

        JLabel searchTimeLabel = new JLabel("Search Time");
        searchTimeLabel.setBounds(10, 110, 80, 25);
        panel.add(searchTimeLabel);

        JLabel searchTimeValue = new JLabel(searchTime + " ms");
        searchTimeValue.setBounds(100, 110, 165, 25);
        panel.add(searchTimeValue);
    }
}
