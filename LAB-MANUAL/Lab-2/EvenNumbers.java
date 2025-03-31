import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i <= n; i++) {
            System.out.print((i * 2) + " ");
        }
    }
}
