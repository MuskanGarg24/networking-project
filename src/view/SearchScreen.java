package src.view;

import javax.swing.*;
import java.awt.event.*;

public class SearchScreen extends JFrame {
    private JTextField fileNameField;

    public SearchScreen() {
        setTitle("Search Screen");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);
        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel fileNameLabel = new JLabel("File Name");
        fileNameLabel.setBounds(10, 20, 80, 25);
        panel.add(fileNameLabel);

        fileNameField = new JTextField(20);
        fileNameField.setBounds(100, 20, 165, 25);
        panel.add(fileNameField);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(10, 50, 80, 25);
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fileName = fileNameField.getText();
                search(fileName);
            }
        });
        panel.add(searchButton);
    }

    private void search(String fileName) {
        JOptionPane.showMessageDialog(null, "Searching for " + fileName);
    }
}
