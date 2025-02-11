import java.util.Scanner;

public class ArmstrongDemo 
{
    public int countDigits(int num)  // num=123
    {
        int digits=0; // digits =0
        while(num!=0) // 0 != 0 false
        {
            digits++; // digits = 0+1=1 +1= 2 +1=3
            num/=10;  // num = 123/10; num = 12/10=1/10= 0
        }
        return digits; // 3
    }
    
    public int calculatePower(int n, int p)
    {
        int result=1;
        for(int i=1;i<=p;i++)
        {
            result*=n; // result=result*n
        }
        return result;
    }
    
    public boolean isArmstrong(int num) {
        int countDigits = countDigits(num);
        int sum = 0;
        for(int x=num; x!=0; x/=10) {
            int digit = x % 10;
            sum += calculatePower(digit, countDigits);
        }
        return sum == num;
    }
    
    public static void main(String[] args) 
    {
        ArmstrongDemo ad = new ArmstrongDemo();
        Scanner sc = new Scanner(System.in);
        
        // Check a single number for Armstrong
        System.out.println("Enter a number to check if it is Armstrong: ");
        int num = sc.nextInt();
        if (ad.isArmstrong(num))
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

            //range code starting form here

        
        System.out.println("Enter a range (start and end) : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Arsmstrong numbers in range from : "+  start + "to "+  end + " are : ");
        for(int i=start; i<=end; i++){
            if(ad.isArmstrong(i)){
                System.out.println(i);
            }
        }

        }
    
}
