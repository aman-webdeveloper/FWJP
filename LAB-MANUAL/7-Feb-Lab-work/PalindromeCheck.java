import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num; 
        int reverse = 0;

        
        for (; num > 0; num /= 10) {
            reverse = reverse * 10 + (num % 10);
        } 

        if (original == reverse) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
        
        scanner.close();
    }
}
