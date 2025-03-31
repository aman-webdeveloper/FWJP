import java.util.Scanner;

public class AccessStudent {
    public static void main(String[] args) {
        // Creating Student Object
        Student s1 = new Student();

        // Scanner Object for Input
        Scanner sc = new Scanner(System.in);

        // Taking Input from User
        System.out.println("Enter Roll Number: ");
        s1.setRollno(sc.nextInt());
        
        sc.nextLine(); // Consume newline left-over
        
        System.out.println("Enter Name: ");
        s1.setName(sc.nextLine());

        System.out.println("Enter Age: ");
        s1.setAge(sc.nextInt());

        System.out.println("Enter Salary: ");
        s1.setSalary(sc.nextFloat());

        System.out.println("Student Recird : \n"+s1);

        // Displaying Student Details
        s1.displayStudentDetails();

        // Closing Scanner
        sc.close();
    }
}
