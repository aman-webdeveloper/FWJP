import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter your password: ");
        String password = scanner.nextLine(); 
        scanner.close(); 

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

       
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpperCase = true; 
            else if (Character.isLowerCase(ch)) hasLowerCase = true; 
            else if (Character.isDigit(ch)) hasDigit = true; 
            else hasSpecialChar = true; 
        }

        
        if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
            System.out.println("Password is Strong");
        } else {
            System.out.println("Weak Password ❌. It must contain:");
            if (!hasUpperCase) System.out.println("- At least one UPPERCASE letter (A-Z)");
            if (!hasLowerCase) System.out.println("- At least one LOWERCASE letter (a-z)");
            if (!hasDigit) System.out.println("- At least one NUMBER (0-9)");
            if (!hasSpecialChar) System.out.println("- At least one SPECIAL character (!@#$%^&*)");
        }
    }
}
