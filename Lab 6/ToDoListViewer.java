import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class ToDoListViewer extends JFrame {

    private JTable taskTable;
    private DefaultTableModel tableModel;
    private ToDoListForm formWindow = null;

    public ToDoListViewer() {
        setTitle("To-Do List Viewer");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Top Panel with Add Task button
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton addTaskButton = new JButton("Add Task");
        topPanel.add(addTaskButton);

        // Table setup
        String[] columnNames = {"Task Name", "Task Description", "Status"};
        tableModel = new DefaultTableModel(columnNames, 0);
        taskTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(taskTable);

        // Add components to frame
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Event for Add Task button
        addTaskButton.addActionListener(e -> {
            if (formWindow == null || !formWindow.isDisplayable()) {
                formWindow = new ToDoListForm(this);
                formWindow.setVisible(true);
            }
        });

        setVisible(true);
    }

    public void addTask(String name, String description, String status) {
        tableModel.addRow(new Object[]{name, description, status});
    }
}
