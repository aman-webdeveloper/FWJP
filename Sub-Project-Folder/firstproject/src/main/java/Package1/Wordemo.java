package Package1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Wordemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String filename = sc.nextLine() + ".docx";  // Ensure it has a .docx extension

        XWPFDocument doc = new XWPFDocument();
        FileOutputStream fos = new FileOutputStream(filename);

        // Creating a paragraph in the Word document
        XWPFParagraph para = doc.createParagraph();
        XWPFRun run = para.createRun();
        run.setText("Hello! This is just a test for a Word file.");
        run.setBold(true);
        run.setFontSize(20);

        // Writing document to file
        doc.write(fos);
        fos.close();
        doc.close();
        sc.close();

        System.out.println("File created successfully: " + filename);
    }
}