// import java.util.Scanner;

// public class EmployeeBonus {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter salary: ");
//         double salary = sc.nextDouble();

//         System.out.print("Enter experience (in years): ");
//         int experience = sc.nextInt();

//         // Use ternary operator to calculate bonus
//         double bonus = (experience > 20) ? salary * 0.20 : salary * 0.10;

//         System.out.println("Bonus: " + bonus);

//         sc.close();
//     }
// }


import java.util.Scanner;

 class  EmployeeBonus {

    public static void main (String args[])

    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Salary : ");
        double salary = sc.nextDouble();

        System.out.print("Enter expiernce in (years)");
        int experience = sc.nextInt();

        //Use Ternary operator 
        // datatype variable = (condition) ? value if true : value if false ;

        double bonus = (experience > 20) ? salary * 0.20 : salary * 0.10;

        System.out.println("Bonus : " + bonus);

        sc.close();



    }



}