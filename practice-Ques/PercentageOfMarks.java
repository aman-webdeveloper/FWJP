import java.util.Scanner;

public class PercentageOfMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter obtained marks: ");
        double obtainedMarks = scanner.nextDouble();
        System.out.print("Enter total marks: ");
        double totalMarks = scanner.nextDouble();
        double percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage = " + percentage + "%");
        scanner.close();
    }
}
