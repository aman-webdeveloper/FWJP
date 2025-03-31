import java.util.Scanner;
import java.util.ArrayList;

class Stack {
    private ArrayList<Integer> stackList;

    public Stack() {
        stackList = new ArrayList<>();
    }

    // Push operation
    public void push(int value) {
        stackList.add(value);
        System.out.println("Pushed: " + value);
    }

    // Pop operation
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to pop.");
        } else {
            int removedElement = stackList.remove(stackList.size() - 1);
            System.out.println("Popped: " + removedElement);
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return stackList.isEmpty();
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose operation: 1. Push  2. Pop  3. Is Empty  4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
