import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.ArrayList;

public class FinalLabProjectCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private JTextArea history;
    private String currentInput = "";
    private String lastOperator = "";
    private double result = 0;
    private boolean startNew = true;
    private JPanel buttonPanel;
    private JLabel backgroundLabel;
    private ArrayList<JButton> allButtons = new ArrayList<>();

    private final HashMap<String, String> gifTriggers = new HashMap<>() {{
        put("376006", "Google.gif");
        put("707", "LoL.gif");
        put("8008", "Boobs.gif");
        put("80085", "Boobs.gif");
        put("58008", "Boobs.gif");
        put("5318008", "Boobs.gif");
        put("338", "Bee.gif");
        put("833", "Bee.gif");
        put("666", "Hell.gif");
        put("0.7734", "Hello.gif");
    }};

    public FinalLabProjectCalculator() {
        setTitle("Calculator");
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        backgroundLabel = new JLabel();
        backgroundLabel.setLayout(new BorderLayout());
        backgroundLabel.setOpaque(true);
        backgroundLabel.setBackground(Color.decode("#202020"));
        add(backgroundLabel);

        JPanel displayPanel = new JPanel(new BorderLayout());
        displayPanel.setOpaque(false);

        history = new JTextArea();
        history.setEditable(false);
        history.setFont(new Font("Arial", Font.PLAIN, 12));
        history.setForeground(Color.WHITE);
        history.setBackground(Color.decode("#202020"));

        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setBackground(Color.decode("#202020"));
        display.setForeground(Color.WHITE);
        display.setHorizontalAlignment(JTextField.RIGHT);

        displayPanel.add(new JScrollPane(history), BorderLayout.NORTH);
        displayPanel.add(display, BorderLayout.CENTER);
        backgroundLabel.add(displayPanel, BorderLayout.NORTH);

        buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.weightx = 1;
        gbc.weighty = 1;

        String[][] layout = {
            {"±", "^", "√", "%"},
            {"C", "DEL", "/", "*"},
            {"7", "8", "9", "-"},
            {"4", "5", "6", "+"},
            {"1", "2", "3", "="},
            {"0", "0", ".", "="}
        };

        for (int row = 0; row < layout.length; row++) {
            for (int col = 0; col < layout[row].length; col++) {
                String text = layout[row][col];
                if (!text.isEmpty()) {
                    JButton button = new JButton(text);
                    button.setForeground(Color.WHITE);
                    button.setOpaque(true);
                    button.setFocusable(false);
                    
                    
                    if (text.matches("[0-9.]")) {
                        button.setBackground(Color.decode("#323232")); // bg color numbers & dot
                    } else {
                        button.setBackground(Color.decode("#3b3b3b")); // bg color operators
                    }

                    button.addActionListener(this);
                    allButtons.add(button);

                    gbc.gridx = col;
                    gbc.gridy = row;
                    gbc.gridwidth = 1;
                    gbc.gridheight = 1;

                    if (text.equals("0") && row == 5 && col == 0) {
                        gbc.gridwidth = 2;
                    }
                    if (text.equals("=") && row == 4 && col == 3) {
                        gbc.gridheight = 2;
                    }

                    buttonPanel.add(button, gbc);

                    if (text.equals("0")) col++; // two column 0
                }
            }
        }

        backgroundLabel.add(buttonPanel, BorderLayout.CENTER);

        // Keyboard input support
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                handleKeyboardInput(e.getKeyChar());
            }
        });
        setFocusable(true);

        setVisible(true);
    }

    private void handleKeyboardInput(char keyChar) {
        if (Character.isDigit(keyChar) || keyChar == '.') {
            handleInput(String.valueOf(keyChar));
        } else if (keyChar == '+') handleInput("+");
        else if (keyChar == '-') handleInput("-");
        else if (keyChar == '*') handleInput("*");
        else if (keyChar == '/') handleInput("/");
        else if (keyChar == '%') handleInput("%");
        else if (keyChar == '^') handleInput("^");
        else if (keyChar == '\n' || keyChar == '=') handleInput("=");
        else if (keyChar == 'c' || keyChar == 'C') handleInput("C");
        else if (keyChar == '\b') handleInput("DEL");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        handleInput(e.getActionCommand());
    }

    private void handleInput(String command) {
        switch (command) {
            case "C":
                currentInput = "";
                result = 0;
                lastOperator = "";
                history.setText("");
                updateDisplay("0");
                checkSpecialValues("reset");
                break;
            case "DEL":
                if (!currentInput.isEmpty()) {
                    currentInput = currentInput.substring(0, currentInput.length() - 1);
                    updateDisplay(currentInput.isEmpty() ? "0" : currentInput);
                }
                break;
            case "=":
                if (!currentInput.isEmpty()) {
                    calculate(Double.parseDouble(currentInput));
                    history.append(currentInput + " =\n");
                    currentInput = Double.toString(result);
                    updateDisplay(currentInput);
                    checkSpecialValues(currentInput);
                    startNew = true;
                    lastOperator = "";
                }
                break;
            case "+": case "-": case "*": case "/": case "%": case "^":
                if (!currentInput.isEmpty()) {
                    calculate(Double.parseDouble(currentInput));
                    lastOperator = command;
                    history.append(currentInput + " " + command + " ");
                    currentInput = "";
                    startNew = false;
                }
                break;
            case "√":
                if (!currentInput.isEmpty()) {
                    result = Math.sqrt(Double.parseDouble(currentInput));
                    currentInput = Double.toString(result);
                    updateDisplay(currentInput);
                    checkSpecialValues(currentInput);
                    startNew = true;
                }
                break;
            case "±":
                if (!currentInput.isEmpty()) {
                    if (currentInput.startsWith("-"))
                        currentInput = currentInput.substring(1);
                    else
                        currentInput = "-" + currentInput;
                    updateDisplay(currentInput);
                }
                break;
            default:
                if (startNew) {
                    currentInput = command;
                    startNew = false;
                } else {
                    currentInput += command;
                }
                updateDisplay(currentInput);
                break;
        }
    }

    private void calculate(double value) {
        switch (lastOperator) {
            case "":
                result = value;
                break;
            case "+":
                result += value;
                break;
            case "-":
                result -= value;
                break;
            case "*":
                result *= value;
                break;
            case "/":
                result /= value;
                break;
            case "%":
                result %= value;
                break;
            case "^":
                result = Math.pow(result, value);
                break;
        }
    }

    private void updateDisplay(String text) {
        display.setText(text);
    }

    private void setButtonOpacity(float alpha) {
        for (JButton btn : allButtons) {
            Color bg = btn.getBackground();
            btn.setBackground(new Color(bg.getRed(), bg.getGreen(), bg.getBlue(), (int)(alpha * 255)));
        }
    }

    private void checkSpecialValues(String val) {
        if (val.equals("reset")) {
            backgroundLabel.setIcon(null);
            setButtonOpacity(1.0f);
            return;
        }

        String cleaned = val.replaceAll("\\.0*$", "");
        String gifFile = gifTriggers.get(cleaned);
        if (gifFile == null) {
            try {
                int intVal = (int) Double.parseDouble(val);
                gifFile = gifTriggers.get(String.valueOf(intVal));
            } catch (NumberFormatException ignored) {}
        }

        if (gifFile != null) {
            java.io.File file = new java.io.File(gifFile);
            if (file.exists()) {
                backgroundLabel.setIcon(new ImageIcon(file.getAbsolutePath()));
                setButtonOpacity(0.6f);
            } else {
                backgroundLabel.setIcon(null);
                setButtonOpacity(1.0f);
            }
        } else {
            backgroundLabel.setIcon(null);
            setButtonOpacity(1.0f);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FinalLabProjectCalculator::new);
    }
}
