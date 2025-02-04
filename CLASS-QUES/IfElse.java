import java.util.Scanner;

public class IfElse {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd:");

        int num = sc.nextInt(); 

        if (num == 0) {
            System.out.println("The number is 0");
        } else if (num % 2 == 0) { 
            System.out.println("The number is EVEN");
        } else {
            System.out.println("The number is ODD");
        }

        sc.close(); 
    }
}
