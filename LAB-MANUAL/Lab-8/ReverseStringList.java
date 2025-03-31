import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");
        words.add("JavaScript");

        Collections.reverse(words);

        System.out.println("Reversed List: " + words);
    }
}
