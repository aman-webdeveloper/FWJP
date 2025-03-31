package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/registrationdb"; // Replace with your DB name
    private static final String USER = "root"; // Replace with your MySQL username
    private static final String PASSWORD = "2109"; // Replace with your MySQL password

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL driver
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database Connected Successfully!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("❌ Database Connection Failed!");
        }
        return conn;
    }

    public static void insertData(String name, String address, String email) { // ✅ Fix: Removed extra '{'
        Connection conn = getConnection();
        if (conn != null) {
            String query = "INSERT INTO users (name, address, email) VALUES (?, ?, ?)"; // Replace with your table
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, name);
                stmt.setString(2, address);
                stmt.setString(3, email);
                int rows = stmt.executeUpdate();
                if (rows > 0) {
                    System.out.println("✅ Data Inserted Successfully!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("❌ Data Insertion Failed!");
            }
        }
    }

    public static void main(String[] args) {
        // Test Connection
        getConnection();

        // Insert Sample Data
        insertData("Aman Kumar", "SEC-10", "aman@example.com"); // ✅ Now it matches the correct parameters
    }
}
