
import java.util.Scanner;

public class Charcter  {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Charcter : ");
        int year = sc.nextInt().charAt(0);

        String eligility =( year >= 18) ? "Eligible" : "Not eligible";

        System.out.println("Eligibilty : " +eligility);
    }


    
}

