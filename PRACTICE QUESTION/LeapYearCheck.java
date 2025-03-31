import java.util.Scanner;

 class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Use ternary operator to determine leap year
        String result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
                        ? "Leap year"
                        : "Not a leap year";

        System.out.println(result);

        sc.close();
    }
}
