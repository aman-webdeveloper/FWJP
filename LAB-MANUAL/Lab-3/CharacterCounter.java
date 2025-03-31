import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Counters for different character types
        int lower = 0, upper = 0, numbers = 0, special = 0;

        // Loop through each character
        for (char ch : input.toCharArray()) {
            if (Character.isLowerCase(ch)) 
                lower++;
            else if (Character.isUpperCase(ch)) 
                upper++;
            else if (Character.isDigit(ch)) 
                numbers++;
            else 
                special++;
        }

        // Display the counts
        System.out.println("Lowercase Letters: " + lower);
        System.out.println("Uppercase Letters: " + upper);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special Characters: " + special);

        sc.close();
    }
}
