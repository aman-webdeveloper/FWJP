public class Rectangle {
    // Member variables for width and height of type double
    double width;
    double height;

    // Enum Color with values RED, GREEN, BLUE
    public enum Color {
        RED, GREEN, BLUE;
    }

    // Member variable boxColor of type Color
    Color boxColor;

    // Main method
    public static void main(String[] args) {
        // Print the enum value Color.BLUE
        System.out.println(Color.BLUE);

        // Optionally, you can create an instance of Rectangle and set the boxColor
        Rectangle myRectangle = new Rectangle();
        myRectangle.boxColor = Color.BLUE;
        System.out.println("The box color is: " + myRectangle.boxColor);
    }
}



