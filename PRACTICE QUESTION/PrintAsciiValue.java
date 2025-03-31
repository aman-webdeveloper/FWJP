
import java.util.Scanner;

class PrintAsciiValue {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // Reads the first character

        // Get the ASCII value of the character
        int asciiValue = (int) ch;

        // Print the ASCII value
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

        // Close the scanner
        scanner.close();
    }
}

