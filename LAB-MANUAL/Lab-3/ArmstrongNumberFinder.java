import java.util.Scanner;

public class ArmstrongNumberFinder {
    
    // Method to count digits in a number
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Method to calculate power without Math.pow()
    public static int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = countDigits(num); // Count number of digits

        while (num > 0) {
            int digit = num % 10; // Get last digit
            sum += calculatePower(digit, digits); // Add digit^digits
            num /= 10; // Remove last digit
        }

        return sum == originalNum;
    }

    // Method to print all Armstrong numbers in a range
    public static void printArmstrongNumber(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for the range
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        // Calling the method to find Armstrong numbers
        printArmstrongNumber(start, end);
        
        sc.close();
    }
}
