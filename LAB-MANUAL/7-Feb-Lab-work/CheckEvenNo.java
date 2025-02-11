
import java.util.Scanner;

public class CheckEvenNo{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting value : ");
        int startpoint = scanner.nextInt();

        System.out.print("Enter the ending value : ");
        int endpoint = scanner.nextInt();

        System.out.println("Even numbers from " + startpoint + " to "  + endpoint + ":-" );
        for(int i = startpoint; i<=endpoint; i++){
            if(i% 2 == 0){
                System.out.println(i + "  ");
            }

        }
        scanner.close();

    }
}
