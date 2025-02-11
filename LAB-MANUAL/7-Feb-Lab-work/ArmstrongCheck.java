import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num; 
        int sum = 0, digit;

       
        do {
            digit = num % 10; 
            sum += (digit * digit * digit); 
            num /= 10; 
        } while (num > 0);

       
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}
