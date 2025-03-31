import java.util.Scanner;

public class ThrowDemo {
    // Method to check age and throw an exception if under 18
    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("You are allowed to vote!!");
        } else {
            throw new ArithmeticException("You are under age to vote!!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        
        try {
            int age = sc.nextInt(); // Taking age input from user
            checkAge(age); // Checking age
        } catch (ArithmeticException ae) {
            System.out.println("Error: " + ae.getMessage());
        } finally {
            sc.close(); // Closing scanner to prevent memory leaks
        }
    }
}
