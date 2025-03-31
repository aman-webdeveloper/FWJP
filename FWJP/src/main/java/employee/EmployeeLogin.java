package employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeLogin {
    private JFrame frmEmployeeLogin;
    private JTextField textField;
    private JPasswordField passwordField;
    
    // Employee data
    String userid[] = {"A101", "K102", "S103", "V104", "N105"};
    String passwords[] = {"1234", "3344", "8433", "4564", "4566"};
    String names[] = {"Aman", "Karan", "Sanjay", "Varun", "Neelam"};

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                EmployeeLogin window = new EmployeeLogin();
                window.frmEmployeeLogin.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public EmployeeLogin() {
        initialize();
    }

    private void initialize() {
        frmEmployeeLogin = new JFrame();
        frmEmployeeLogin.setTitle("Employee Login");
        frmEmployeeLogin.getContentPane().setBackground(new Color(192, 192, 192));
        frmEmployeeLogin.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Enter User ID");
        lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 15));
        lblNewLabel.setBounds(10, 109, 111, 33);
        frmEmployeeLogin.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Enter Password");
        lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 15));
        lblNewLabel_1.setBounds(10, 164, 143, 20);
        frmEmployeeLogin.getContentPane().add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(160, 105, 212, 37);
        frmEmployeeLogin.getContentPane().add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(160, 153, 212, 42);
        frmEmployeeLogin.getContentPane().add(passwordField);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.setFont(new Font("Sitka Small", Font.BOLD, 15));
        btnLogin.setBounds(60, 206, 111, 31);
        frmEmployeeLogin.getContentPane().add(btnLogin);

        JButton btnReset = new JButton("Reset");
        btnReset.setFont(new Font("Sitka Small", Font.BOLD, 15));
        btnReset.setBounds(217, 206, 119, 31);
        frmEmployeeLogin.getContentPane().add(btnReset);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\AMAN\\OneDrive\\Desktop\\images.jpeg"));
        lblNewLabel_2.setBounds(144, 11, 97, 72);
        frmEmployeeLogin.getContentPane().add(lblNewLabel_2);

        frmEmployeeLogin.setBounds(100, 100, 450, 300);
        frmEmployeeLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // **Login Button Action**
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredUser = textField.getText();
                String enteredPass = new String(passwordField.getPassword());

                boolean isValid = false;
                String userName = "";

                for (int i = 0; i < userid.length; i++) {
                    if (userid[i].equals(enteredUser) && passwords[i].equals(enteredPass)) {
                        isValid = true;
                        userName = names[i];
                        break;
                    }
                }

                if (isValid) {
                    JOptionPane.showMessageDialog(frmEmployeeLogin, "Login Successful! Welcome " + userName);
                } else {
                    JOptionPane.showMessageDialog(frmEmployeeLogin, "Invalid User ID or Password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // **Reset Button Action**
        btnReset.addActionListener(e -> {
            textField.setText("");
            passwordField.setText("");
        });
    }
}
