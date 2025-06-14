import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoListForm extends JFrame {

    private JTextField nameField;
    private JTextArea descriptionArea;
    private JComboBox<String> statusCombo;
    private ToDoListViewer viewer;

    public ToDoListForm(ToDoListViewer viewer) {
        this.viewer = viewer;

        setTitle("Add New Task");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Task Name Title
        gbc.gridx = 0; gbc.gridy = 0;
        mainPanel.add(new JLabel("Task Name:"), gbc);
        // Task Name Input
        gbc.gridy = 1;
        nameField = new JTextField();
        mainPanel.add(nameField, gbc);

        // Task Description Title
        gbc.gridy = 2;
        mainPanel.add(new JLabel("Task Description:"), gbc);
        // Task Decription Input
        gbc.gridy = 3;
        descriptionArea = new JTextArea(1, 20);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(descriptionArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        mainPanel.add(scrollPane, gbc);

        // Status Title
        gbc.gridy = 4;
        mainPanel.add(new JLabel("Status:"), gbc);
        // Status Dropdown
        gbc.gridy = 5;
        statusCombo = new JComboBox<>(new String[]{"Not Started", "Ongoing", "Completed"});
        mainPanel.add(statusCombo, gbc);

        // Save Button
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        JButton saveButton = new JButton("Save Task");
        mainPanel.add(saveButton, gbc);

        add(mainPanel);

        saveButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String desc = descriptionArea.getText().trim();
            String status = (String) statusCombo.getSelectedItem();

            if (name.isEmpty() || desc.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all in Task Name and Status.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            viewer.addTask(name, desc, status);
            dispose();
        });
    }
}
