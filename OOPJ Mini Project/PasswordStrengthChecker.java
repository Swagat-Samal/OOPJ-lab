import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordStrengthChecker extends JFrame implements ActionListener {

    private JLabel titleLabel;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JCheckBox showPasswordBox;
    private JButton checkButton;
    private JButton clearButton;
    private JLabel strengthLabel;
    private JProgressBar strengthBar;
    private JLabel feedbackLabel;
    private JPanel criteriaPanel;
    private JLabel startCheck;
    private JLabel lengthCheck;
    private JLabel upperCheck;
    private JLabel numberCheck;
    private JLabel specialCheck;

    public PasswordStrengthChecker() {
        setTitle("Password Strength Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(true);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        final int contentWidth = 360;

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        titleLabel = new JLabel("Password Strength Checker");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel subtitleLabel = new JLabel("Check how secure your password is");
        subtitleLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        subtitleLabel.setForeground(Color.DARK_GRAY);
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        passwordLabel = new JLabel("Enter Password:");
        passwordLabel.setFont(new Font("SansSerif", Font.PLAIN, 13));
        passwordLabel.setForeground(Color.BLACK);
        passwordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        passwordField = new JPasswordField(20);
        passwordField.setFont(new Font("SansSerif", Font.PLAIN, 14));
        passwordField.setBackground(Color.WHITE);
        passwordField.setForeground(Color.BLACK);
        passwordField.setCaretColor(Color.BLACK);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        passwordField.setMaximumSize(new Dimension(contentWidth, 30));
        passwordField.setPreferredSize(new Dimension(contentWidth, 30));
        passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);
        passwordField.addActionListener(this);

        showPasswordBox = new JCheckBox("Show Password");
        showPasswordBox.setFont(new Font("SansSerif", Font.PLAIN, 12));
        showPasswordBox.setForeground(Color.BLACK);
        showPasswordBox.setBackground(Color.WHITE);
        showPasswordBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        showPasswordBox.setFocusPainted(false);

        showPasswordBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showPasswordBox.isSelected()) {
                    passwordField.setEchoChar((char) 0);
                } else {
                    passwordField.setEchoChar('*');
                }
            }
        });

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 10, 0));
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setMaximumSize(new Dimension(contentWidth, 32));
        buttonPanel.setPreferredSize(new Dimension(contentWidth, 32));
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        checkButton = new JButton("Check Strength");
        styleButton(checkButton, new Color(60, 130, 220));
        checkButton.addActionListener(this);

        clearButton = new JButton("Clear");
        styleButton(clearButton, new Color(70, 70, 90));
        clearButton.addActionListener(this);

        buttonPanel.add(checkButton);
        buttonPanel.add(clearButton);

        JLabel barLabel = new JLabel("Strength Meter:");
        barLabel.setFont(new Font("SansSerif", Font.PLAIN, 13));
        barLabel.setForeground(Color.BLACK);
        barLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        strengthBar = new JProgressBar(0, 100);
        strengthBar.setValue(0);
        strengthBar.setStringPainted(true);
        strengthBar.setPreferredSize(new Dimension(contentWidth, 18));
        strengthBar.setMaximumSize(new Dimension(contentWidth, 18));
        strengthBar.setBackground(Color.WHITE);
        strengthBar.setForeground(Color.LIGHT_GRAY);
        strengthBar.setBorderPainted(true);
        strengthBar.setAlignmentX(Component.CENTER_ALIGNMENT);

        strengthLabel = new JLabel("Strength: -");
        strengthLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        strengthLabel.setForeground(Color.BLACK);
        strengthLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        criteriaPanel = new JPanel();
        criteriaPanel.setLayout(new GridLayout(5, 1, 0, 5));
        criteriaPanel.setBackground(Color.WHITE);
        criteriaPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        criteriaPanel.setMaximumSize(new Dimension(contentWidth, 125));
        criteriaPanel.setPreferredSize(new Dimension(contentWidth, 125));
        criteriaPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        startCheck   = makeCriteriaLabel("Must start with a letter (A-Z or a-z)");
        lengthCheck  = makeCriteriaLabel("Minimum 8 characters");
        upperCheck   = makeCriteriaLabel("At least one uppercase letter (A-Z)");
        numberCheck  = makeCriteriaLabel("At least one number (0-9)");
        specialCheck = makeCriteriaLabel("At least one special character (!@#...)");

        criteriaPanel.add(startCheck);
        criteriaPanel.add(lengthCheck);
        criteriaPanel.add(upperCheck);
        criteriaPanel.add(numberCheck);
        criteriaPanel.add(specialCheck);

        feedbackLabel = new JLabel(" ");
        feedbackLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        feedbackLabel.setForeground(Color.BLACK);
        feedbackLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalStrut(4));
        mainPanel.add(subtitleLabel);
        mainPanel.add(Box.createVerticalStrut(22));
        mainPanel.add(passwordLabel);
        mainPanel.add(Box.createVerticalStrut(6));
        mainPanel.add(passwordField);
        mainPanel.add(Box.createVerticalStrut(8));
        mainPanel.add(showPasswordBox);
        mainPanel.add(Box.createVerticalStrut(14));
        mainPanel.add(buttonPanel);
        mainPanel.add(Box.createVerticalStrut(18));
        mainPanel.add(barLabel);
        mainPanel.add(Box.createVerticalStrut(6));
        mainPanel.add(strengthBar);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(strengthLabel);
        mainPanel.add(Box.createVerticalStrut(16));
        mainPanel.add(criteriaPanel);
        mainPanel.add(Box.createVerticalStrut(12));
        mainPanel.add(feedbackLabel);

        add(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == clearButton) {
            resetAll();
            return;
        }

        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        if (password.isEmpty()) {
            feedbackLabel.setText("Please enter a password first.");
            feedbackLabel.setForeground(Color.RED);
            return;
        }

        checkPasswordStrength(password);
    }

    private void checkPasswordStrength(String password) {

        boolean startsWithLetter = password.matches("^[A-Za-z].*");
        boolean hasLength = password.length() >= 8;
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{}|;':\",./<>?].*");

        updateCriteria(startCheck,   startsWithLetter, "Must start with a letter (A-Z or a-z)");
        updateCriteria(lengthCheck,  hasLength,  "Minimum 8 characters");
        updateCriteria(upperCheck,   hasUpper,   "At least one uppercase letter (A-Z)");
        updateCriteria(numberCheck,  hasNumber,  "At least one number (0-9)");
        updateCriteria(specialCheck, hasSpecial, "At least one special character (!@#...)");

        int score = 0;
        if (startsWithLetter) score++;
        if (hasLength)  score++;
        if (hasUpper)   score++;
        if (hasNumber)  score++;
        if (hasSpecial) score++;

        if (score <= 1) {
            setStrengthUI("Weak", 25,
                    new Color(220, 60, 60),
                    "Tip: Make it longer and add numbers or symbols.");

        } else if (score <= 4) {
            setStrengthUI("Medium", 60,
                    new Color(220, 160, 40),
                    "Tip: Add more variety - uppercase, numbers, and symbols!");

        } else {
            setStrengthUI("Strong", 100,
                    new Color(50, 200, 120),
                    "Great password! All security rules passed.");
        }
    }

    private void setStrengthUI(String level, int barValue, Color color, String feedback) {
        strengthLabel.setText("Strength: " + level);
        strengthLabel.setForeground(color);

        strengthBar.setValue(barValue);
        strengthBar.setForeground(color);

        feedbackLabel.setText(feedback);
        feedbackLabel.setForeground(Color.DARK_GRAY);
    }

    private void updateCriteria(JLabel label, boolean passed, String text) {
        if (passed) {
            label.setText(text + ": Pass");
            label.setForeground(new Color(0, 128, 0));
        } else {
            label.setText(text + ": Fail");
            label.setForeground(Color.RED);
        }
    }

    private void resetAll() {
        passwordField.setText("");
        showPasswordBox.setSelected(false);
        passwordField.setEchoChar('*');

        strengthLabel.setText("Strength: -");
        strengthLabel.setForeground(Color.BLACK);

        strengthBar.setValue(0);
        strengthBar.setForeground(Color.LIGHT_GRAY);

        feedbackLabel.setText(" ");

        resetCriteria(startCheck,   "Must start with a letter (A-Z or a-z)");
        resetCriteria(lengthCheck,  "Minimum 8 characters");
        resetCriteria(upperCheck,   "At least one uppercase letter (A-Z)");
        resetCriteria(numberCheck,  "At least one number (0-9)");
        resetCriteria(specialCheck, "At least one special character (!@#...)");
    }

    private void resetCriteria(JLabel label, String text) {
        label.setText(text + ": Pending");
        label.setForeground(Color.DARK_GRAY);
    }

    private JLabel makeCriteriaLabel(String text) {
        JLabel label = new JLabel(text + ": Pending");
        label.setFont(new Font("SansSerif", Font.PLAIN, 12));
        label.setForeground(Color.DARK_GRAY);
        return label;
    }

    private void styleButton(JButton btn, Color bgColor) {
        btn.setBackground(new Color(245, 245, 245));
        btn.setForeground(Color.BLACK);
        btn.setFont(new Font("SansSerif", Font.PLAIN, 12));
        btn.setFocusPainted(true);
        btn.setBorderPainted(true);
        btn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        btn.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PasswordStrengthChecker();
            }
        });
    }
}
