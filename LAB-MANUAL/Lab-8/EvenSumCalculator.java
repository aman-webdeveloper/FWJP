import java.util.ArrayList;
import java.util.List;

public class EvenSumCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(8);
        numbers.add(23);
        numbers.add(42);

        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
