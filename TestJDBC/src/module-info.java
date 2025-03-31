
public class TestJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ MySQL JDBC Driver Found!");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ MySQL JDBC Driver NOT Found! Download Required.");
        }
    }
}
