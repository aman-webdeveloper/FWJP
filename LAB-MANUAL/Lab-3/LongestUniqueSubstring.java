import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueSubstring {
    public static int findLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Finding the longest substring length
        int result = findLongestSubstring(input);

        System.out.println("Length of longest substring without repeating characters: " + result);

        sc.close();
    }
}
