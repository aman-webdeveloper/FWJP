import java.util.Scanner;

public class EmployeeSalaryCalculator {

    // Method to calculate gross salary
    public static void calculateGrossSalary(double basicSalary) {
        double hra, da, grossSalary;

        // Applying the given conditions
        if (basicSalary > 15000) {
            hra = 0.20 * basicSalary;  // HRA = 20% of basic salary
            da = 0.60 * basicSalary;   // DA = 60% of basic salary
        } else {
            hra = 3000;                // Fixed HRA = 3000
            da = 0.70 * basicSalary;   // DA = 70% of basic salary
        }

        // Gross Salary Calculation
        grossSalary = basicSalary + hra + da;

        // Display the salary details
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Loop to process multiple employees
        while (true) {
            System.out.print("Enter Basic Salary (-1 to exit): ");
            double basicSalary = sc.nextDouble();

            // Exit the loop if user enters -1
            if (basicSalary == -1) {
                System.out.println("Exiting the program...");
                break;
            }

            // Call method to calculate and print salary details
            calculateGrossSalary(basicSalary);
        }

        sc.close();
    }
}
