import java.util.Scanner;

class OrDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Check whether this char is in lowercase
        // ASCII range for lowercase: 97-122
        boolean lower = ch >= 97 && ch <= 122;
        System.out.println(ch + " is in lower case: " + lower);

        // Check whether this char is in uppercase
        // ASCII range for uppercase: 65-90
        boolean upper = ch >= 65 && ch <= 90;
        System.out.println(ch + " is in upper case: " + upper);

        // Check if it is an alphabet or not
        boolean result = lower || upper;
        System.out.println(ch + " is an Alphabet or not: " + result);

        sc.close();
    }
}
