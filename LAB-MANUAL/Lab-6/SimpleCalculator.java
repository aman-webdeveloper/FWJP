import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Error: Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Error: Invalid operator! Please use +, -, *, or /.");
            }

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) { 
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) { 
            System.out.println(e.getMessage());
        } catch (Exception e) { 
            System.out.println("Error: Invalid input! Please enter numbers correctly.");
        } finally {
            sc.close(); 
        }
    }
}
