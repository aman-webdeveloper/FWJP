import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n🔢 Scientific Calculator 🔢");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Power (x^y)");
            System.out.println("6. Square Root (√x)");
            System.out.println("7. Log (ln x)");
            System.out.println("8. Log Base 10 (log10 x)");
            System.out.println("9. Sin(x)");
            System.out.println("10. Cos(x)");
            System.out.println("11. Tan(x)");
            System.out.println("12. Factorial (x!)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Addition
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble(), b = sc.nextDouble();
                    System.out.println("Result: " + (a + b));
                    break;

                case 2: // Subtraction
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + (a - b));
                    break;

                case 3: // Multiplication
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + (a * b));
                    break;

                case 4: // Division
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    if (b != 0) {
                        System.out.println("Result: " + (a / b));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case 5: // Power (x^y)
                    System.out.print("Enter base and exponent: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + Math.pow(a, b));
                    break;

                case 6: // Square Root
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    if (a >= 0) {
                        System.out.println("Result: " + Math.sqrt(a));
                    } else {
                        System.out.println("Error: Negative number!");
                    }
                    break;

                case 7: // Log (ln x)
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    if (a > 0) {
                        System.out.println("Result: " + Math.log(a));
                    } else {
                        System.out.println("Error: Logarithm of non-positive number!");
                    }
                    break;

                case 8: // Log Base 10
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    if (a > 0) {
                        System.out.println("Result: " + Math.log10(a));
                    } else {
                        System.out.println("Error: Logarithm of non-positive number!");
                    }
                    break;

                case 9: // Sin(x)
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Math.sin(Math.toRadians(a)));
                    break;

                case 10: // Cos(x)
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Math.cos(Math.toRadians(a)));
                    break;

                case 11: // Tan(x)
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    if (a % 90 == 0 && (a / 90) % 2 != 0) {
                        System.out.println("Error: Undefined value (tan 90°)");
                    } else {
                        System.out.println("Result: " + Math.tan(Math.toRadians(a)));
                    }
                    break;

                case 12: // Factorial (x!)
                    System.out.print("Enter a positive integer: ");
                    int n = sc.nextInt();
                    if (n >= 0) {
                        System.out.println("Result: " + factorial(n));
                    } else {
                        System.out.println("Error: Factorial of a negative number doesn't exist!");
                    }
                    break;

                case 0:
                    System.out.println("Exiting Calculator... 🚀");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }

    // Function to calculate factorial
    public static long factorial(int num) {
        if (num == 0 || num == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
