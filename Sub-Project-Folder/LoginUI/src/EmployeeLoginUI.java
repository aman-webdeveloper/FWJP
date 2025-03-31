
import javax.swing.*;

public class EmployeeLoginUI extends JFrame {
    public EmployeeLoginUI() {
        // Frame Properties
        setTitle("Employee Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Logo Image
        ImageIcon logo = new ImageIcon("login.png"); // Change path if needed
        JLabel logoLabel = new JLabel(logo);
        logoLabel.setBounds(140, 10, 120, 60);
        add(logoLabel);

        // User ID Label & Field
        JLabel userLabel = new JLabel("Enter User ID");
        userLabel.setBounds(50, 90, 120, 25);
        add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(180, 90, 150, 25);
        add(userField);

        // Password Label & Field
        JLabel passLabel = new JLabel("Enter Password");
        passLabel.setBounds(50, 130, 120, 25);
        add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(180, 130, 150, 25);
        add(passField);

        // Buttons
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 180, 90, 30);
        add(loginButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(210, 180, 90, 30);
        add(resetButton);

        // Making UI visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeLoginUI();
    }
}
