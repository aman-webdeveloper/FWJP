package Package1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.xwpf.usermodel.*;

public class Readword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word file name (with .docx extension): ");
        String filename = sc.nextLine();
        sc.close();

        try {
            // Open the Word file
            FileInputStream fis = new FileInputStream(filename);
            XWPFDocument document = new XWPFDocument(fis);

            // Read paragraphs
            for (XWPFParagraph paragraph : document.getParagraphs()) {
                System.out.println(paragraph.getText());
            }

            // Close resources
            document.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
