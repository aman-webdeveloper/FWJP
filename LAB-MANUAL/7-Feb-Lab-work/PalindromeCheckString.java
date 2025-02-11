import java.util.Scanner;

public class PalindromeCheckString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = scanner.nextLine(); 
        scanner.close();
        
        String reverse = new StringBuilder(original).reverse().toString(); 
      
        if (original.equalsIgnoreCase(reverse)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}
