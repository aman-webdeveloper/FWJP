import java.util.Scanner;

// Superclass Animal
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Cat inheriting Animal
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The Cat meows.");
    }
}

// Subclass Dog inheriting Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The Dog barks.");
    }
}

// Main class
public class AnimalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an animal: 1. Dog  2. Cat  3. Exit");
            int choice = sc.nextInt();

            Animal animal;
            switch (choice) {
                case 1:
                    animal = new Dog();
                    animal.makeSound();
                    break;
                case 2:
                    animal = new Cat();
                    animal.makeSound();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
