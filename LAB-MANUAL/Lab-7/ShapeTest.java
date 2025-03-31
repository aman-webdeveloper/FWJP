import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    abstract void calculateArea();
}

// Circle class inheriting Shape
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding calculateArea() method
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Rectangle class inheriting Shape
class Rectangle extends Shape {
    double length, width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding calculateArea() method
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for circle
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);
        circle.calculateArea();

        // User input for rectangle
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();
        Shape rectangle = new Rectangle(length, width);
        rectangle.calculateArea();

        sc.close();
    }
}
