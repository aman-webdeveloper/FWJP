import java.util.Scanner;

public class CheckNumCharSpecial {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");

        char ch = sc.next().charAt(0); 

        if ((ch >= 'a'  && ch <= 'z') || (ch >= 'A'  && ch <= 'Z')) {
            System.out.println( "The character is Alphabets : " + ch);
        } else if (ch >= '0' && ch<= '9') { 
            System.out.println( "The character is number : " + ch);
        } else {
            System.out.println( "The character is Special Character : " + ch);
        }

        sc.close(); 
    }
}
