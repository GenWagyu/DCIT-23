import java.awt.*;
import java.awt.event.*;

public class LabActivity5QuizAppAWT extends Frame implements ActionListener {
    Label questionLabel;
    Label messageLabel;
    CheckboxGroup optionsGroup;
    Checkbox[] options;
    Button nextButton;

    String[] questions = {
        "What does 'CPU' stand for?",
        "Which is a commong input device for a computer?",
        "What is a program or set of programs that tells a computer what to do?"
    };

    String[][] choices = {
        {"A. Central Process Unit", "B. Computer Personal User", "C. Central Processing Unit", "D. Critical Power Unit"},
        {"A. Keyboard", "B. Printer", "C. Monitor", "D. Speaker"},
        {"A. Hardware", "B. Data", "C. Network", "D. Software"}
    };

    int[] correctAnswers = {2, 0, 3}; // index of correct answers
    int currentQuestion = 0;
    int score = 0;

    public LabActivity5QuizAppAWT() {
        setTitle("Lab Activity 5 Quiz App AWT");
        setSize(500, 300);
        setLayout(new BorderLayout());
        setResizable(false);
        setLocationRelativeTo(null); // Center the frame

        questionLabel = new Label();
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        questionLabel.setAlignment(Label.CENTER);
        add(questionLabel, BorderLayout.NORTH);

        Panel centerPanel = new Panel(new BorderLayout());

        Panel optionsPanel = new Panel(new GridLayout(2, 2));
        optionsGroup = new CheckboxGroup();
        options = new Checkbox[4];
        for (int i = 0; i < 4; i++) {
            options[i] = new Checkbox("", optionsGroup, false);
            options[i].setFont(new Font("Arial", Font.PLAIN, 14));
            options[i].setForeground(Color.BLUE);
            optionsPanel.add(options[i]);
        }
        centerPanel.add(optionsPanel, BorderLayout.CENTER);

        messageLabel = new Label("", Label.CENTER);
        messageLabel.setForeground(Color.BLACK);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        centerPanel.add(messageLabel, BorderLayout.SOUTH);

        add(centerPanel, BorderLayout.CENTER);

        nextButton = new Button("Next");
        nextButton.setFont(new Font("Arial", Font.BOLD, 14));
        nextButton.addActionListener(this);
        add(nextButton, BorderLayout.SOUTH); // Add button directly to SOUTH

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Terminate the program
            }
        });

        displayQuestion();
        setVisible(true);
    }

    public void displayQuestion() {
        messageLabel.setText("");
        if (currentQuestion < questions.length) {
            questionLabel.setText(questions[currentQuestion]);
            for (int i = 0; i < 4; i++) {
                options[i].setLabel(choices[currentQuestion][i]);
                options[i].setEnabled(true);
                options[i].setState(false);
                optionsGroup.setSelectedCheckbox(null); // Deselect all checkboxes
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        Checkbox selected = optionsGroup.getSelectedCheckbox();
        if (selected == null) {
            messageLabel.setText("Please select an answer.");
            return;
        }

        int selectedIndex = -1;
        for (int i = 0; i < options.length; i++) {
            if (options[i] == selected) {
                selectedIndex = i;
                break;
            }
        }

        if (selectedIndex == correctAnswers[currentQuestion]) {
            score++;
        }

        currentQuestion++;
        if (currentQuestion < questions.length) {
            displayQuestion();
        } else {
            showResult();
        }
    }

    public void showResult() {
        questionLabel.setText("You got " + score + " out of " + questions.length + " correct!");
        messageLabel.setText("");
        for (Checkbox option : options) {
            option.setEnabled(false);
        }
        nextButton.setEnabled(false);
    }

    public static void main(String[] args) {
        new LabActivity5QuizAppAWT();
    }
}
