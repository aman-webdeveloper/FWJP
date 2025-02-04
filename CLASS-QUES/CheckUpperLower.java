
import java.util.Scanner;

public class CheckUpperLower {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");

        char ch = sc.next().charAt(0); 

        if ((ch >= 'a'  && ch <= 'z')) {
            System.out.println("The character is LowerCase");
        } else if ((ch >= 'A'  && ch <= 'Z')) { 
            System.out.println("The character is UPPERCASE");
        } else {
            System.out.println("character is a special charcter or a numeric value ");
        }

        sc.close(); 
    }
}

