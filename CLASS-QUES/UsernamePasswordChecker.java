
import java.util.Scanner;

public class UsernamePasswordChecker  {

    public static void main(String args[]) {

    String correctUserID = "Ak2109";
    String correctPassword = "AK@2003";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a UserId:");
        String UserID = sc.nextLine();


        System.out.print("Enter a Password:");
        String Password = sc.nextLine();

        if(UserID.equals(correctUserID) && Password.equals(correctPassword)){
            System.out.println("Login Successful ! Welcome Aman Kumar   & your userID :   " +  UserID);
        }
        else{
            System.out.println(" Warning !!! Invalid UserId or Password. Please try again later !!!");
        }


        
        sc.close(); 
    }
}
