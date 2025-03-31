package Package1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class SaveImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter image file path: ");
        String inputPath = sc.nextLine(); // User input for image file path
        
        System.out.print("Enter destination file name (with extension like output.jpg): ");
        String outputPath = sc.nextLine(); // User input for saving file name
        
        sc.close();
        
        try {
            // Read the image file
            File inputFile = new File(inputPath);
            BufferedImage image = ImageIO.read(inputFile);
            
            if (image != null) {
                // Save the image to a new file
                File outputFile = new File(outputPath);
                String format = outputPath.substring(outputPath.lastIndexOf(".") + 1); // Extract format from filename
                ImageIO.write(image, format, outputFile);
                
                System.out.println("Image saved successfully as: " + outputPath);
            } else {
                System.out.println("Invalid image file.");
            }
        } catch (IOException e) {
            System.out.println("Error processing the image: " + e.getMessage());
        }
    }
}
