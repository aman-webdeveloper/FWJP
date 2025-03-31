package employee;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.sql.*;
import javax.swing.border.EmptyBorder;

public class Registration extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField nameField, emailField, addressField, countryField, phoneField;
    private JPasswordField passwordField, confirmPasswordField;
    private JRadioButton maleButton, femaleButton;
    private JComboBox<String> stateBox;
    private ButtonGroup genderGroup;
    private JButton submitButton, clearButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Registration frame = new Registration();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Registration() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 555, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel titleLabel = new JLabel("New Account Registration");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(120, 10, 315, 35);
        contentPane.add(titleLabel);

        createLabel("Name:", 22, 56);
        createLabel("Email Address:", 22, 92);
        createLabel("Create Password:", 22, 139);
        createLabel("Confirm Password:", 22, 176);
        createLabel("Address:", 22, 223);
        createLabel("Gender:", 22, 257);
        createLabel("State:", 22, 294);
        createLabel("Country:", 22, 328);
        createLabel("Phone No:", 22, 357);

        nameField = createTextField(177, 49);
        emailField = createTextField(177, 89);
        passwordField = new JPasswordField();
        passwordField.setBounds(177, 137, 305, 29);
        contentPane.add(passwordField);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(177, 176, 305, 29);
        contentPane.add(confirmPasswordField);

        addressField = createTextField(177, 214);
        countryField = createTextField(177, 317);
        phoneField = createTextField(177, 356);

        maleButton = new JRadioButton("Male");
        maleButton.setBounds(193, 257, 109, 23);
        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(349, 257, 109, 23);
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        contentPane.add(maleButton);
        contentPane.add(femaleButton);

        String[] states = { "Select states","Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", 
        	    "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", 
        	    "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", 
        	    "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", 
        	    "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", 
        	    "Uttar Pradesh", "Uttarakhand", "West Bengal"  };
        stateBox = new JComboBox<>(states);
        stateBox.setBounds(177, 287, 305, 25);
        contentPane.add(stateBox);

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 15));
        submitButton.setBounds(177, 406, 139, 29);
        submitButton.addActionListener(e -> registerUser(e));  // FIXED LAMBDA
        contentPane.add(submitButton);

        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial", Font.BOLD, 15));
        clearButton.setBounds(341, 406, 141, 29);
        clearButton.addActionListener(e -> clearForm(e));  // FIXED LAMBDA
        contentPane.add(clearButton);
    }

    private void createLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setBounds(x, y, 150, 26);
        contentPane.add(label);
    }

    private JTextField createTextField(int x, int y) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, 305, 29);
        contentPane.add(textField);
        return textField;
    }

    private void registerUser(ActionEvent e) {  // FIXED METHOD SIGNATURE
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());
        String address = addressField.getText();
        String gender = maleButton.isSelected() ? "Male" : (femaleButton.isSelected() ? "Female" : "");
        String state = (String) stateBox.getSelectedItem();
        String country = countryField.getText();
        String phone = phoneField.getText();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || address.isEmpty() || gender.isEmpty() || country.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!phone.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Invalid phone number!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationdb", "root", "2109")) {
            String query = "INSERT INTO users (name, email, password, address, gender, state, country, phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.setString(4, address);
            stmt.setString(5, gender);
            stmt.setString(6, state);
            stmt.setString(7, country);
            stmt.setString(8, phone);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registration Successful!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearForm(ActionEvent e) {
        nameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        addressField.setText("");
        countryField.setText("");
        phoneField.setText("");
        genderGroup.clearSelection();
        stateBox.setSelectedIndex(0);
    }
}
