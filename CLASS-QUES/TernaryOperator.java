import java.util.Scanner;

public class TernaryOperator {

    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your two values :  ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a>b ? "Ais greater  " : " B is greator ");

        int result = a>b ? a-b : b-a;

        System.out.println("Result " + result);



        
    }

    
}
