import java.util.Scanner;

public class PrintNEvenNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int mynum = scanner.nextInt();

        System.out.println("First numbers of "+ mynum + "Even numbers : ");
        for(int i =1; i <=mynum; i++){
            System.out.print((i*2) + " ");
        }
    }
}

