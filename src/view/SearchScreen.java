package src.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SearchScreen extends JFrame {

    // Instance variable for the file name field and the search information table
    private JTextField fileNameField;
    private JTable searchInfoTable;

    // Constructor to initialize the search screen
    public SearchScreen() {
        setTitle("Search Screen");
        setSize(500, 300); // Adjusted size for accommodating two tabs
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel searchPanel = new JPanel();
        placeSearchComponents(searchPanel);
        tabbedPane.addTab("Search", searchPanel);
        JPanel searchInfoPanel = new JPanel();
        placeSearchInfoComponents(searchInfoPanel);
        tabbedPane.addTab("Search Information", searchInfoPanel);
        getContentPane().add(tabbedPane);
        setVisible(true);
    }

    // Method to place the components in the search screen
    private void placeSearchComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel fileNameLabel = new JLabel("File Name");
        fileNameLabel.setBounds(10, 20, 80, 25);
        panel.add(fileNameLabel);

        fileNameField = new JTextField(20);
        fileNameField.setBounds(100, 20, 165, 25);
        panel.add(fileNameField);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(10, 50, 80, 25);

        // Add action listener to the search button
        searchButton.addActionListener(e -> {
            String fileName = fileNameField.getText();
            search(fileName);
        });
        panel.add(searchButton);
    }

    // Method to place the components in the search information panel
    private void placeSearchInfoComponents(JPanel panel) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        String[] columnNames = { "Filename", "Available Peer", "Search Technique", "Time Taken" };
        Object[][] data = {};

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        searchInfoTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(searchInfoTable);
        panel.add(scrollPane);
    }

    // Method to perform search functionality
    private void search(String fileName) {
        // Perform search functionality here, such as storing search information
        // For demonstration purposes, let's add dummy data to the table
        DefaultTableModel model = (DefaultTableModel) searchInfoTable.getModel();
        model.addRow(new Object[] { "file.txt", 5, "Linear Search", "2 seconds" });
    }
}
