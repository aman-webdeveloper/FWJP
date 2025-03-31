import java.util.Scanner;

public class NumberOperations {
    
    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0) return false;
        return true;
    }

    static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = (num + "").length();
        while (temp > 0) {
            int digit = temp % 10, power = 1;
            for (int i = 0; i < digits; i++) power *= digit;
            sum += power;
            temp /= 10;
        }
        return sum == num;
    }

    static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, num;

        do {
            System.out.println("\n1. Prime  2. Armstrong  3. Fibonacci  4. Even  5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 5) break;

            System.out.print("Enter number: ");
            num = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println(num + (isPrime(num) ? " is Prime" : " is NOT Prime"));
                case 2 -> System.out.println(num + (isArmstrong(num) ? " is Armstrong" : " is NOT Armstrong"));
                case 3 -> printFibonacci(num);
                case 4 -> System.out.println(num + (num % 2 == 0 ? " is Even" : " is Odd"));
                default -> System.out.println("Invalid choice!");
            }
        } while (true);

        sc.close();
    }
}
