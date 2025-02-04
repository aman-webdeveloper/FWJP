import java.util.Scanner;

class RelationalDemo{

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter two Values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("A is greater than B : "+(a>b));
        System.out.println("A is graeter than equals to B : "+(a>=b));
        System.out.println("A is less than B : "+(a<b));
        System.out.println("A is less than or equal to B : "+(a<=b));
        System.out.println("A is equal to B : " + (a==b));
        System.out.println("A is not eual to B : " + (a!=b));


        
    }


}