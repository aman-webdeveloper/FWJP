import java.util.Scanner;

public class Eligiblity {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int year = sc.nextInt();

        String eligility =( year >= 18) ? "Eligible" : "Not eligible";

        System.out.println("Eligibilty : " +eligility);
    }


    
}
