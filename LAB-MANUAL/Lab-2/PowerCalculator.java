import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base number: ");
        int base = scanner.nextInt();
        
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();
        
        scanner.close();
        
        int result = 1, i = 0; 
        
        
        do {
            result *= base; 
            i++; 
        } while (i < exponent); 
        
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
