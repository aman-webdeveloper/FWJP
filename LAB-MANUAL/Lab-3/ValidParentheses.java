import java.util.Stack;
import java.util.Scanner;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If it's a closing bracket, check if it matches the last opened bracket
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // Stack should be empty if all brackets are matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string of parentheses: ");
        String input = sc.nextLine();

        // Checking validity
        if (isValid(input))
            System.out.println("Output: true (Valid Parentheses)");
        else
            System.out.println("Output: false (Invalid Parentheses)");

        sc.close();
    }
}
