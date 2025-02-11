import java.util.Scanner;

public class NumberOperations {
    
    //  prime number
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    // Armstrong number
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }

    // number is even or not
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check Prime Number");
            System.out.println("2. Check Armstrong Number");
            System.out.println("3. Check Even Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int primeNum = sc.nextInt();
                    System.out.println(primeNum + " is " + (isPrime(primeNum) ? "a Prime Number" : "not a Prime Number"));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int armNum = sc.nextInt();
                    System.out.println(armNum + " is " + (isArmstrong(armNum) ? "an Armstrong Number" : "not an Armstrong Number"));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int evenNum = sc.nextInt();
                    System.out.println(evenNum + " is " + (isEven(evenNum) ? "an Even Number" : "an Odd Number"));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}
