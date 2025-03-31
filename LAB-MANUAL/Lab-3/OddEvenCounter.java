import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0; // Counter for even numbers
        int oddCount = 0;  // Counter for odd numbers

        while (true) {
            System.out.print("Enter a number (-1 to exit): ");
            int num = sc.nextInt();

            // Exit condition
            if (num == -1) {
                System.out.println("Exiting the program...");
                break;
            }

            // Check if the number is even or odd
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print final counts
        System.out.println("\nTotal Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);

        sc.close();
    }
}
