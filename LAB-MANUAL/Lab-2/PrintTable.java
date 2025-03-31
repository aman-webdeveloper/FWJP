import java.util.Scanner;

class PrintTable{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :  ");

        int table =  scanner.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println( " table of " + table + " is " + table*i );
        }



    }
    
}
